package com.shalaga44.navigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.shalaga44.navigationsample.databinding.FragmentSpacifyAmountBinding

class spacifyAmountFragment : Fragment() {
    private lateinit var binding: FragmentSpacifyAmountBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSpacifyAmountBinding.bind(view)
    }

}