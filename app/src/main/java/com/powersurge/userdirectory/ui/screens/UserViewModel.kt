package com.powersurge.userdirectory.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.powersurge.userdirectory.network.User
import com.powersurge.userdirectory.network.UserApi
import kotlinx.coroutines.launch
import java.io.IOException

// UI state
sealed interface UserUiState {
    data class Success(val users: List<User>) : UserUiState
    object Error : UserUiState
    object Loading : UserUiState
}

// View model for user data
class UserViewModel : ViewModel()  {
    var userUiState: UserUiState by mutableStateOf(UserUiState.Loading)
        private set

    init {
        getUser()
    }

    fun getUser() {
        viewModelScope.launch {
            userUiState = UserUiState.Loading
            userUiState = try {
                val listResult = UserApi.retrofitService.getUsers()
                UserUiState.Success(listResult.users)
            } catch (e: IOException) {
                UserUiState.Error
            } catch (e: Exception) {
                UserUiState.Error
            }
        }
    }
}
