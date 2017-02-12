package com.zenika.lunchPlace.restaurant

import com.zenika.lunchPlace.organization.RestaurantRepository
import com.zenika.lunchPlace.restaurant.category.FoodCategory
import com.zenika.lunchPlace.restaurant.category.PriceCategory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * Created by Gwennaël Buchet on 22/10/16.
 */

@RestController
@RequestMapping("/api/v1/restaurants")
class RestaurantController @Autowired constructor(val repository: RestaurantRepository) {

    @CrossOrigin
    @GetMapping(value = "/")
    fun findAll(): Iterable<Restaurant> = repository.findAll()

    @CrossOrigin
    @GetMapping(value = "/{id}")
    fun findById(@PathVariable id: Long) : Iterable<Restaurant>
            = repository.findById(id)

    @CrossOrigin
    @PostMapping(value = "/add")
    fun add(@RequestParam(value = "name") name: String): Restaurant? {

        return null
    }

}