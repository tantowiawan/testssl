package com.test.ssl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SslApplication

fun main(args: Array<String>) {
	runApplication<SslApplication>(*args)
}
