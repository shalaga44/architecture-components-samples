package com.shalaga44.viewbindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shalaga44.viewbindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onStart() {
        binding.activityTextView.text = getString(R.string.hello_from_vb_activity)
        super.onStart()
    }
}