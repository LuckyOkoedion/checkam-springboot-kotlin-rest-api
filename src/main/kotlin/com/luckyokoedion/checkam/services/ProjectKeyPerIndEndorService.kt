package com.luckyokoedion.checkam.services

import com.luckyokoedion.checkam.models.ProjectKeyPerIndEndorModel
import com.luckyokoedion.checkam.repositories.ProjectKeyPerIndEndorRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProjectKeyPerIndEndorService(val theRepo: ProjectKeyPerIndEndorRepository) {

    suspend fun create(theData: ProjectKeyPerIndEndorModel) : ProjectKeyPerIndEndorModel =
            theRepo.save(theData)

    suspend fun getAll(): MutableIterable<ProjectKeyPerIndEndorModel> = theRepo.findAll()

    suspend fun getOneById(id: Long): Optional<ProjectKeyPerIndEndorModel> = theRepo.findById(id)

    suspend fun update(id: Long, theData: ProjectKeyPerIndEndorModel): ProjectKeyPerIndEndorModel? {
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