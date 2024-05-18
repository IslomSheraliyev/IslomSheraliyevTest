package uz.eloving.islomsheraliyev.domain.usecases

import kotlinx.coroutines.Dispatchers
import uz.eloving.islomsheraliyev.domain.global.UseCase
import uz.eloving.islomsheraliyev.domain.model.offers.OffersModel
import uz.eloving.islomsheraliyev.domain.repository.MockRepository

class GetOffersUseCase(
    private val repository: MockRepository
) : UseCase<OffersModel>(Dispatchers.IO) {
    override suspend fun execute(): OffersModel {
        return repository.getOffers()
    }
}