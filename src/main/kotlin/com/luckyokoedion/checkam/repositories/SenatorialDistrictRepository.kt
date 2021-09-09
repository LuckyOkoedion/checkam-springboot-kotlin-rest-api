package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.SenatorialDistrictModel
import org.springframework.data.repository.CrudRepository

interface SenatorialDistrictRepository: CrudRepository<SenatorialDistrictModel, Long> {
}