package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.dtos.CreateProjectKpiEndor
import com.luckyokoedion.checkam.dtos.UpdateProjectKpiEndor
import com.luckyokoedion.checkam.models.ProjectKeyPerIndEndorModel
import com.luckyokoedion.checkam.repositories.ProjectKeyPerIndEndorRepository
import kotlinx.coroutines.flow.toList
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/project-kpi-endorsements")
class ProjectKeyPerformanceIndicatorEndorsementController(val theRepo: ProjectKeyPerIndEndorRepository) {

    @PostMapping
    suspend fun create(@RequestBody theData: CreateProjectKpiEndor): ResponseEntity<ProjectKeyPerIndEndorModel> {
        val theObj = ProjectKeyPerIndEndorModel(0,
                theData.project, theData.endorsement_vote_count)

        return try {
            val theResult = theRepo.save(theObj)
            ResponseEntity(theResult, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping
    suspend fun getAll(): ResponseEntity<List<ProjectKeyPerIndEndorModel>> {

        return try {
            val theResult = theRepo.findAll().toList()
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping("/{id}")
    suspend fun getOneById(@RequestParam id: Long): ResponseEntity<ProjectKeyPerIndEndorModel> {
        return try {
            val theResult = theRepo.findById(id)
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }
    }

    @PutMapping
    suspend fun update(@RequestBody theData: UpdateProjectKpiEndor): ResponseEntity<ProjectKeyPerIndEndorModel> {
        val theObj = theRepo.findById(theData.id)
        if (theObj != null) {
            theObj.endorsement_vote_count = theData.endorsement_vote_count
            theObj.project = theData.project

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