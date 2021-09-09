package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.FederalConstituencyModel
import org.springframework.data.repository.CrudRepository

interface FederalConstituencyRepository: CrudRepository<FederalConstituencyModel, Long> {
}