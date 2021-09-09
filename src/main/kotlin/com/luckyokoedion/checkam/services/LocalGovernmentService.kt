package com.luckyokoedion.checkam.services

import com.luckyokoedion.checkam.models.LocalGovernmentModel
import com.luckyokoedion.checkam.repositories.LocalGovernmentRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class LocalGovernmentService(val theRepo: LocalGovernmentRepository) {

    suspend fun create(theData: LocalGovernmentModel) : LocalGovernmentModel =
            theRepo.save(theData)

    suspend fun getAll(): MutableIterable<LocalGovernmentModel> = theRepo.findAll()

    suspend fun getOneById(id: Long): Optional<LocalGovernmentModel> = theRepo.findById(id)

    suspend fun update(id: Long, theData: LocalGovernmentModel): LocalGovernmentModel? {
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