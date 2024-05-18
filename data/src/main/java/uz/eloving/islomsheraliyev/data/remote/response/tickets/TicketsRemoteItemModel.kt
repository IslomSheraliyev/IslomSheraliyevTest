package uz.eloving.islomsheraliyev.data.remote.response.tickets

import uz.eloving.islomsheraliyev.data.remote.response.common.ArrivalRemoteModel
import uz.eloving.islomsheraliyev.data.remote.response.common.DepartureRemoteModel
import uz.eloving.islomsheraliyev.data.remote.response.common.HandLuggageRemoteModel
import uz.eloving.islomsheraliyev.data.remote.response.common.LuggageRemoteModel
import uz.eloving.islomsheraliyev.data.remote.response.common.PriceRemoteModel

data class TicketsRemoteItemModel(
    val id: Long?,
    val badge: String?,
    val price: PriceRemoteModel?,
    val provider_name: String?,
    val company: String?,
    val departure: DepartureRemoteModel?,
    val arrival: ArrivalRemoteModel?,
    val has_transfer: Boolean?,
    val has_visa_transfer: Boolean?,
    val luggage: LuggageRemoteModel?,
    val hand_luggage: HandLuggageRemoteModel?,
    val is_returnable: Boolean?,
    val is_exchangable: Boolean?,
)