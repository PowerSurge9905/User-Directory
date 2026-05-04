package com.powersurge.userdirectory.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// User data class
@Serializable
data class User(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val email: String,
    @SerialName("image")
    val imgSrc: String,
)