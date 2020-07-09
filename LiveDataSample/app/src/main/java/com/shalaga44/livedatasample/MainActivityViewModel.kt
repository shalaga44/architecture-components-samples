package com.shalaga44.livedatasample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import androidx.lifecycle.switchMap
import kotlinx.coroutines.delay
import java.util.*

class MainActivityViewModel(private val dataSource: DataSource) : ViewModel() {
    val currentTime = dataSource.getCurrentTime()

    val currentTimeTransformed = currentTime.switchMap {
        liveData { emit(timeStampToTime(it)) }
    }

    suspend fun timeStampToTime(long: Long): String {
        delay(100)
        val date = Date(long)
        return date.toString()
    }
    val currentWeather = liveData<String> {
        emit(LOADING_STRING)
        emitSource(dataSource.fetchWeather())
    }

    companion object {
        const val LOADING_STRING = "Loading...."
    }
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
