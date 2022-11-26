package com.dsankovsky.teachersplanner.data.db

import com.dsankovsky.teachersplanner.data.models.LessonDbModel
import com.dsankovsky.teachersplanner.data.models.StudentDbModel
import com.dsankovsky.teachersplanner.domain.model.Lesson
import com.dsankovsky.teachersplanner.domain.model.Student

class PlannerMapper {

    fun mapEntityToDbModel(student: Student) = StudentDbModel(
        id = student.id,
        name = student.name,
        address = student.address,
        level = student.level,
        price = student.price,
        debt = student.debt
    )

    fun mapDbModelToEntity(studentDbModel: StudentDbModel) = Student(
        id = studentDbModel.id,
        name = studentDbModel.name,
        address = studentDbModel.address,
        level = studentDbModel.level,
        price = studentDbModel.price,
        debt = studentDbModel.debt
    )

    fun mapEntityToDbModel(lesson: Lesson) = LessonDbModel(
        id = lesson.id,
        topic = lesson.topic,
        date = lesson.date,
        state = lesson.state,
        comment = lesson.comment,
        studentId = lesson.studentId
    )

    fun mapDbModelToEntity(lessonDbModel: LessonDbModel) = Lesson(
        id = lessonDbModel.id,
        topic = lessonDbModel.topic,
        date = lessonDbModel.date,
        state = lessonDbModel.state,
        comment = lessonDbModel.comment,
        studentId = lessonDbModel.studentId
    )
}