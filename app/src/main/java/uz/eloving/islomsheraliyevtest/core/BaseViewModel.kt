package uz.eloving.islomsheraliyevtest.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow

open class BaseViewModel : ViewModel() {

    private val errorOtherChannel = Channel<Throwable>(Channel.BUFFERED)
    val errorOtherFlow = errorOtherChannel.receiveAsFlow()


    private val handler = CoroutineExceptionHandler { _, exception ->
        errorProcess(exception)
    }

    val vmScope = viewModelScope + handler + Dispatchers.IO

    fun errorProcess(throwable: Throwable, f: ((t: Throwable) -> Unit)? = null) {
        viewModelScope.launch {
            errorOtherChannel.send(throwable)
            throwable.printStackTrace()
        }
    }
}