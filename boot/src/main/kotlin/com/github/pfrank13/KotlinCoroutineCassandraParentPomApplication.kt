package com.github.pfrank13

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KotlinCoroutineCassandraParentPomApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinCoroutineCassandraParentPomApplication::class.java, *args)
}
