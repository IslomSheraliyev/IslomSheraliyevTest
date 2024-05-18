package uz.eloving.islomsheraliyev.domain.model.tickets_offers

import uz.eloving.islomsheraliyev.domain.model.common.PriceModel

data class TicketsOffersItemModel(
    val id: Int,
    val title: String,
    val timeRange: List<String>,
    val price: PriceModel
)