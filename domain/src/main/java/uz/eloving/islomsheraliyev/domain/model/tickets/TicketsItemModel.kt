package uz.eloving.islomsheraliyev.domain.model.tickets

import uz.eloving.islomsheraliyev.domain.model.common.ArrivalModel
import uz.eloving.islomsheraliyev.domain.model.common.DepartureModel
import uz.eloving.islomsheraliyev.domain.model.common.HandLuggageModel
import uz.eloving.islomsheraliyev.domain.model.common.LuggageModel
import uz.eloving.islomsheraliyev.domain.model.common.PriceModel

data class TicketsItemModel(
    val id: Long,
    val badge: String,
    val price: PriceModel,
    val providerName: String,
    val company: String,
    val departure: DepartureModel,
    val arrival: ArrivalModel,
    val hasTransfer: Boolean,
    val hasVisaTransfer: Boolean,
    val luggage: LuggageModel,
    val handLuggage: HandLuggageModel,
    val isReturnable: Boolean,
    val isExchangeable: Boolean,
)