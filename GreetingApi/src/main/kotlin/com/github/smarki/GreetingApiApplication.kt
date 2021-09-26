package com.github.smarki

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
open class GreetingApiApplication
fun main(args: Array<String>) {
    runApplication<GreetingApiApplication>(*args)
}
