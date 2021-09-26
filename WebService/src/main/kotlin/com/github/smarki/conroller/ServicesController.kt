package com.github.smarki.conroller

import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ServicesController(private val discoveryClient: DiscoveryClient) {
    @GetMapping("/services")
    fun getServices(): MutableList<String>? {
        return discoveryClient.services
    }
}