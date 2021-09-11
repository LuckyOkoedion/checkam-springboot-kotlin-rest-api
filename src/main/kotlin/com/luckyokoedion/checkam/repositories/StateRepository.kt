package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.StateModel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface StateRepository: CoroutineCrudRepository<StateModel, Long> {
}