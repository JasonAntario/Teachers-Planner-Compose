package com.dsankovsky.teachersplanner.domain.repositories

import com.dsankovsky.teachersplanner.domain.model.Lesson
import com.dsankovsky.teachersplanner.domain.model.Student
import kotlinx.coroutines.flow.Flow

interface PlannerRepository {

    fun getStudentsList(): Flow<List<Student>>
    suspend fun addStudent(student: Student)
    suspend fun deleteStudent(student: Student)
    suspend fun editStudent(student: Student)
    suspend fun getStudent(studentId: Int): Student

    fun getLessonsList(): Flow<List<Lesson>>
    fun getLessonsListByStudentId(studentId: Int): Flow<List<Lesson>>
    suspend fun addLesson(lesson: Lesson)
    suspend fun deleteLesson(lesson: Lesson)
    suspend fun editLesson(lesson: Lesson)
    suspend fun getLesson(lessonId: Int): Lesson
}