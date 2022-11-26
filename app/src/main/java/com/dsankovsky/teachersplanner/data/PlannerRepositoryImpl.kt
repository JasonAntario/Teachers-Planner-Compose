package com.dsankovsky.teachersplanner.data

import android.app.Application
import com.dsankovsky.teachersplanner.data.db.AppDatabase
import com.dsankovsky.teachersplanner.data.db.PlannerMapper
import com.dsankovsky.teachersplanner.domain.model.Lesson
import com.dsankovsky.teachersplanner.domain.model.Student
import com.dsankovsky.teachersplanner.domain.repositories.PlannerRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class PlannerRepositoryImpl(application: Application) : PlannerRepository {

    private val plannerDao = AppDatabase.getInstance(application).plannerDao()
    private val mapper = PlannerMapper()

    override fun getStudentsList(): Flow<List<Student>> =
        plannerDao.getStudentsList()
            .map { list ->
                list.map {
                    mapper.mapDbModelToEntity(it)
                }
            }

    override suspend fun addStudent(student: Student) {
        plannerDao.addStudent(mapper.mapEntityToDbModel(student))
    }

    override suspend fun deleteStudent(student: Student) {
        plannerDao.deleteStudent(student.id)
    }

    override suspend fun editStudent(student: Student) {
        plannerDao.addStudent(mapper.mapEntityToDbModel(student))
    }

    override suspend fun getStudent(studentId: Int) =
        mapper.mapDbModelToEntity(plannerDao.getStudent(studentId))


    override fun getLessonsList(): Flow<List<Lesson>> =
        plannerDao.getLessonsList()
            .map { list ->
                list.map {
                    mapper.mapDbModelToEntity(it)
                }
            }

    override fun getLessonsListByStudentId(studentId: Int): Flow<List<Lesson>> =
        plannerDao.getLessonsListByStudentId(studentId)
            .map { list ->
                list.map {
                    mapper.mapDbModelToEntity(it)
                }
            }

    override suspend fun addLesson(lesson: Lesson) {
        plannerDao.addLesson(mapper.mapEntityToDbModel(lesson))
    }

    override suspend fun deleteLesson(lesson: Lesson) {
        plannerDao.deleteLesson(lesson.id)
    }

    override suspend fun editLesson(lesson: Lesson) {
        plannerDao.addLesson(mapper.mapEntityToDbModel(lesson))
    }

    override suspend fun getLesson(lessonId: Int): Lesson =
        mapper.mapDbModelToEntity(plannerDao.getLesson(lessonId))

}