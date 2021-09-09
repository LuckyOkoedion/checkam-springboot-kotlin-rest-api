package com.luckyokoedion.checkam.models

import javax.persistence.*

@Entity
class ProjectKeyPerIndDisapModel (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        @Column(nullable = false)
        val project: Int,
        @Column(nullable = false)
        val disapproval_vote_count: Int


        )