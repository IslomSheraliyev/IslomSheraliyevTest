package uz.eloving.islomsheraliyevtest.ui.bottomsheet

import uz.eloving.islomsheraliyev.data.local.AppPreferences
import uz.eloving.islomsheraliyevtest.R
import uz.eloving.islomsheraliyevtest.core.BaseBottomDialog
import uz.eloving.islomsheraliyevtest.databinding.BottomDialogSearchBinding

class SearchBottomDialog(

) :
    BaseBottomDialog<BottomDialogSearchBinding>(BottomDialogSearchBinding::inflate) {
    override fun initialize() {

        binding.cvSearch.tvFrom.text = getString(R.string.from, AppPreferences.from)
        binding.cvSearch.tvTo.text = getString(R.string.to, "?")

        binding.cityIstanbul.setOnClickListener {
            binding.cvSearch.tvTo.text = getString(R.string.to, getString(R.string.istanbul))
        }

        binding.citySochi.setOnClickListener {
            binding.cvSearch.tvTo.text = getString(R.string.to, getString(R.string.sochi))
        }

        binding.cityPxuket.setOnClickListener {
            binding.cvSearch.tvTo.text = getString(R.string.to, getString(R.string.pxuket))
        }

        binding.cvSearch.btnClear.setOnClickListener {
            binding.cvSearch.tvTo.text = getString(R.string.to, "?")
        }

        binding.toAnywhere.setOnClickListener {
            binding.cvSearch.tvTo.text =
                getString(
                    R.string.to, getString(R.string.to_anywhere)
                        .replace("\n", " ")
                )
        }


    }
}