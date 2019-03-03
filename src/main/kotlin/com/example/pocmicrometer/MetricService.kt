package com.example.pocmicrometer

import io.micrometer.core.instrument.MeterRegistry
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service


@Service
class MetricService(meterRegistry: MeterRegistry) {

    val log = LoggerFactory.getLogger(javaClass)

}