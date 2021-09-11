package com.luckyokoedion.checkam.models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class ProjectMonitorModel (
        @Id
        var id: Long,
        var first_name: String,
        var last_name: String,
        var email: String,
        var phone_no: String


        )