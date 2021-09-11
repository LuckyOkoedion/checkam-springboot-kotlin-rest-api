package com.luckyokoedion.checkam.models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table
data class FederalConstituencyModel (
        @Id
        var id: Long,
        var name: String

)