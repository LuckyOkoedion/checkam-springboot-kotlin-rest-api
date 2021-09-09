package com.luckyokoedion.checkam.models

import javax.persistence.*

@Entity
class ProjectKeyPerIndModel (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        @Column(nullable = false)
        val description: String,
        @Column(nullable = false)
        val project: Int

        )