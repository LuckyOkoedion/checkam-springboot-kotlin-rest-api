package com.luckyokoedion.checkam.models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table
data class CommunityModel (
        @Id
        var id: Long,
        var name: String,
        var state: Int,
        var local_government: Int,
        var senatorial_district: Int,
        var federal_constituency: Int,
        var population: Int,
        var history: String,
        var pictures: String


        )





