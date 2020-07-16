package com.shalaga44.hiltsample.ui.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.shalaga44.hiltsample.R

class LoginFragmentDirections private constructor() {
  companion object {
    fun actionLoginFragmentToSignUpFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_signUpFragment)
  }
}
