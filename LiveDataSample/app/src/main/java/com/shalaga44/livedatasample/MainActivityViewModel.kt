package com.shalaga44.livedatasample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModel(private val dataSource: DataSource) : ViewModel()  {


}

object MainActivityVMFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {

            val dataSource = DefaultDataSource()
            return MainActivityViewModel(dataSource) as T
        }
        throw IllegalArgumentException("Unknown view model class")
    }
}
