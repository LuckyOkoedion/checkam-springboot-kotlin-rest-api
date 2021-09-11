package com.luckyokoedion.checkam.models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class ProjectReviewModel(
        @Id
        var id: Long,
        var user_called_project_monitor: Int,
        var review: String,
        var sentiment: Boolean
)