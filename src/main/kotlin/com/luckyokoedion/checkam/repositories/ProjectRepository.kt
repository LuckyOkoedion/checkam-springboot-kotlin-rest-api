package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.ProjectModel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface ProjectRepository : CoroutineCrudRepository<ProjectModel, Long> {
}