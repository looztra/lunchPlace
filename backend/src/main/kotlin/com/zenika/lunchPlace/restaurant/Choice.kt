package com.zenika.lunchPlace.restaurant

import java.util.*

data class Choice(
        val _id: String?,
        val teamId: String,
        val suggestion: SuggestionRestaurant,
        val effective: EffectiveRestaurant
)

data class SuggestionRestaurant(
        val id: String,
        val at: Date
)

data class EffectiveRestaurant(
        val id: String,
        val at: Date,
        val userId: String
)