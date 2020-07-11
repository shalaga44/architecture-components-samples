package com.shalaga44.navigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.shalaga44.navigationsample.databinding.FragmentMainBinding


class mainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

    }
}