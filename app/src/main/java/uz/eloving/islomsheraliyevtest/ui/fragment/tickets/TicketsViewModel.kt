package uz.eloving.islomsheraliyevtest.ui.fragment.tickets

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import uz.eloving.islomsheraliyev.domain.model.offers.OffersModel
import uz.eloving.islomsheraliyev.domain.usecases.GetOffersUseCase
import uz.eloving.islomsheraliyevtest.core.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class TicketsViewModel @Inject constructor(
    private val getOffersUseCase: GetOffersUseCase
) : BaseViewModel() {

    private val _offersFlow = MutableSharedFlow<OffersModel>()
    val offersFlow = _offersFlow.asSharedFlow()

    fun getOffers() = vmScope.launch {
        getOffersUseCase().onSuccess { offers ->
            _offersFlow.emit(offers)
        }.onFailure(::errorProcess)
    }
}