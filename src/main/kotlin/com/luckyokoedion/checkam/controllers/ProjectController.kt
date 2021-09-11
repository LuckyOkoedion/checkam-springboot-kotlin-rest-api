package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.dtos.CreateProject
import com.luckyokoedion.checkam.dtos.UpdateProject
import com.luckyokoedion.checkam.models.ProjectModel
import com.luckyokoedion.checkam.repositories.ProjectRepository
import kotlinx.coroutines.flow.toList
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/projects")
class ProjectController(val theRepo: ProjectRepository) {
    @PostMapping
    suspend fun create(@RequestBody theData: CreateProject): ResponseEntity<ProjectModel> {
        val theObj = ProjectModel(0,
                theData.name, theData.community, theData.awarded_by_and_for, theData.cost,
        theData.date_awarded, theData.deadline, theData.name_of_elected_official_in_charge)

        return try {
            val theResult = theRepo.save(theObj)
            ResponseEntity(theResult, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping
    suspend fun getAll(): ResponseEntity<List<ProjectModel>> {

        return try {
            val theResult = theRepo.findAll().toList()
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long): ResponseEntity<ProjectModel> {
        return try {
            val theResult = theRepo.findById(id)
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }
    }

    @PutMapping
    suspend fun update(@RequestBody theData: UpdateProject): ResponseEntity<ProjectModel> {
        val theObj = theRepo.findById(theData.id)
        if (theObj != null) {
            theObj.awarded_by_and_for = theData.awarded_by_and_for
            theObj.community = theData.community
            theObj.cost = theData.cost
            theObj.name = theData.name
            theObj.date_awarded = theData.date_awarded
            theObj.deadline = theData.deadline
            theObj.name_of_elected_official_in_charge = theData.name_of_elected_official_in_charge

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

    @DeleteMapping
    suspend fun delete(@RequestParam id: Long): ResponseEntity<Unit> {
        return try {
            val theResult = theRepo.deleteById(id)
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }
    }
}