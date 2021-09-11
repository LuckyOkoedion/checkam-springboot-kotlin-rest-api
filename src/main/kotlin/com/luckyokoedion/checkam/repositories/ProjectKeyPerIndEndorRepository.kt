package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.ProjectKeyPerIndEndorModel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface ProjectKeyPerIndEndorRepository : CoroutineCrudRepository<ProjectKeyPerIndEndorModel, Long> {
}