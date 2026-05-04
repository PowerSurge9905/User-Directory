package com.powersurge.userdirectory.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET

// URL used to get user JSON data
private const val BASE_URL = "https://dummyjson.com/"

// Ignore unused fields
private val json = Json {
    ignoreUnknownKeys = true
}

// Retrofit builder
private val retrofit = Retrofit.Builder()
    .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

// Make list of users
@Serializable
data class UserResponse(
    val users: List<User>
)

// Get user data
interface UserApiService {
    @GET("users?limit=20")
    suspend fun getUsers(): UserResponse
}

// Make singleton object
object UserApi {
    val retrofitService: UserApiService by lazy {
        retrofit.create(UserApiService::class.java)
    }
}
