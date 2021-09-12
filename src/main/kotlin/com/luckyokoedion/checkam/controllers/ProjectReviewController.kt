package com.luckyokoedion.checkam.controllers


import com.luckyokoedion.checkam.dtos.CreateProjectReview
import com.luckyokoedion.checkam.dtos.UpdateProjectReview
import com.luckyokoedion.checkam.models.ProjectReviewModel
import com.luckyokoedion.checkam.repositories.ProjectReviewRepository
import kotlinx.coroutines.flow.toList
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/project-reviews")
class ProjectReviewController(val theRepo: ProjectReviewRepository) {
    @PostMapping
    suspend fun create(@RequestBody theData: CreateProjectReview): ResponseEntity<ProjectReviewModel> {
        val theObj = ProjectReviewModel(0,
                theData.user_called_project_monitor, theData.review, theData.sentiment,
       )

        return try {
            val theResult = theRepo.save(theObj)
            ResponseEntity(theResult, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping
    suspend fun getAll(): ResponseEntity<List<ProjectReviewModel>> {

        return try {
            val theResult = theRepo.findAll().toList()
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping("/{id}")
    suspend fun getOneById(@RequestParam id: Long): ResponseEntity<ProjectReviewModel> {
        return try {
            val theResult = theRepo.findById(id)
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }
    }

    @PutMapping
    suspend fun update(@RequestBody theData: UpdateProjectReview): ResponseEntity<ProjectReviewModel> {
        val theObj = theRepo.findById(theData.id)
        if (theObj != null) {
            theObj.review = theData.review
            theObj.sentiment = theData.sentiment
            theObj.user_called_project_monitor = theData.user_called_project_monitor

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