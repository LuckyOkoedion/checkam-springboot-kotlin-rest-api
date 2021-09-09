package com.luckyokoedion.checkam.services

import com.luckyokoedion.checkam.models.CommunityModel
import com.luckyokoedion.checkam.repositories.CommunityRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CommunityService(val theRepo: CommunityRepository) {

    suspend fun create(theData: CommunityModel) : CommunityModel =
        theRepo.save(theData)

    suspend fun getAll(): MutableIterable<CommunityModel> = theRepo.findAll()

    suspend fun getOneById(id: Long): Optional<CommunityModel> = theRepo.findById(id)

    suspend fun update(id: Long, theData: CommunityModel): CommunityModel? {
        val result = this.getOneById(id)
        return if (result.isPresent) {
            theRepo.save(theData)
        } else {
            null
        }
    }

    suspend fun delete(id: Long): Unit? {
        val result = this.getOneById(id)
        return if (result.isPresent) {
            theRepo.delete(result.get())
        } else {
            null
        }
    }


}