package uz.eloving.islomsheraliyev.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.eloving.islomsheraliyev.domain.repository.MockRepository
import uz.eloving.islomsheraliyev.domain.usecases.GetOffersUseCase
import uz.eloving.islomsheraliyev.domain.usecases.GetTicketsOffersUseCase
import uz.eloving.islomsheraliyev.domain.usecases.GetTicketsUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCasesModule {
    @[Singleton Provides]
    fun provideGetOffersUseCase(repository: MockRepository) =
        GetOffersUseCase(repository)

    @[Singleton Provides]
    fun provideGetTicketsOffersUseCase(repository: MockRepository) =
        GetTicketsOffersUseCase(repository)

    @[Singleton Provides]
    fun provideGetTicketsUseCase(repository: MockRepository) =
        GetTicketsUseCase(repository)

}