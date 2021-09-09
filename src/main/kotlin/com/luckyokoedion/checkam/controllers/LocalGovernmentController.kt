package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.models.CommunityModel
import com.luckyokoedion.checkam.models.LocalGovernmentModel
import com.luckyokoedion.checkam.services.LocalGovernmentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/local-government-areas")
class LocalGovernmentController(val theService: LocalGovernmentService) {

    @PostMapping
    suspend fun create(@RequestBody theData: LocalGovernmentModel) {

    }

    @GetMapping
    suspend fun getAll() {

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long) {

    }

    @PutMapping
    suspend fun update(@RequestParam id: Long, @RequestBody theData: LocalGovernmentModel) {

    }

    @DeleteMapping
    suspend fun delete(@RequestParam id: Long) {

    }
}