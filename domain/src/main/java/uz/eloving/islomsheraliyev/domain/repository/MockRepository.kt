package uz.eloving.islomsheraliyev.domain.repository

import uz.eloving.islomsheraliyev.domain.model.offers.OffersModel
import uz.eloving.islomsheraliyev.domain.model.tickets.TicketsModel
import uz.eloving.islomsheraliyev.domain.model.tickets_offers.TicketsOffersModel

interface MockRepository {


    suspend fun getOffers(): OffersModel

    suspend fun getTicketsOffers(): TicketsOffersModel

    suspend fun getTickets(): TicketsModel
}