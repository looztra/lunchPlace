package com.zenika.lunchPlace.restaurant

import com.zenika.lunchPlace.organization.OrganisationRegistration
import com.zenika.lunchPlace.organization.TeamRegistration
import com.zenika.lunchPlace.restaurant.category.FoodCategory
import com.zenika.lunchPlace.restaurant.category.PriceCategory
import java.util.*


data class Restaurant(
        val _id: String?,
        val name: String = "Someone forgot to name that restaurant",
        val address: Address?,
        val foodCategories: ArrayList<FoodCategory> = ArrayList<FoodCategory>(),
        val priceCategory: PriceCategory = PriceCategory.LP_PRICE_STANDARD,
        val imageURL: String?,
        val organisations: ArrayList<OrganisationRegistration> = ArrayList<OrganisationRegistration>(),
        val teams: ArrayList<TeamRegistration> = ArrayList<TeamRegistration>()
)

data class Address(
        val latitude: Double?,
        val longitude: Double?,
        val number: String?,
        val street: String?,
        val complement1: String?,
        val complement2: String?,
        val zipCode: Int?,
        val city: String?,
        val country: String = "France",
        val _id: String?
)