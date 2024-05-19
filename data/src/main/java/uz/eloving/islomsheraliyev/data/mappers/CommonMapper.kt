package uz.eloving.islomsheraliyev.data.mappers

import uz.eloving.islomsheraliyev.data.remote.response.common.ArrivalRemoteModel
import uz.eloving.islomsheraliyev.data.remote.response.common.DepartureRemoteModel
import uz.eloving.islomsheraliyev.data.remote.response.common.HandLuggageRemoteModel
import uz.eloving.islomsheraliyev.data.remote.response.common.LuggageRemoteModel
import uz.eloving.islomsheraliyev.data.remote.response.common.PriceRemoteModel
import uz.eloving.islomsheraliyev.domain.model.common.ArrivalModel
import uz.eloving.islomsheraliyev.domain.model.common.DepartureModel
import uz.eloving.islomsheraliyev.domain.model.common.HandLuggageModel
import uz.eloving.islomsheraliyev.domain.model.common.LuggageModel
import uz.eloving.islomsheraliyev.domain.model.common.PriceModel

object CommonMapper {

    val priceMapper: Mapper<PriceRemoteModel?, PriceModel> = { remote ->
        PriceModel(
            value = remote?.value.or0()
        )
    }

    val departureMapper: Mapper<DepartureRemoteModel?, DepartureModel> = { remote ->
        DepartureModel(
            town = remote?.town.orEmpty(),
            date = remote?.date.orEmpty(),
            airport = remote?.airport.orEmpty()
        )
    }

    val arrivalMapper: Mapper<ArrivalRemoteModel?, ArrivalModel> = { remote ->
        ArrivalModel(
            town = remote?.town.orEmpty(),
            date = remote?.date.orEmpty(),
            airport = remote?.airport.orEmpty()
        )
    }

    val luggageMapper: Mapper<LuggageRemoteModel?, LuggageModel> = { remote ->
        LuggageModel(
            hasLuggage = remote?.has_luggage.orFalse(),
            price = remote?.price.let(priceMapper)
        )
    }

    val handLuggageMapper: Mapper<HandLuggageRemoteModel?, HandLuggageModel> = { remote ->
        HandLuggageModel(
            hasHandLuggage = remote?.has_hand_luggage.orFalse(),
            size = remote?.size.orEmpty()
        )
    }
}