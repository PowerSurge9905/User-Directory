package com.powersurge.userdirectory.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel()  {
    var userUiState: String by mutableStateOf("")
        private set

    init {
        getUser()
    }

    fun getUser() {
        userUiState = "User API status response here!"
    }
}