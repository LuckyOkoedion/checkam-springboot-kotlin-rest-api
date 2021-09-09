package com.luckyokoedion.checkam.models

import javax.persistence.*

@Entity
class LocalGovernmentModel(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        @Column(nullable = false)
        val name: String
)