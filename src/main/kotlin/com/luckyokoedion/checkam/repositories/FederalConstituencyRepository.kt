package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.FederalConstituencyModel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface FederalConstituencyRepository: CoroutineCrudRepository<FederalConstituencyModel, Long> {
}