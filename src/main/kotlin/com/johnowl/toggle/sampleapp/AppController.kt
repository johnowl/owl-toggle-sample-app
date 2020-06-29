package com.johnowl.toggle.sampleapp

import com.johnowl.toggle.client.FeatureToggleClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/app")
class AppController(
        private val featureToggleClient: FeatureToggleClient
) {

    @PostMapping("/login")
    fun login(@RequestBody user: LoginRequest): ResponseEntity<String> {

        if(user.name.isNotEmpty() && user.password == "123456") {
            featureToggleClient.sendVariables(user.name, mapOf("version" to user.clientVersion))
        }

        return ResponseEntity("ok", HttpStatus.OK)
    }

    @GetMapping("/details/{username}")
    fun details(@PathVariable("username") username: String): ResponseEntity<String> {

        if(featureToggleClient.isEnabled("details_v2", username, false)) {
            return ResponseEntity("v2", HttpStatus.OK)
        }

        return ResponseEntity("v1", HttpStatus.OK)
    }

}