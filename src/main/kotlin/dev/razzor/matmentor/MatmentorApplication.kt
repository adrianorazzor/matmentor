package dev.razzor.matmentor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MatmentorApplication

fun main(args: Array<String>) {
    runApplication<MatmentorApplication>(*args)
}
