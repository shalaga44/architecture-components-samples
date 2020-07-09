package com.shalaga44.livedatasample

import androidx.lifecycle.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
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
    val cachedData = dataSource.cachedData
     fun onRefresh(){
        viewModelScope.launch {
            dataSource.fetchNewData()

        }
    }
}

object MainActivityVMFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {

            val dataSource = DefaultDataSource(Dispatchers.IO)
            return MainActivityViewModel(dataSource) as T
        }
        throw IllegalArgumentException("Unknown view model class")
    }
}
