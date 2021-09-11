package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.LocalGovernmentModel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface LocalGovernmentRepository : CoroutineCrudRepository<LocalGovernmentModel, Long> {
}