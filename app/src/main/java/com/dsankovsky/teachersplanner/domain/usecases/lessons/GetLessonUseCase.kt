package com.dsankovsky.teachersplanner.domain.usecases.lessons

import com.dsankovsky.teachersplanner.domain.repositories.PlannerRepository

class GetLessonUseCase  (private val plannerRepository: PlannerRepository) {

    suspend operator fun invoke(lessonId: Int) = plannerRepository.getLesson(lessonId)
}