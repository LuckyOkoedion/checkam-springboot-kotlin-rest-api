package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.ProjectKeyPerIndDisapModel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface ProjectKeyPerIndDisapRepository : CoroutineCrudRepository<ProjectKeyPerIndDisapModel, Long> {
}