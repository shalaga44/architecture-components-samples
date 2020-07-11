package com.shalaga44.navigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shalaga44.navigationsample.databinding.FragmentChooseRecipientBinding


class ChooseRecipientFragment : Fragment(R.layout.fragment_choose_recipient) {
        private lateinit var binding: FragmentChooseRecipientBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChooseRecipientBinding.bind(view)
    }
}