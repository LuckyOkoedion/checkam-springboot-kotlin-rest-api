package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.models.CommunityModel
import com.luckyokoedion.checkam.models.ProjectModel
import com.luckyokoedion.checkam.services.ProjectService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/projects")
class ProjectController(val theService: ProjectService) {

    @PostMapping
    suspend fun create(@RequestBody theData: ProjectModel) {

    }

    @GetMapping
    suspend fun getAll() {

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long) {

    }

    @PutMapping
    suspend fun update(@RequestParam id: Long, @RequestBody theData: ProjectModel) {

    }

    @DeleteMapping
    suspend fun delete(@RequestParam id: Long) {

    }
}