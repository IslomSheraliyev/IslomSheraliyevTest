package uz.eloving.islomsheraliyev.domain.global

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

abstract class UseCase<R>(private val coroutineDispatcher: CoroutineDispatcher) {
    suspend operator fun invoke(): Result<R> =
        withContext(coroutineDispatcher) {
            runCatching { execute() }
        }

    @Throws(RuntimeException::class)
    protected abstract suspend fun execute(): R
}
