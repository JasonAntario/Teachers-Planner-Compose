package com.dsankovsky.teachersplanner.domain.usecases.students

import com.dsankovsky.teachersplanner.domain.repositories.PlannerRepository

class GetStudentUseCase (private val plannerRepository: PlannerRepository) {

    suspend operator fun invoke(studentId: Int) = plannerRepository.getStudent(studentId)
}