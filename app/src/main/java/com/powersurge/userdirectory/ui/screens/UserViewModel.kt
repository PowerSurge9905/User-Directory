package com.powersurge.userdirectory.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.powersurge.userdirectory.network.UserApi
import kotlinx.coroutines.launch

class UserViewModel : ViewModel()  {
    var userUiState: String by mutableStateOf("")
        private set

    init {
        getUser()
    }

    fun getUser() {
        viewModelScope.launch {
            val listResult = UserApi.retrofitService.getUsers()
            userUiState = listResult
        }
    }
}