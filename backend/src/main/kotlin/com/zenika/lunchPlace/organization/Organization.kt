package com.zenika.lunchPlace.organization

import java.util.*

data class Organization(
        val _id: String?,
        val name: String = "Someone forgot to name that Organization",
        val description: String = "",
        val users: MutableList<String> = mutableListOf<String>()
)

data class OrganisationRegistration(
        val id: String,
        val registrar: String,
        val at: Date
)