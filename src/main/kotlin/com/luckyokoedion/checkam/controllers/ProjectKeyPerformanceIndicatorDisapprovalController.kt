package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.dtos.CreateProjectKpiDisap
import com.luckyokoedion.checkam.dtos.UpdateProjectKpiDisap
import com.luckyokoedion.checkam.models.ProjectKeyPerIndDisapModel
import com.luckyokoedion.checkam.repositories.ProjectKeyPerIndDisapRepository
import kotlinx.coroutines.flow.toList
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/project-kpi-disapproval")
class ProjectKeyPerformanceIndicatorDisapprovalController(val theRepo: ProjectKeyPerIndDisapRepository) {
    @PostMapping
    suspend fun create(@RequestBody theData: CreateProjectKpiDisap): ResponseEntity<ProjectKeyPerIndDisapModel> {
        val theObj = ProjectKeyPerIndDisapModel(0,
                theData.project, theData.disapproval_vote_count
        )

        return try {
            val theResult = theRepo.save(theObj)
            ResponseEntity(theResult, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping
    suspend fun getAll(): ResponseEntity<List<ProjectKeyPerIndDisapModel>> {

        return try {
            val theResult = theRepo.findAll().toList()
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping("/{id}")
    suspend fun getOneById(@RequestParam id: Long): ResponseEntity<ProjectKeyPerIndDisapModel> {
        return try {
            val theResult = theRepo.findById(id)
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }
    }

    @PutMapping
    suspend fun update(@RequestBody theData: UpdateProjectKpiDisap): ResponseEntity<ProjectKeyPerIndDisapModel> {
        val theObj = theRepo.findById(theData.id)
        if (theObj != null) {
            theObj.project = theData.project
            theObj.disapproval_vote_count = theData.disapproval_vote_count


            return try {
                val theResult = theRepo.save(theObj)
                ResponseEntity(theResult,HttpStatus.OK)
            } catch (e: Exception) {
                ResponseEntity(HttpStatus.NO_CONTENT)
            }

        }else {
            return ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @DeleteMapping("/{id}")
    suspend fun delete(@RequestParam id: Long): ResponseEntity<Unit> {
        return try {
            val theResult = theRepo.deleteById(id)
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }
    }

}