package uz.eloving.islomsheraliyevtest.app

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp
import uz.eloving.islomsheraliyev.data.local.AppPreferences

@HiltAndroidApp
class App : Application() {

    companion object {
        lateinit var application: Context
    }

    override fun onCreate() {
        super.onCreate()
        application = this
        AppPreferences.init(this)
    }
}