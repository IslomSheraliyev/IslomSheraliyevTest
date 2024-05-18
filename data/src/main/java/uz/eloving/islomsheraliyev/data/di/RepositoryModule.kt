package uz.eloving.islomsheraliyev.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.eloving.islomsheraliyev.data.repository.MockRepositoryImpl
import uz.eloving.islomsheraliyev.domain.repository.MockRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @[Singleton Provides]
    fun provideGameRepository(repositoryImpl: MockRepositoryImpl): MockRepository =
        repositoryImpl
}