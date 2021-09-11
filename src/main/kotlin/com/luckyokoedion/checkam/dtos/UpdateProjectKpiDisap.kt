package com.luckyokoedion.checkam.dtos

data class UpdateProjectKpiDisap(
        val id: Long,
        val project: Int,
        val disapproval_vote_count: Int
)
