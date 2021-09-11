package com.luckyokoedion.checkam.dtos

data class UpdateCommunity(
        val id: Long,
        val name: String,
        val state: Int,
        val local_government: Int,
        val senatorial_district: Int,
        val federal_constituency: Int,
        val population: Int,
        val history: String,
        val pictures: String
)
