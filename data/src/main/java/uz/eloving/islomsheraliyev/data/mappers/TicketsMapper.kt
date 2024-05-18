package uz.eloving.islomsheraliyev.data.mappers

import uz.eloving.islomsheraliyev.data.remote.response.tickets.TicketsRemoteItemModel
import uz.eloving.islomsheraliyev.data.remote.response.tickets.TicketsResponse
import uz.eloving.islomsheraliyev.domain.model.tickets.TicketsItemModel
import uz.eloving.islomsheraliyev.domain.model.tickets.TicketsModel

object TicketsMapper {

    val ticketsMapper: Mapper<TicketsResponse?, TicketsModel> = { remote ->
        TicketsModel(
            tickets = remote?.tickets?.map(ticketsItemModelMapper)
        )
    }

    private val ticketsItemModelMapper: Mapper<TicketsRemoteItemModel?, TicketsItemModel> =
        { remote ->
            TicketsItemModel(
                id = remote?.id.or0(),
                badge = remote?.badge.orEmpty(),
                price = remote?.price.let(CommonMapper.priceMapper),
                providerName = remote?.provider_name.orEmpty(),
                company = remote?.company.orEmpty(),
                departure = remote?.departure.let(CommonMapper.departureMapper),
                arrival = remote?.arrival.let(CommonMapper.arrivalMapper),
                hasTransfer = remote?.has_transfer.orFalse(),
                hasVisaTransfer = remote?.has_visa_transfer.orFalse(),
                luggage = remote?.luggage.let(CommonMapper.luggageMapper),
                handLuggage = remote?.hand_luggage.let(CommonMapper.handLuggageMapper),
                isReturnable = remote?.is_returnable.orFalse(),
                isExchangeable = remote?.is_exchangable.orFalse()
            )
        }
}