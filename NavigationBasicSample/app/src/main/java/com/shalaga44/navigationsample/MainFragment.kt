package com.shalaga44.navigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.shalaga44.navigationsample.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var binding: FragmentMainBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding.viewTransactionButton.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_mainFragment_to_viewTransactionsFragment)
        }

        binding.sendMoneyButton.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_mainFragment_to_chooseRecipientFragment)
        }

        binding.viewBalanceButton.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }

    }

}