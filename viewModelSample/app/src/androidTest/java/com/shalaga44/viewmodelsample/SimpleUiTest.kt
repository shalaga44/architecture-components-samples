package com.shalaga44.viewmodelsample

import android.provider.Settings.Global.getString
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class SimpleUiTest {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun activityLaunches(){
    onView(withText(R.string.hello_from_vb_bind_fragment)).check(matches(isDisplayed()))
    onView(withText(R.string.hello_from_vb_inflate_fragment)).check(matches(isDisplayed()))
    onView(withText(R.string.hello_from_vb_activity)).check(matches(isDisplayed()))
}
}