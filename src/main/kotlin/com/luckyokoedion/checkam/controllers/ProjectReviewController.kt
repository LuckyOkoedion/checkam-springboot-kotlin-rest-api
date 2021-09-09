package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.models.CommunityModel
import com.luckyokoedion.checkam.models.ProjectReviewModel
import com.luckyokoedion.checkam.services.ProjectReviewService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/project-reviews")
class ProjectReviewController(val theService: ProjectReviewService) {

    @PostMapping
    suspend fun create(@RequestBody theData: ProjectReviewModel) {

    }

    @GetMapping
    suspend fun getAll() {

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long) {

    }

    @PutMapping
    suspend fun update(@RequestParam id: Long, @RequestBody theData: ProjectReviewModel) {

    }

    @DeleteMapping
    suspend fun delete(@RequestParam id: Long) {

    }
}