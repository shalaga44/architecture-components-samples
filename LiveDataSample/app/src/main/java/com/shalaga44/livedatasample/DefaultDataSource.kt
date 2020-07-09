package com.shalaga44.livedatasample

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import kotlinx.coroutines.delay

class DefaultDataSource : DataSource {
    override fun getCurrentTime(): LiveData<Long> = liveData {
        while (true){
        delay(1000)
        val date = System.currentTimeMillis()
        emit(date)
        }
    }
}

interface DataSource {
    fun getCurrentTime():LiveData<Long>

}