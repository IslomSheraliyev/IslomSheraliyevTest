package uz.eloving.islomsheraliyev.domain.usecases

import kotlinx.coroutines.Dispatchers
import uz.eloving.islomsheraliyev.domain.global.UseCase
import uz.eloving.islomsheraliyev.domain.model.tickets_offers.TicketsOffersModel
import uz.eloving.islomsheraliyev.domain.repository.MockRepository

class GetTicketsOffersUseCase(
    private val repository: MockRepository
) : UseCase<TicketsOffersModel>(Dispatchers.IO) {
    override suspend fun execute(): TicketsOffersModel {
        return repository.getTicketsOffers()
    }
}