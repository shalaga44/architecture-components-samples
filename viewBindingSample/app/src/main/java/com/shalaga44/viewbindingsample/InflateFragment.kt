package com.shalaga44.viewbindingsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shalaga44.viewbindingsample.databinding.FragmentBindBinding


class InflateFragment : Fragment() {

    private var fragmentBindFragment: FragmentBindBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBindBinding.inflate(inflater, container, false)
        fragmentBindFragment = binding
        binding.textViewFragment.text = getString(R.string.hello_from_vb_inflate_fragment)
        return binding.root
    }

    override fun onDestroy() {
        fragmentBindFragment = null
        super.onDestroy()
    }
}