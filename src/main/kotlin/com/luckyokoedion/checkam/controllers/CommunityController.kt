package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.models.CommunityModel
import com.luckyokoedion.checkam.services.CommunityService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/communities")
class CommunityController(val theService: CommunityService) {

    @PostMapping
    suspend fun create(@RequestBody theData: CommunityModel) {

    }

    @GetMapping
    suspend fun getAll() {

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long) {

    }

    @PutMapping
    suspend fun update(@RequestParam id: Long, @RequestBody theData: CommunityModel) {

    }

    @DeleteMapping
    suspend fun delete(@RequestParam id: Long) {

    }
}