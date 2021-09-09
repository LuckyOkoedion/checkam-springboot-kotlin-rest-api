package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.StateModel
import org.springframework.data.repository.CrudRepository

interface StateRepository: CrudRepository<StateModel, Long> {
}