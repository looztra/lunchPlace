package com.zenika.lunchPlace.restaurant

import java.util.*

data class Score(
        val restaurantId: String,
        val userId: String,
        val score: Int,
        val at: Date,
        val _id: String?
)