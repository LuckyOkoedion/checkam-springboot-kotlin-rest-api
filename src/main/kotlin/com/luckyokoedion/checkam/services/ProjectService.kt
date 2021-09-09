package com.luckyokoedion.checkam.services

import com.luckyokoedion.checkam.models.ProjectModel
import com.luckyokoedion.checkam.repositories.ProjectRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProjectService(val theRepo: ProjectRepository) {

    suspend fun create(theData: ProjectModel) : ProjectModel =
            theRepo.save(theData)

    suspend fun getAll(): MutableIterable<ProjectModel> = theRepo.findAll()

    suspend fun getOneById(id: Long): Optional<ProjectModel> = theRepo.findById(id)

    suspend fun update(id: Long, theData: ProjectModel): ProjectModel? {
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