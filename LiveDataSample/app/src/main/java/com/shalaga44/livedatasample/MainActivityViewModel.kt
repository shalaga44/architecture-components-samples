package com.shalaga44.livedatasample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModel : viewModel() {

}

object MainActivityVMFActory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
            return MainActivityViewModel() as T
        }
        throw IllegalArgumentException("Unknown view model class")
    }
}