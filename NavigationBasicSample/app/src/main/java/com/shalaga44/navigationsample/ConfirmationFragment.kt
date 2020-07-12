package com.shalaga44.navigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.shalaga44.navigationsample.databinding.FragmentConfirmationBinding


class ConfirmationFragment : Fragment(R.layout.fragment_confirmation) {
    val args : ConfirmationFragmentArgs by navArgs()
    private lateinit var binding: FragmentConfirmationBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentConfirmationBinding.bind(view)
        binding.youHaveSentAmoutToUsername.text = "You Have Sent $${args.amount} To ${args.username}"
    }
}