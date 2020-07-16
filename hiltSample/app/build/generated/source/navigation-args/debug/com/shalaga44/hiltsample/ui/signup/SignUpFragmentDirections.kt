package com.shalaga44.hiltsample.ui.signup

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.shalaga44.hiltsample.R

class SignUpFragmentDirections private constructor() {
  companion object {
    fun actionSignUpFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signUpFragment_to_loginFragment)
  }
}
