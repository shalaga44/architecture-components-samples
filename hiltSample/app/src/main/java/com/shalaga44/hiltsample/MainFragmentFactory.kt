package com.shalaga44.hiltsample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.shalaga44.hiltsample.ui.login.LoginFragment
import javax.inject.Inject

class MainFragmentFactory
@Inject
constructor(
    private val someString: String
) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {

        return when(className){
            LoginFragment::class.java.name ->{
                LoginFragment(someString)
            }
            else -> super.instantiate(classLoader, className)
        }


    }
}