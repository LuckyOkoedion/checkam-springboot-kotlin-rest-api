package com.luckyokoedion.checkam

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController

@SpringBootApplication
class CheckamApplication

@RequestMapping("/")
@ResponseBody
fun home(): String {
    return "Oh No! How did you get here? Go Back the way you came and use the api documentation";
}

fun main(args: Array<String>) {
    runApplication<CheckamApplication>(*args)
}
