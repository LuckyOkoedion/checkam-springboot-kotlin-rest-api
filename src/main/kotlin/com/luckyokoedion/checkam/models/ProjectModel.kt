package com.luckyokoedion.checkam.models

import org.springframework.format.annotation.DateTimeFormat
import java.util.*
import javax.persistence.*

@Entity
class ProjectModel (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        @Column(nullable = false)
        val name: String,
        @Column(nullable = false)
        val community: Int,
        @Column(nullable = false)
        val awarded_by_and_for: String,
        @Column(nullable = false)
        val cost: Int,
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        @Column(nullable = false)
        val date_awarded: Date,
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        @Column(nullable = true)
        val deadline: Date,
        @Column(nullable = false)
        val name_of_elected_official_in_charge: String,

        )