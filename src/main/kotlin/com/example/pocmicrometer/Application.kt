package com.example.pocmicrometer

import io.micrometer.core.instrument.MeterRegistry
import io.micrometer.core.instrument.simple.SimpleMeterRegistry
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class PocMicrometerApplication

fun main(args: Array<String>) {
	runApplication<PocMicrometerApplication>(*args)
}