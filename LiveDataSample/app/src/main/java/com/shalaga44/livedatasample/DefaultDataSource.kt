package com.shalaga44.livedatasample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class DefaultDataSource(private val ioDispatcher: CoroutineDispatcher) : DataSource {
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
    var _cachedData = MutableLiveData("This is old data")
    override val cachedData: LiveData<String> = _cachedData

    override suspend fun fetchNewData() {
        withContext(Dispatchers.Main){
            _cachedData.value = "Fetching new data..."
            _cachedData.value = simulateNetWorkFetch()
        }
    }
    private var counter = 0
    private suspend fun simulateNetWorkFetch(): String =
        withContext(ioDispatcher){
            delay(3000)
            counter++
            "New Data from request #$counter"

    }

}

interface DataSource {
    fun getCurrentTime(): LiveData<Long>
    fun fetchWeather(): LiveData<String>
    val cachedData : LiveData<String>
    suspend fun fetchNewData()

}