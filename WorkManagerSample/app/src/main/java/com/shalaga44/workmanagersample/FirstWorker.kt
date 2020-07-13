package com.shalaga44.workmanagersample

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.delay

class FirstWorker(context: Context,params:WorkerParameters) :
    CoroutineWorker(context,params) {
    private val TAG = "FirstWorker"


    override suspend fun doWork(): Result {
        Log.d(TAG,"Running FirstWorker")
        delay(2000)
        return Result.success()
    }
}