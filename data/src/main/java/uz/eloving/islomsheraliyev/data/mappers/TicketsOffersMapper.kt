package uz.eloving.islomsheraliyev.data.mappers

import uz.eloving.islomsheraliyev.data.remote.response.tickets_offers.TicketsOffersRemoteItemModel
import uz.eloving.islomsheraliyev.data.remote.response.tickets_offers.TicketsOffersResponse
import uz.eloving.islomsheraliyev.domain.model.tickets_offers.TicketsOffersItemModel
import uz.eloving.islomsheraliyev.domain.model.tickets_offers.TicketsOffersModel

object TicketsOffersMapper {

    val ticketsOffersMapper: Mapper<TicketsOffersResponse?, TicketsOffersModel> = { remote ->
        TicketsOffersModel(
            ticketsOffers = remote?.tickets_offers?.map(ticketsOffersItemModelMapper).orEmpty()
        )
    }

    private val ticketsOffersItemModelMapper: Mapper<TicketsOffersRemoteItemModel?, TicketsOffersItemModel> =
        { remote ->
            TicketsOffersItemModel(
                id = remote?.id.or0(),
                title = remote?.title.orEmpty(),
                timeRange = remote?.time_range.orEmpty(),
                price = remote?.price.let(CommonMapper.priceMapper)
            )
        }
}