package com.dsankovsky.teachersplanner.domain.usecases.students

import com.dsankovsky.teachersplanner.domain.repositories.PlannerRepository

class GetStudentsListUseCase(private val plannerRepository: PlannerRepository) {

    operator fun invoke() = plannerRepository.getStudentsList()
}