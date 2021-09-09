package com.luckyokoedion.checkam.controllers


import com.luckyokoedion.checkam.models.StateModel
import com.luckyokoedion.checkam.services.StateService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/states")
class StateController(val theService: StateService) {

    @PostMapping
    suspend fun create(@RequestBody theData: StateModel) {

    }

    @GetMapping
    suspend fun getAll() {

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long) {

    }

    @PutMapping
    suspend fun update(@RequestParam id: Long, @RequestBody theData: StateModel) {

    }

    @DeleteMapping
    suspend fun delete(@RequestParam id: Long) {

    }
}