package com.zenika.lunchPlace

import com.mongodb.MongoClient
import com.mongodb.MongoCredential
import com.mongodb.ServerAddress
import org.litote.kmongo.KMongo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.util.*

@Component
open class MongoClientFactory @Autowired constructor(
        @Value("\${lunchplace.mongo.host}") val host: String,
        @Value("\${lunchplace.mongo.port}") val port: Int,
        @Value("\${lunchplace.mongo.db}") val db: String,
        @Value("\${lunchplace.mongo.user}") val user: String,
        @Value("\${lunchplace.mongo.password}") val password: String
) {
    val credentialsList: ArrayList<MongoCredential>
        get() = arrayListOf(MongoCredential.createCredential(user, db, password.toCharArray()))

    val client: MongoClient
        get() = KMongo.createClient(ServerAddress(host, port), credentialsList)
}
