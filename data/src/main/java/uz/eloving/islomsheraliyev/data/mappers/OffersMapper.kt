package uz.eloving.islomsheraliyev.data.mappers

import uz.eloving.islomsheraliyev.data.remote.response.offers.OffersRemoteItemModel
import uz.eloving.islomsheraliyev.data.remote.response.offers.OffersResponse
import uz.eloving.islomsheraliyev.domain.model.offers.OffersItemModel
import uz.eloving.islomsheraliyev.domain.model.offers.OffersModel

object OffersMapper {

    val offersModelMapper: Mapper<OffersResponse?, OffersModel> = { remote ->
        OffersModel(
            offers = remote?.offers?.map(offersItemModelMapper).orEmpty()
        )
    }

    private val offersItemModelMapper: Mapper<OffersRemoteItemModel?, OffersItemModel> = { remote ->
        OffersItemModel(
            id = remote?.id.or0(),
            title = remote?.title.orEmpty(),
            town = remote?.town.orEmpty(),
            price = remote?.price.let(CommonMapper.priceMapper)
        )
    }
}