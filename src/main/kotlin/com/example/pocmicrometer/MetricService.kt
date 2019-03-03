package com.example.pocmicrometer

import io.micrometer.core.instrument.Gauge
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
class MetricService(val meterRegistry: MeterRegistry) {

    val values = mutableListOf<String>()

    @Scheduled(fixedDelay = 1000)
    fun testCounterAndTimer() {
        val timerName = "application.timer"
        val timer = meterRegistry.timer(timerName)
        timer.record {
            val counterName = "application.counter"
            val counter = meterRegistry.counter(counterName)
            counter.increment()
        }
    }

    @Scheduled(fixedDelay = 1000)
    fun testGuage() {
        Gauge.builder("application.list.size", values) { values.size.toDouble() }.register(meterRegistry)
        values.add("1")
    }

}