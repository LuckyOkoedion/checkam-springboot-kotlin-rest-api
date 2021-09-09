package com.luckyokoedion.checkam.services

import com.luckyokoedion.checkam.models.ProjectKeyPerIndModel
import com.luckyokoedion.checkam.repositories.ProjectKeyPerIndRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProjectKeyPerIndService(val theRepo: ProjectKeyPerIndRepository) {

    suspend fun create(theData: ProjectKeyPerIndModel) : ProjectKeyPerIndModel =
            theRepo.save(theData)

    suspend fun getAll(): MutableIterable<ProjectKeyPerIndModel> = theRepo.findAll()

    suspend fun getOneById(id: Long): Optional<ProjectKeyPerIndModel> = theRepo.findById(id)

    suspend fun update(id: Long, theData: ProjectKeyPerIndModel): ProjectKeyPerIndModel? {
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