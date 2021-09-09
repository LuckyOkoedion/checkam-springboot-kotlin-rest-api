package com.luckyokoedion.checkam.services

import com.luckyokoedion.checkam.models.StateModel
import com.luckyokoedion.checkam.repositories.StateRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class StateService(val theRepo: StateRepository) {

    suspend fun create(theData: StateModel) : StateModel =
            theRepo.save(theData)

    suspend fun getAll(): MutableIterable<StateModel> = theRepo.findAll()

    suspend fun getOneById(id: Long): Optional<StateModel> = theRepo.findById(id)

    suspend fun update(id: Long, theData: StateModel): StateModel? {
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