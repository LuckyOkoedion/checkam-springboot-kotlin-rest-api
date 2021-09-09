package com.luckyokoedion.checkam.models

import javax.persistence.*

@Entity
class SenatorialDistrictModel (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        @Column(nullable = false)
        val name: String
)