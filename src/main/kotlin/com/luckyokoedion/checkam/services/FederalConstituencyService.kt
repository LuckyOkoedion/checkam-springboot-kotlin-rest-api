package com.luckyokoedion.checkam.services


import com.luckyokoedion.checkam.models.FederalConstituencyModel
import com.luckyokoedion.checkam.repositories.FederalConstituencyRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class FederalConstituencyService(val theRepo: FederalConstituencyRepository ) {

    suspend fun create(theData: FederalConstituencyModel) : FederalConstituencyModel =
            theRepo.save(theData)

    suspend fun getAll(): MutableIterable<FederalConstituencyModel> = theRepo.findAll()

    suspend fun getOneById(id: Long): Optional<FederalConstituencyModel> = theRepo.findById(id)

    suspend fun update(id: Long, theData: FederalConstituencyModel): FederalConstituencyModel? {
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