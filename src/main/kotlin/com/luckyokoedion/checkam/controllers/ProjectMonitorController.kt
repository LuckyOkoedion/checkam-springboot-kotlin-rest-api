package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.models.CommunityModel
import com.luckyokoedion.checkam.models.ProjectMonitorModel
import com.luckyokoedion.checkam.services.ProjectMonitorService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/project-monitors")
class ProjectMonitorController(val theService: ProjectMonitorService) {

    @PostMapping
    suspend fun create(@RequestBody theData: ProjectMonitorModel) {

    }

    @GetMapping
    suspend fun getAll() {

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long) {

    }

    @PutMapping
    suspend fun update(@RequestParam id: Long, @RequestBody theData: ProjectMonitorModel) {

    }

    @DeleteMapping
    suspend fun delete(@RequestParam id: Long) {

    }
}