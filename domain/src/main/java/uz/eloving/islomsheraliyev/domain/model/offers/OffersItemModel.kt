package uz.eloving.islomsheraliyev.domain.model.offers

import uz.eloving.islomsheraliyev.domain.model.common.PriceModel

data class OffersItemModel(
    val id: Int,
    val title: String,
    val town: String,
    val price: PriceModel
)