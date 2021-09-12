package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.dtos.CreateProjectMonitor
import com.luckyokoedion.checkam.dtos.UpdateProjectMonitor
import com.luckyokoedion.checkam.models.ProjectMonitorModel
import com.luckyokoedion.checkam.repositories.ProjectMonitorRepository
import kotlinx.coroutines.flow.toList
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/project-monitors")
class ProjectMonitorController(val theRepo: ProjectMonitorRepository) {
    @PostMapping
    suspend fun create(@RequestBody theData: CreateProjectMonitor): ResponseEntity<ProjectMonitorModel> {
        val theObj = ProjectMonitorModel(0,
                theData.first_name, theData.last_name, theData.email,
        theData.phone_no)

        return try {
            val theResult = theRepo.save(theObj)
            ResponseEntity(theResult, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping
    suspend fun getAll(): ResponseEntity<List<ProjectMonitorModel>> {

        return try {
            val theResult = theRepo.findAll().toList()
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping("/{id}")
    suspend fun getOneById(@RequestParam id: Long): ResponseEntity<ProjectMonitorModel> {
        return try {
            val theResult = theRepo.findById(id)
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }
    }

    @PutMapping
    suspend fun update(@RequestBody theData: UpdateProjectMonitor): ResponseEntity<ProjectMonitorModel> {
        val theObj = theRepo.findById(theData.id)
        if (theObj != null) {
            theObj.email = theData.email
            theObj.first_name = theData.first_name
            theObj.last_name = theData.last_name
            theObj.phone_no = theData.phone_no

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