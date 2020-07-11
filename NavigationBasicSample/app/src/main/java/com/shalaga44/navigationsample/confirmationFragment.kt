package com.shalaga44.navigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.shalaga44.navigationsample.databinding.FragmentConfirmationBinding


class confirmationFragment : Fragment() {
    private lateinit var binding: FragmentConfirmationBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentConfirmationBinding.bind(view)
    }
}