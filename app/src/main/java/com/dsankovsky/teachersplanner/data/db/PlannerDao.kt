package com.dsankovsky.teachersplanner.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dsankovsky.teachersplanner.data.models.LessonDbModel
import com.dsankovsky.teachersplanner.data.models.StudentDbModel
import kotlinx.coroutines.flow.Flow

@Dao
interface PlannerDao {

    @Query("SELECT * FROM students ORDER BY name ASC")
    fun getStudentsList(): Flow<List<StudentDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addStudent(studentDbModel: StudentDbModel)

    @Query("DELETE FROM students WHERE id=:studentId")
    suspend fun deleteStudent(studentId: Int)

    @Query("SELECT * FROM students WHERE id=:studentId LIMIT 1")
    suspend fun getStudent(studentId: Int): StudentDbModel


    @Query("SELECT * FROM lessons ORDER BY date ASC")
    fun getLessonsList(): Flow<List<LessonDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addLesson(lessonDbModel: LessonDbModel)

    @Query("DELETE FROM lessons WHERE id=:studentId")
    suspend fun deleteLesson(studentId: Int)

    @Query("SELECT * FROM lessons WHERE id=:lessonId LIMIT 1")
    suspend fun getLesson(lessonId: Int): LessonDbModel

    @Query("SELECT * FROM lessons WHERE studentId=:studentId ORDER BY date ASC")
    fun getLessonsListByStudentId(studentId: Int): Flow<List<LessonDbModel>>
}