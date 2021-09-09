package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.models.CommunityModel
import com.luckyokoedion.checkam.models.SenatorialDistrictModel
import com.luckyokoedion.checkam.services.SenatorialDistrictService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/senatorial-districts")
class SenatorialDistrictController(val theService: SenatorialDistrictService) {

    @PostMapping
    suspend fun create(@RequestBody theData: SenatorialDistrictModel) {

    }

    @GetMapping
    suspend fun getAll() {

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long) {

    }

    @PutMapping
    suspend fun update(@RequestParam id: Long, @RequestBody theData: SenatorialDistrictModel) {

    }

    @DeleteMapping
    suspend fun delete(@RequestParam id: Long) {

    }
}