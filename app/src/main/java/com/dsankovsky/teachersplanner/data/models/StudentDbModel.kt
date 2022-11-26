package com.dsankovsky.teachersplanner.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
data class StudentDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val address: String,
    val level: String,
    val price: Int,
    val debt: Int
)