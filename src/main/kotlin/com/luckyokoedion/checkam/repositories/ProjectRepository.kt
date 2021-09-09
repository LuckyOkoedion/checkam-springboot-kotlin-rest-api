package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.ProjectModel
import org.springframework.data.repository.CrudRepository

interface ProjectRepository : CrudRepository<ProjectModel, Long> {
}