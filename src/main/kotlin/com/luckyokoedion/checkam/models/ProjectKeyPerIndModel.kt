package com.luckyokoedion.checkam.models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class ProjectKeyPerIndModel (
        @Id
        var id: Long,
        var description: String,
        var project: Int

        )