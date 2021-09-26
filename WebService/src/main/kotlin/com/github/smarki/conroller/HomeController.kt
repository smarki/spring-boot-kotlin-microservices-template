package com.github.smarki.conroller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody

@Controller
class HomeController {
    @Autowired
    private lateinit var webClient: WebClient

    @GetMapping("/")
    suspend fun index(
        @RequestParam(name = "name", required = false, defaultValue = "World") name: String, model: Model
    ): String {
        val greeting =
            webClient.get().uri("http://greeting-service/?name=$name").accept(MediaType.APPLICATION_JSON).retrieve()
                .awaitBody<String>()
        model.addAttribute("greeting", greeting)
        return "greeting"
    }
}
