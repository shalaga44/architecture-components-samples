package com.shalaga44.livedatasample

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import kotlinx.coroutines.delay

class DefaultDataSource : DataSource {
    override fun getCurrentTime(): LiveData<Long> = liveData {
        while (true) {
            delay(1000)
            val date = System.currentTimeMillis()
            emit(date)
        }
    }

    val weatherConditions = listOf("Sunny", "Cloudy", "Rainy", "Stormy", "Snowy")

    override fun fetchWeather(): LiveData<String>  = liveData {
        var counter = 0
        while (true){
            delay(2000)
            counter++
            emit(weatherConditions[counter % weatherConditions.size])

        }
    }
}

interface DataSource {
    fun getCurrentTime(): LiveData<Long>
    fun fetchWeather(): LiveData<String>

}