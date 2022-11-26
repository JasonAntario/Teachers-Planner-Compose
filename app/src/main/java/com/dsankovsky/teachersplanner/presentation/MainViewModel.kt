package com.dsankovsky.teachersplanner.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.dsankovsky.teachersplanner.data.PlannerRepositoryImpl
import com.dsankovsky.teachersplanner.domain.usecases.students.*

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = PlannerRepositoryImpl(application)

    private val addStudentUseCase = AddStudentUseCase(repository)
    private val getStudentsListUseCase = GetStudentsListUseCase(repository)
    private val getStudentUseCase = GetStudentUseCase(repository)
    private val editStudentUseCase = EditStudentUseCase(repository)
    private val deleteStudentUseCase = DeleteStudentUseCase(repository)

}