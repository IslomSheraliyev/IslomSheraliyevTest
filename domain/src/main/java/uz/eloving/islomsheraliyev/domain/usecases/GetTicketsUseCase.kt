package uz.eloving.islomsheraliyev.domain.usecases

import kotlinx.coroutines.Dispatchers
import uz.eloving.islomsheraliyev.domain.global.UseCase
import uz.eloving.islomsheraliyev.domain.model.tickets.TicketsModel
import uz.eloving.islomsheraliyev.domain.repository.MockRepository

class GetTicketsUseCase(
    private val repository: MockRepository
) : UseCase<TicketsModel>(Dispatchers.IO) {
    override suspend fun execute(): TicketsModel {
        return repository.getTickets()
    }
}