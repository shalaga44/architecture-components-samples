package com.shalaga44.workmanagersample

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.work.testing.TestListenableWorkerBuilder
import androidx.work.ListenableWorker.Result
import kotlinx.coroutines.runBlocking
import org.hamcrest.Matchers.`is`
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FirstCoroutineWorkerTest {
    private lateinit var context: Context
    @Before
    fun setUp() {

        context = ApplicationProvider.getApplicationContext() }
    @Test
    fun testFirstWorker() {
        val worker = TestListenableWorkerBuilder<FirstWorker>(context).build()
        runBlocking {
            val result = worker.doWork()
            assertThat(result, `is`(Result.success()))
        }
    }
    
}

