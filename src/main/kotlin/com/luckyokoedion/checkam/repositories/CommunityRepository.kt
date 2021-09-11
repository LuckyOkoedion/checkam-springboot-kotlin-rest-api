package com.luckyokoedion.checkam.repositories

import com.luckyokoedion.checkam.models.CommunityModel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface CommunityRepository: CoroutineCrudRepository<CommunityModel, Long> {

}