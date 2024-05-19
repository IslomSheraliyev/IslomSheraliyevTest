package uz.eloving.islomsheraliyevtest.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager


typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

fun DialogFragment.singleShow(
    fragmentManager: FragmentManager,
    tag: String = this::class.java.name
) {
    val fragment: Fragment? = fragmentManager.findFragmentByTag(tag)
    if (fragment is DialogFragment) return
    if (isAdded.not()) show(fragmentManager, tag)
}