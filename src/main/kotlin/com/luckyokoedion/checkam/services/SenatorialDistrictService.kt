package com.luckyokoedion.checkam.services


import com.luckyokoedion.checkam.models.SenatorialDistrictModel
import com.luckyokoedion.checkam.repositories.SenatorialDistrictRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class SenatorialDistrictService(val theRepo: SenatorialDistrictRepository) {

    suspend fun create(theData: SenatorialDistrictModel) : SenatorialDistrictModel =
            theRepo.save(theData)

    suspend fun getAll(): MutableIterable<SenatorialDistrictModel> = theRepo.findAll()

    suspend fun getOneById(id: Long): Optional<SenatorialDistrictModel> = theRepo.findById(id)

    suspend fun update(id: Long, theData: SenatorialDistrictModel): SenatorialDistrictModel? {
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