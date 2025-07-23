package com.example.digitalacademyapp.ui.courses

import androidx.compose.runtime.staticCompositionLocalOf

val LocalAppLanguage = staticCompositionLocalOf { AppLanguage.ENGLISH }
enum class AppLanguage {
    ENGLISH,
    GREEK

}
