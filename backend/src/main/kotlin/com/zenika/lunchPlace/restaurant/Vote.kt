package com.zenika.lunchPlace.restaurant

import java.util.*

data class Vote(
        val _id: String,
        val userId: String,
        val teamId: String,
        val at: Date,
        val vote : RestaurantVote?
)

data class RestaurantVote(
        val upVotedId : String?,
        val downVotedId: String?,
        val whyNotId: String?
)

