package com.zenika.lunchPlace.mongo

import com.mongodb.BasicDBObject
import com.zenika.lunchPlace.MongoDbFactory
import org.bson.Document
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.HealthIndicator
import org.springframework.stereotype.Component

@Component
open class MongoHealthCheck @Autowired constructor(val mongoDbFactory: MongoDbFactory) : HealthIndicator {
    override fun health(): Health {
        val response: Document = mongoDbFactory.database.runCommand(BasicDBObject("buildInfo", "1"))
        return Health.up().withDetail("version", response.getString("version")).build()
    }

}
