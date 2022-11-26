package com.dsankovsky.teachersplanner.domain.model

data class Student(
    val id: Int = UNDEFINED_ID,
    val name: String,
    val address: String,
    val level: String,
    val price: Int,
    val debt: Int
) {

    companion object {
        const val UNDEFINED_ID = 0
    }
}
