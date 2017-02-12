package com.zenika.lunchPlace.organization

import java.util.*


data class User(
        val _id: String?,
        val firstname: String = "",
        val lastname: String = "",
        val nickname: String = ""
)

data class UserRegistration(
        val userId: String,
        val at: Date
)