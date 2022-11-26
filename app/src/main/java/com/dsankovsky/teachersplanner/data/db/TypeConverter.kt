package com.dsankovsky.teachersplanner.data.db

import com.dsankovsky.teachersplanner.domain.model.LessonState

class TypeConverter {

    @androidx.room.TypeConverter
    fun toLessonState(value: String) = enumValueOf<LessonState>(value)

    @androidx.room.TypeConverter
    fun fromLessonState(value: LessonState) = value.name
}