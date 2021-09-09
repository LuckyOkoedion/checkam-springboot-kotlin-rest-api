package com.luckyokoedion.checkam.models

import javax.persistence.*

@Entity
class ProjectMonitorModel (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        @Column(nullable = false)
        val first_name: String,
        @Column(nullable = false)
        val last_name: String,
        @Column(nullable = false)
        val email: String,
        @Column(nullable = false)
        val phone_no: String


        )