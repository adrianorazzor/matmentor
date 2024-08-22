package dev.razzor.matmentor

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<MatmentorApplication>().with(TestcontainersConfiguration::class).run(*args)
}
