package com.luckyokoedion.checkam.controllers


import com.luckyokoedion.checkam.dtos.CreateSenatorialDistrict
import com.luckyokoedion.checkam.dtos.UpdateSenatorialDistrict
import com.luckyokoedion.checkam.models.SenatorialDistrictModel
import com.luckyokoedion.checkam.repositories.SenatorialDistrictRepository
import kotlinx.coroutines.flow.toList
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/senatorial-districts")
class SenatorialDistrictController(val theRepo: SenatorialDistrictRepository) {
    @PostMapping
    suspend fun create(@RequestBody theData: CreateSenatorialDistrict): ResponseEntity<SenatorialDistrictModel> {
        val theObj = SenatorialDistrictModel(0,
                theData.name)

        return try {
            val theResult = theRepo.save(theObj)
            ResponseEntity(theResult, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping
    suspend fun getAll(): ResponseEntity<List<SenatorialDistrictModel>> {

        return try {
            val theResult = theRepo.findAll().toList()
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }

    @GetMapping("/{id}")
    suspend fun getOneById(@RequestParam id: Long): ResponseEntity<SenatorialDistrictModel> {
        return try {
            val theResult = theRepo.findById(id)
            ResponseEntity(theResult,HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        }
    }

    @PutMapping
    suspend fun update(@RequestBody theData: UpdateSenatorialDistrict): ResponseEntity<SenatorialDistrictModel> {
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