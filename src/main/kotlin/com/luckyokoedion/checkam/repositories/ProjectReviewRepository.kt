package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.ProjectReviewModel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface ProjectReviewRepository : CoroutineCrudRepository<ProjectReviewModel, Long> {
}