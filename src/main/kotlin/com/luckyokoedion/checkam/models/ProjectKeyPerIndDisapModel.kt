package com.luckyokoedion.checkam.models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class ProjectKeyPerIndDisapModel (
        @Id
       var id: Long,
       var project: Int,
       var disapproval_vote_count: Int


        )