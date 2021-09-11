package com.luckyokoedion.checkam.dtos

data class UpdateProjectKpiEndor(
        val id: Long,
        val project: Int,
        val endorsement_vote_count: Int
)
