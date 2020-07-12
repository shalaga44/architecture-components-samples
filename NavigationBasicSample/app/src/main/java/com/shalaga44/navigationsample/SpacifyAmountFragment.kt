package com.shalaga44.navigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.shalaga44.navigationsample.databinding.FragmentSpacifyAmountBinding

class SpacifyAmountFragment : Fragment(R.layout.fragment_spacify_amount) {
    val args : SpacifyAmountFragmentArgs by navArgs<SpacifyAmountFragmentArgs>()
    private lateinit var binding: FragmentSpacifyAmountBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSpacifyAmountBinding.bind(view)
        intiView()
        binding.cancelButton.setOnClickListener {
            activity!!.onBackPressed()
        }
        binding.sendButton.setOnClickListener {
            val amountText = binding.textInputLayout.editText?.text
            var amount = 44
            if(!amountText.isNullOrBlank()){
                amount = amountText.toString().toInt() }
            val action = SpacifyAmountFragmentDirections
                .actionSpacifyAmountFragmentToConfirmationFragment(amount,args.username)
            Navigation.findNavController(view)
                .navigate(action)
        }
    }

    private fun intiView() {
        binding.sendingMoneyToUserNameTextView.text = "Sending Money To ${args.username}"
    }

}