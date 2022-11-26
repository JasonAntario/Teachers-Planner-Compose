package com.dsankovsky.teachersplanner.domain.usecases.lessons

import com.dsankovsky.teachersplanner.domain.repositories.PlannerRepository

class GetLessonsListByStudentIdUseCase(private val plannerRepository: PlannerRepository) {

    operator fun invoke(studentId: Int) = plannerRepository.getLessonsListByStudentId(studentId)
}