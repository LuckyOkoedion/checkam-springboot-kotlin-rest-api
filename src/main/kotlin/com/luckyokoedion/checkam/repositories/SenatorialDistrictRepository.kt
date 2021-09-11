package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.SenatorialDistrictModel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface SenatorialDistrictRepository: CoroutineCrudRepository<SenatorialDistrictModel, Long> {
}