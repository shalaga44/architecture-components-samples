package com.shalaga44.viewbindingsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.shalaga44.viewbindingsample.databinding.FragmentBindBinding


class BindFragment : Fragment(R.layout.fragment_bind) {

    private var fragmentBindFragment: FragmentBindBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentBindBinding.bind(view)
        fragmentBindFragment = binding
        binding.textViewFragment.text = getString(R.string.hello_from_vb_bind_fragment)
    }


    override fun onDetach() {
        fragmentBindFragment = null
        super.onDetach()
    }
}