package uz.eloving.islomsheraliyev.data.mappers

typealias Mapper<T, R> = (T) -> R

fun Int?.or0() = this ?: 0
fun Long?.or0() = this ?: 0
fun Boolean?.orFalse() = this ?: false