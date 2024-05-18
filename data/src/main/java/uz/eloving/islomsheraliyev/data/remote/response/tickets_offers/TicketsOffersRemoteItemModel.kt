package uz.eloving.islomsheraliyev.data.remote.response.tickets_offers

import uz.eloving.islomsheraliyev.data.remote.response.common.PriceRemoteModel

data class TicketsOffersRemoteItemModel(
    val id: Int?,
    val title: String?,
    val time_range: List<String>?,
    val price: PriceRemoteModel?
)