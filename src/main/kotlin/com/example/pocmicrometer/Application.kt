package com.example.pocmicrometer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class PocMicrometerApplication

fun main(args: Array<String>) {
	runApplication<PocMicrometerApplication>(*args)
}