package com.shalaga44.navigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.shalaga44.navigationsample.databinding.FragmentChooseRecipientBinding


class ChooseRecipientFragment : Fragment(R.layout.fragment_choose_recipient) {
    private val args: ChooseRecipientFragmentArgs by navArgs()
    private lateinit var binding: FragmentChooseRecipientBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChooseRecipientBinding.bind(view)
        if (args.username != "Shalaga44") {
            binding.textInputLayout.editText?.setText(args.username) }
        binding.cancelButton.setOnClickListener {
            activity!!.onBackPressed()
        }
        binding.sendButton.setOnClickListener {
            var username = binding.textInputLayout.editText?.text.toString()
            if(username.isNullOrBlank()){
                username = args.username
            }
            val action = ChooseRecipientFragmentDirections
                .actionChooseRecipientFragmentToSpacifyAmountFragment(username)
            Navigation.findNavController(view)
                .navigate(action)
        }
    }


}