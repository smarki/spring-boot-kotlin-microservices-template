package com.github.smarki.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {
    @GetMapping("/")
    fun greet(@RequestParam("name", required = false, defaultValue = "world") name: String): String {
        return "Hello, $name"
    }
}