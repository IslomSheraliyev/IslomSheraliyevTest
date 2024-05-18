package uz.eloving.islomsheraliyev.data.remote.api

import retrofit2.http.GET
import uz.eloving.islomsheraliyev.data.constants.Offers
import uz.eloving.islomsheraliyev.data.constants.Tickets
import uz.eloving.islomsheraliyev.data.constants.TicketsOffers
import uz.eloving.islomsheraliyev.data.remote.response.offers.OffersResponse
import uz.eloving.islomsheraliyev.data.remote.response.tickets.TicketsResponse
import uz.eloving.islomsheraliyev.data.remote.response.tickets_offers.TicketsOffersResponse

interface MockApi {

    @GET(Offers.BASE)
    suspend fun getOffers(): OffersResponse

    @GET(TicketsOffers.BASE)
    suspend fun getTicketsOffers(): TicketsOffersResponse

    @GET(Tickets.BASE)
    suspend fun getTickets(): TicketsResponse
}