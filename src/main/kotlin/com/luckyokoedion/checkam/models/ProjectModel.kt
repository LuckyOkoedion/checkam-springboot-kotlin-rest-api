package com.luckyokoedion.checkam.models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.math.BigDecimal
import java.util.*

@Table
data class ProjectModel (
        @Id
        var id: Long,
        var name: String,
        var community: Int,
        var awarded_by_and_for: String,
        var cost: BigDecimal,
        var date_awarded: Date,
        var deadline: Date,
        var name_of_elected_official_in_charge: String,

        )