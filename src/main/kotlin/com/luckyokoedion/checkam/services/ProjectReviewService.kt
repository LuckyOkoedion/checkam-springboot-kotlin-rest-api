package com.luckyokoedion.checkam.services

import com.luckyokoedion.checkam.models.ProjectReviewModel
import com.luckyokoedion.checkam.repositories.ProjectReviewRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProjectReviewService(val theRepo: ProjectReviewRepository) {

    suspend fun create(theData: ProjectReviewModel) : ProjectReviewModel =
            theRepo.save(theData)

    suspend fun getAll(): MutableIterable<ProjectReviewModel> = theRepo.findAll()

    suspend fun getOneById(id: Long): Optional<ProjectReviewModel> = theRepo.findById(id)

    suspend fun update(id: Long, theData: ProjectReviewModel): ProjectReviewModel? {
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