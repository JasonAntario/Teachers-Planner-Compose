package com.dsankovsky.teachersplanner.domain.usecases.lessons

import com.dsankovsky.teachersplanner.domain.model.Lesson
import com.dsankovsky.teachersplanner.domain.repositories.PlannerRepository

class AddLessonUseCase  (private val plannerRepository: PlannerRepository) {

    suspend operator fun invoke(lesson: Lesson) = plannerRepository.addLesson(lesson)
}