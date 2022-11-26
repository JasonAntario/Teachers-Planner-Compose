package com.dsankovsky.teachersplanner.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dsankovsky.teachersplanner.domain.model.LessonState
import java.util.Date

@Entity(tableName = "lessons")
data class LessonDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val topic: String,
    val date: Date,
    val state: LessonState,
    val comment: String,
    val studentId: Int
)

