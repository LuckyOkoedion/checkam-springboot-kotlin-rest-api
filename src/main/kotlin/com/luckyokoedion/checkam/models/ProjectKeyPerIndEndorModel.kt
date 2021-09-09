package com.luckyokoedion.checkam.models

import javax.persistence.*

@Entity
class ProjectKeyPerIndEndorModel (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        @Column(nullable = false)
        val project: Int,
        @Column(nullable = false)
        val endorsement_vote_count: Int
        )