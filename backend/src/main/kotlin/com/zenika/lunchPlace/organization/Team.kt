package com.zenika.lunchPlace.organization

import java.util.*

data class Team(
        val _id: String?,
        val name: String = "Someone forgot to name that Team!",
        val description: String = "",
        val registration: ManagementInfo
)

data class TeamRegistration(
        val id: String,
        val registrar: String,
        val at: Date
)

data class ManagementInfo(
        val registar: String,
        val at: Date
)

data class TeamContent(
        val _id: String?,
        val date: Date,
        val teamId: String,
        val users: ArrayList<UserRegistration> = ArrayList<UserRegistration>()
)