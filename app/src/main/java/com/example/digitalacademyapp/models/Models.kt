package com.example.digitalacademyapp.models

import androidx.compose.ui.graphics.Color

data class Course(
    val id: String,
    val title: String,
    val level: String,
    val duration: String,
    val description: String,

    val iconRes: Int? = null
)

data class CourseCategory(
    val categoryName: String,
    val iconRes: Int? = null,
    val courses: List<Course>
)

data class Badge(
    val courseName: String,
    val dateEarned: String,
    val level: String,
    val iconRes: Int? = null
) {
    fun getLevelColor(): Color = when (level) {
        "Beginner", "Αρχάριος" -> Color(0xFF4CAF50)
        "Intermediate", "Μέσο επίπεδο" -> Color(0xFF2196F3)
        "Advanced", "Προχωρημένος" -> Color(0xFF9C27B0)
        else -> Color(0xFF607D8B)
    }
}

data class QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctAnswer: String
) {
    companion object {
        fun isEmpty() = true
    }
}
