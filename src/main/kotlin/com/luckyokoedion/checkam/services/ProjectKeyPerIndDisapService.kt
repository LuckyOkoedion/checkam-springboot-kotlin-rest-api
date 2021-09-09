package com.luckyokoedion.checkam.services

import com.luckyokoedion.checkam.models.ProjectKeyPerIndDisapModel
import com.luckyokoedion.checkam.repositories.ProjectKeyPerIndDisapRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProjectKeyPerIndDisapService(val theRepo: ProjectKeyPerIndDisapRepository) {

    suspend fun create(theData: ProjectKeyPerIndDisapModel) : ProjectKeyPerIndDisapModel =
            theRepo.save(theData)

    suspend fun getAll(): MutableIterable<ProjectKeyPerIndDisapModel> = theRepo.findAll()

    suspend fun getOneById(id: Long): Optional<ProjectKeyPerIndDisapModel> = theRepo.findById(id)

    suspend fun update(id: Long, theData: ProjectKeyPerIndDisapModel): ProjectKeyPerIndDisapModel? {
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