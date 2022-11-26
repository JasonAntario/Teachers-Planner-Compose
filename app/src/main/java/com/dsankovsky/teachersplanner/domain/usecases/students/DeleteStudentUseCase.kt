package com.dsankovsky.teachersplanner.domain.usecases.students

import com.dsankovsky.teachersplanner.domain.model.Student
import com.dsankovsky.teachersplanner.domain.repositories.PlannerRepository

class DeleteStudentUseCase  (private val plannerRepository: PlannerRepository) {

    suspend operator fun invoke(student: Student) = plannerRepository.deleteStudent(student)
}