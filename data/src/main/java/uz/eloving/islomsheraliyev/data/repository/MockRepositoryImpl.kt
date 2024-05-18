package uz.eloving.islomsheraliyev.data.repository

import uz.eloving.islomsheraliyev.data.mappers.OffersMapper
import uz.eloving.islomsheraliyev.data.mappers.TicketsMapper
import uz.eloving.islomsheraliyev.data.mappers.TicketsOffersMapper
import uz.eloving.islomsheraliyev.data.remote.api.MockApi
import uz.eloving.islomsheraliyev.domain.model.offers.OffersModel
import uz.eloving.islomsheraliyev.domain.model.tickets.TicketsModel
import uz.eloving.islomsheraliyev.domain.model.tickets_offers.TicketsOffersModel
import uz.eloving.islomsheraliyev.domain.repository.MockRepository
import javax.inject.Inject

class MockRepositoryImpl @Inject constructor(
    private val api: MockApi
) : MockRepository {
    override suspend fun getOffers(): OffersModel {
        return api.getOffers().let(OffersMapper.offersModelMapper)
    }

    override suspend fun getTicketsOffers(): TicketsOffersModel {
        return api.getTicketsOffers().let(TicketsOffersMapper.ticketsOffersMapper)
    }

    override suspend fun getTickets(): TicketsModel {
        return api.getTickets().let(TicketsMapper.ticketsMapper)
    }
}