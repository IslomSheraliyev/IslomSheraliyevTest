package uz.eloving.islomsheraliyevtest.core

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

open class BaseActivity<VB : ViewBinding>(val inflater: (LayoutInflater) -> VB) :
    AppCompatActivity() {

    lateinit var binding: VB
    val bindingSafe: VB?
        get() = if (isBindingInitialized()) binding else null

    private fun isBindingInitialized(): Boolean = ::binding.isInitialized

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = inflater(layoutInflater)
        setContentView(binding.root)
    }
}



