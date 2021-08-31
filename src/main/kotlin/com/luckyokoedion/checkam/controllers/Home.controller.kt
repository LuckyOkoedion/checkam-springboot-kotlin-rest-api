package com.luckyokoedion.checkam.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Home {

    @GetMapping("/")
    fun landing(): String {
        return "Oh no ! what are you doing here? Go back or use the api documentation."
    }
}
