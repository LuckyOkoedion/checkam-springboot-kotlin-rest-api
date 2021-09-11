package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.dtos.CreateLocalGovernment
import com.luckyokoedion.checkam.dtos.UpdateLocalGovernment
import com.luckyokoedion.checkam.models.LocalGovernmentModel
import com.luckyokoedion.checkam.repositories.LocalGovernmentRepository
import kotlinx.coroutines.flow.toList
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/local-government-areas")
class LocalGovernmentController(val theRepo: LocalGovernmentRepository) {
    @PostMapping
    suspend fun create(@RequestBody theData: CreateLocalGovernment): ResponseEntity<LocalGovernmentModel> {
        val theObj = LocalGovernmentModel(0,
                theData.name
        )

        return try {
            val theResult = theRepo.save(theObj)
            ResponseEntity(theResult, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping
    suspend fun getAll(): ResponseEntity<List<LocalGovernmentModel>> {

        return try {
            val theResult = theRepo.findAll().toList()
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long): ResponseEntity<LocalGovernmentModel> {
        return try {
            val theResult = theRepo.findById(id)
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }
    }

    @PutMapping
    suspend fun update(@RequestBody theData: UpdateLocalGovernment): ResponseEntity<LocalGovernmentModel> {
        val theObj = theRepo.findById(theData.id)
        if (theObj != null) {
            theObj.name = theData.name


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