package com.shalaga44.navigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.shalaga44.navigationsample.databinding.FragmentSpacifyAmountBinding

class SpacifyAmountFragment : Fragment(R.layout.fragment_spacify_amount) {
    private lateinit var binding: FragmentSpacifyAmountBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSpacifyAmountBinding.bind(view)

        binding.cancelButton.setOnClickListener {
            activity!!.onBackPressed()
        }
        binding.sendButton.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_spacifyAmountFragment_to_confirmationFragment)
        }
    }

}