package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.ProjectKeyPerIndModel
import org.springframework.data.repository.CrudRepository

interface ProjectKeyPerIndRepository : CrudRepository<ProjectKeyPerIndModel, Long> {
}