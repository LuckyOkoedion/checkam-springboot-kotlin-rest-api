package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.models.CommunityModel
import com.luckyokoedion.checkam.models.ProjectKeyPerIndEndorModel
import com.luckyokoedion.checkam.services.ProjectKeyPerIndEndorService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/project-kpi-endorsements")
class ProjectKeyPerformanceIndicatorEndorsementController(val theService: ProjectKeyPerIndEndorService) {


    @PostMapping
    suspend fun create(@RequestBody theData: ProjectKeyPerIndEndorModel) {

    }

    @GetMapping
    suspend fun getAll() {

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long) {

    }

    @PutMapping
    suspend fun update(@RequestParam id: Long, @RequestBody theData: ProjectKeyPerIndEndorModel) {

    }

    @DeleteMapping
    suspend fun delete(@RequestParam id: Long) {

    }

}