package com.dsankovsky.teachersplanner.domain.model

import java.util.Date

data class Lesson(
    val id: Int = UNDEFINED_ID,
    val topic: String,
    val date: Date,
    val state: LessonState,
    val comment: String,
    val studentId: Int
) {
    companion object {
        const val UNDEFINED_ID = 0
    }
}
