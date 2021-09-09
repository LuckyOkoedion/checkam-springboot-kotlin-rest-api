package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.CommunityModel
import org.springframework.data.repository.CrudRepository

interface CommunityRepository: CrudRepository<CommunityModel, Long> {

}