package com.github.smarki

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@SpringBootApplication
@EnableDiscoveryClient
open class WebServiceApplication

@Configuration
open class Configuration {
    @Bean
    @LoadBalanced
    open fun webServiceTemplateBuilder(): WebClient.Builder = WebClient.builder()

    @Bean
    open fun webServiceTemplate(builder: WebClient.Builder): WebClient = builder.build()
}

fun main(args: Array<String>) {
    runApplication<WebServiceApplication>(*args)
}
