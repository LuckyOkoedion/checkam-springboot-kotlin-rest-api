package com.luckyokoedion.checkam.dtos

data class UpdateProjectMonitor(
        val id: Long,
        val first_name: String,
        val last_name: String,
        val email: String,
        val phone_no: String
)
