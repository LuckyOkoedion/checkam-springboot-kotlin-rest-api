package com.luckyokoedion.checkam.dtos

data class CreateProjectReview(
        val user_called_project_monitor: Int,
        val review: String,
        val sentiment: Boolean
)
