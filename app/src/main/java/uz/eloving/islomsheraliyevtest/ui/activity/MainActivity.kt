package uz.eloving.islomsheraliyevtest.ui.activity

import android.os.Bundle
import uz.eloving.islomsheraliyevtest.core.BaseActivity
import uz.eloving.islomsheraliyevtest.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}