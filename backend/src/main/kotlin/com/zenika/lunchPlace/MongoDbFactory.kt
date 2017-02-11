package com.zenika.lunchPlace

import com.mongodb.client.MongoDatabase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
open class MongoDbFactory @Autowired constructor(
        val clientFactory: MongoClientFactory,
        @Value("\${lunchplace.mongo.db}") val db: String) {
    val database: MongoDatabase
        get() = clientFactory.client.getDatabase(db)
}
