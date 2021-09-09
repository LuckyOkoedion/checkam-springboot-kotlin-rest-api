package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.models.CommunityModel
import com.luckyokoedion.checkam.models.ProjectKeyPerIndModel
import com.luckyokoedion.checkam.services.ProjectKeyPerIndService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/project-kpi-indicators")
class ProjectKeyPerformanceIndicatorController(val theService: ProjectKeyPerIndService) {


    @PostMapping
    suspend fun create(@RequestBody theData: ProjectKeyPerIndModel) {

    }

    @GetMapping
    suspend fun getAll() {

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long) {

    }

    @PutMapping
    suspend fun update(@RequestParam id: Long, @RequestBody theData: ProjectKeyPerIndModel) {

    }

    @DeleteMapping
    suspend fun delete(@RequestParam id: Long) {

    }

}