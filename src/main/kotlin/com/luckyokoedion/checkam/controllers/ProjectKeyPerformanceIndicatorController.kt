package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.dtos.CreateProjectKpi
import com.luckyokoedion.checkam.dtos.UpdateProjectKpi
import com.luckyokoedion.checkam.models.ProjectKeyPerIndModel
import com.luckyokoedion.checkam.repositories.ProjectKeyPerIndRepository
import kotlinx.coroutines.flow.toList
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/project-kpi-indicators")
class ProjectKeyPerformanceIndicatorController(val theRepo: ProjectKeyPerIndRepository) {
    @PostMapping
    suspend fun create(@RequestBody theData: CreateProjectKpi): ResponseEntity<ProjectKeyPerIndModel> {
        val theObj = ProjectKeyPerIndModel(0,
                theData.description, theData.project)

        return try {
            val theResult = theRepo.save(theObj)
            ResponseEntity(theResult, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping
    suspend fun getAll(): ResponseEntity<List<ProjectKeyPerIndModel>> {

        return try {
            val theResult = theRepo.findAll().toList()
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping("/{id}")
    suspend fun getOneById(@RequestParam id: Long): ResponseEntity<ProjectKeyPerIndModel> {
        return try {
            val theResult = theRepo.findById(id)
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }
    }

    @PutMapping
    suspend fun update(@RequestBody theData: UpdateProjectKpi): ResponseEntity<ProjectKeyPerIndModel> {
        val theObj = theRepo.findById(theData.id)
        if (theObj != null) {
            theObj.description = theData.description
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