package uz.eloving.islomsheraliyevtest.ui.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import uz.eloving.islomsheraliyevtest.R
import uz.eloving.islomsheraliyevtest.core.BaseActivity
import uz.eloving.islomsheraliyevtest.databinding.ActivityMainBinding
import uz.eloving.islomsheraliyevtest.ui.fragment.tickets.TicketsFragment

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    private val ticketsFragment = TicketsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        setCurrentFragment(ticketsFragment)
        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.ticketsFragment -> setCurrentFragment(ticketsFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container_view, fragment)
            commit()
        }
}