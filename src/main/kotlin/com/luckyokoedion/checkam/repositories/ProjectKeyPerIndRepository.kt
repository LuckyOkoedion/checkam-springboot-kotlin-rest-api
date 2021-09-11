package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.ProjectKeyPerIndModel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface ProjectKeyPerIndRepository : CoroutineCrudRepository<ProjectKeyPerIndModel, Long> {
}