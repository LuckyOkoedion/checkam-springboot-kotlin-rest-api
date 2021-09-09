package com.luckyokoedion.checkam.models

import javax.persistence.*

@Entity
class ProjectReviewModel(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        @Column(nullable = false)
        val user_called_project_monitor: Int,
        @Column(nullable = false)
        val review: String,
        @Column(nullable = true)
        val sentiment: Boolean
)