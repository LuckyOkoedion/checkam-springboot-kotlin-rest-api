package com.luckyokoedion.checkam.dtos

import java.math.BigDecimal
import java.util.*

data class CreateProject(
        val name: String,
        val community: Int,
        val awarded_by_and_for: String,
        val cost: BigDecimal,
        val date_awarded: Date,
        val deadline: Date,
        val name_of_elected_official_in_charge: String,
)
