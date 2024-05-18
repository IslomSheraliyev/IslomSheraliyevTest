package uz.eloving.islomsheraliyev.data.remote.response.offers

import uz.eloving.islomsheraliyev.data.remote.response.common.PriceRemoteModel

data class OffersRemoteItemModel(
    val id: Int?,
    val title: String?,
    val town: String?,
    val price: PriceRemoteModel?
)