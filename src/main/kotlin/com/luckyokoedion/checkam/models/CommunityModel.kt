package com.luckyokoedion.checkam.models

import javax.persistence.*


@Entity
class CommunityModel (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        @Column(nullable = false)
        val name: String,
        @Column(nullable = false)
        val state: Int,
        @Column(nullable = false)
        val local_government: Int,
        @Column(nullable = false)
        val senatorial_district: Int,
        @Column(nullable = false)
        val federal_constituency: Int,
        @Column(nullable = true)
        val population: Int,
        @Lob
        @Column( length = 100000, nullable = true )
        val history: String,
        @Lob
        @Column( length = 100000, nullable = true )
        val pictures: String




        )





