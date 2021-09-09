package com.luckyokoedion.checkam.controllers


import com.luckyokoedion.checkam.models.CommunityModel
import com.luckyokoedion.checkam.models.FederalConstituencyModel
import com.luckyokoedion.checkam.services.FederalConstituencyService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/federal-constituencies")
class FederalConstituencyController(val theService: FederalConstituencyService) {

    @PostMapping
    suspend fun create(@RequestBody theData: FederalConstituencyModel) {

    }

    @GetMapping
    suspend fun getAll() {

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long) {

    }

    @PutMapping
    suspend fun update(@RequestParam id: Long, @RequestBody theData: FederalConstituencyModel) {

    }

    @DeleteMapping
    suspend fun delete(@RequestParam id: Long) {

    }
}