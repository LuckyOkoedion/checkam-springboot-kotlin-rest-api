package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.models.CommunityModel
import com.luckyokoedion.checkam.models.ProjectKeyPerIndDisapModel
import com.luckyokoedion.checkam.services.ProjectKeyPerIndDisapService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/project-kpi-disapproval")
class ProjectKeyPerformanceIndicatorDisapprovalController(val theService: ProjectKeyPerIndDisapService) {


    @PostMapping
    suspend fun create(@RequestBody theData: ProjectKeyPerIndDisapModel) {

    }

    @GetMapping
    suspend fun getAll() {

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long) {

    }

    @PutMapping
    suspend fun update(@RequestParam id: Long, @RequestBody theData: ProjectKeyPerIndDisapModel) {

    }

    @DeleteMapping
    suspend fun delete(@RequestParam id: Long) {

    }

}