package uz.eloving.islomsheraliyevtest.ui.fragment.tickets

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import uz.eloving.islomsheraliyev.data.local.AppPreferences
import uz.eloving.islomsheraliyevtest.R
import uz.eloving.islomsheraliyevtest.core.BaseFragment
import uz.eloving.islomsheraliyevtest.databinding.FragmentTicketsBinding
import uz.eloving.islomsheraliyevtest.ui.bottomsheet.SearchBottomDialog
import uz.eloving.islomsheraliyevtest.utils.ItemSpacingDecoration
import uz.eloving.islomsheraliyevtest.utils.singleShow

@AndroidEntryPoint
class TicketsFragment : BaseFragment<FragmentTicketsBinding>(FragmentTicketsBinding::inflate) {

    private val adapter by lazy { TicketsAdapter() }
    private val viewModel: TicketsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvOffers.adapter = adapter
        binding.rvOffers.addItemDecoration(ItemSpacingDecoration(requireContext(), 67))
        binding.rvOffers.layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.HORIZONTAL, false
        )

        binding.searchCard.tvFrom.text = getString(R.string.from, AppPreferences.from)

        binding.searchCard.tvTo.text = getString(R.string.to, "?")

        binding.searchCard.componentSearchCard.setOnClickListener {
            SearchBottomDialog().singleShow(childFragmentManager)
        }

        setupObservers()
        viewModel.getOffers()
    }

    private fun setupObservers() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.offersFlow.collect { offers ->
                    adapter.submitList(offers.offers)
                }
            }
        }
    }
}
