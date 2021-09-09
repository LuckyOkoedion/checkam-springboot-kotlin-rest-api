package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.ProjectMonitorModel
import org.springframework.data.repository.CrudRepository

interface ProjectMonitorRepository: CrudRepository<ProjectMonitorModel, Long> {
}