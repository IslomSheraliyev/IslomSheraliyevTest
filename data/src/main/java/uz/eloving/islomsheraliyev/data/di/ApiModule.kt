package uz.eloving.islomsheraliyev.data.di

import android.content.Context
import android.util.Log
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import uz.eloving.islomsheraliyev.data.BuildConfig
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.eloving.islomsheraliyev.data.remote.api.MockApi
import java.util.concurrent.TimeUnit
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    private const val TIME_OUT = 20L
    private const val BASE_URL = "https://run.mocky.io/v3/"

    @Qualifier
    annotation class DevApiApiRetrofit

    @[Singleton Provides]
    fun provideGson() = Gson()

    @[Singleton Provides]
    fun provideGsonConverter(gson: Gson): GsonConverterFactory = GsonConverterFactory.create(gson)

    @[Singleton Provides]
    fun provideMockApi(
        @DevApiApiRetrofit retrofit: Retrofit
    ): MockApi {
        return retrofit.create(MockApi::class.java)
    }

    @DevApiApiRetrofit
    @[Singleton Provides]
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        moshiFactory: GsonConverterFactory,
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(moshiFactory)
            .build()
    }

    @[Singleton Provides]
    fun provideOkhttpClient(
        @ApplicationContext context: Context,
    ): OkHttpClient {
        val clientBuilder = OkHttpClient.Builder()
            .connectTimeout(TIME_OUT * 3, TimeUnit.SECONDS)
            .readTimeout(TIME_OUT, TimeUnit.SECONDS)
            .writeTimeout(TIME_OUT, TimeUnit.SECONDS)


        if (BuildConfig.DEBUG) {
            val logging = HttpLoggingInterceptor {
                Log.d("RRR", "provideOkhttpClient: $it")
            }
            logging.level = HttpLoggingInterceptor.Level.BODY
            clientBuilder.addInterceptor(logging)
            clientBuilder.addInterceptor(
                ChuckerInterceptor(context)
            )
        }
        return clientBuilder.build()
    }
}