package com.luckyokoedion.checkam.services

import com.luckyokoedion.checkam.models.ProjectMonitorModel
import com.luckyokoedion.checkam.repositories.ProjectMonitorRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProjectMonitorService(val theRepo: ProjectMonitorRepository) {

    suspend fun create(theData: ProjectMonitorModel) : ProjectMonitorModel =
            theRepo.save(theData)

    suspend fun getAll(): MutableIterable<ProjectMonitorModel> = theRepo.findAll()

    suspend fun getOneById(id: Long): Optional<ProjectMonitorModel> = theRepo.findById(id)

    suspend fun update(id: Long, theData: ProjectMonitorModel): ProjectMonitorModel? {
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