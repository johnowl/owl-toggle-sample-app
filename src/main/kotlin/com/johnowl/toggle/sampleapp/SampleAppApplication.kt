package com.johnowl.toggle.sampleapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.johnowl.toggle.client", "com.johnowl.toggle.sampleapp")
class SampleAppApplication

fun main(args: Array<String>) {
	runApplication<SampleAppApplication>(*args)
}


