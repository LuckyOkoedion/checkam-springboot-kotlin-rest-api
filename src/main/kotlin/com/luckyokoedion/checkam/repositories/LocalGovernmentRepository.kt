package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.LocalGovernmentModel
import org.springframework.data.repository.CrudRepository

interface LocalGovernmentRepository : CrudRepository<LocalGovernmentModel, Long> {
}