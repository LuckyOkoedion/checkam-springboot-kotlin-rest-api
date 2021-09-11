package com.luckyokoedion.checkam

import org.flywaydb.core.Flyway
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment


@Configuration
class FlywayConfig(private val env: Environment) {

    @Bean
    fun flyWay(): Flyway {
        val url = "jdbc:" + env.getRequiredProperty("db.url")
        val user = env.getRequiredProperty("db.user")
        val password = env.getRequiredProperty("db.password")

        val config = Flyway.configure()
                .dataSource(url, user, password)

        return Flyway(config)
    }

}