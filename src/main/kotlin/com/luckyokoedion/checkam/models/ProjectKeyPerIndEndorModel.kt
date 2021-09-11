package com.luckyokoedion.checkam.models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class ProjectKeyPerIndEndorModel (
        @Id
        var id: Long,
        var project: Int,
        var endorsement_vote_count: Int
        )