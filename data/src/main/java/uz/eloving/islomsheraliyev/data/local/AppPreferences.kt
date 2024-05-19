package uz.eloving.islomsheraliyev.data.local

import android.content.Context
import android.content.SharedPreferences

object AppPreferences {

    private const val MOCK = "mock"

    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(MOCK, Context.MODE_PRIVATE)
    }


    var from: String
        get() = preferences.getString(::from.name, "?") ?: "?"
        set(value) {
            preferences.edit().putString(::from.name, value).apply()
        }
}