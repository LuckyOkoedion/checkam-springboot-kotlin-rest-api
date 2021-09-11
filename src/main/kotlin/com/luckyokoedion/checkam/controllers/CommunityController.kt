package com.luckyokoedion.checkam.controllers

import com.luckyokoedion.checkam.dtos.CreateCommunity
import com.luckyokoedion.checkam.dtos.UpdateCommunity
import com.luckyokoedion.checkam.models.CommunityModel
import com.luckyokoedion.checkam.repositories.CommunityRepository
import kotlinx.coroutines.flow.toList
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.HttpServerErrorException

@RestController
@RequestMapping("/communities")
class CommunityController(val theRepo: CommunityRepository) {

    @PostMapping
    suspend fun create(@RequestBody theData: CreateCommunity): ResponseEntity<CommunityModel> {
        val theObj = CommunityModel(0,
                theData.name, theData.state, theData.local_government,
        theData.senatorial_district, theData.federal_constituency,
        theData.population, theData.history, theData.pictures)

        return try {
            val theResult = theRepo.save(theObj)
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping
    suspend fun getAll(): ResponseEntity<List<CommunityModel>> {

        return try {
            val theResult = theRepo.findAll().toList()
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping
    suspend fun getOneById(@RequestParam id: Long): ResponseEntity<CommunityModel> {
        return try {
            val theResult = theRepo.findById(id)
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }
    }

    @PutMapping
    suspend fun update(@RequestBody theData: UpdateCommunity): ResponseEntity<CommunityModel> {
        val theObj = theRepo.findById(theData.id)
        if (theObj != null) {
            theObj.federal_constituency = theData.federal_constituency
            theObj.history = theData.history
            theObj.local_government = theData.local_government
            theObj.name = theData.name
            theObj.pictures = theData.pictures
            theObj.population = theData.population
            theObj.senatorial_district = theData.senatorial_district
            theObj.state = theData.state

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