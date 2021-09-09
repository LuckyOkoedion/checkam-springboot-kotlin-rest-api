package com.luckyokoedion.checkam.models

import javax.persistence.*

@Entity
class FederalConstituencyModel (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        @Column(nullable = false)
        val name: String

)