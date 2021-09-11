package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.ProjectMonitorModel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface ProjectMonitorRepository: CoroutineCrudRepository<ProjectMonitorModel, Long> {
}