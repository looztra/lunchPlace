package com.zenika.lunchPlace.organization

data class Organization(
        val _id: String?,
        val name: String = "",
        val description: String = "",
        val teams: MutableList<String> = mutableListOf<String>(),
        val users: MutableList<String> = mutableListOf<String>()
)