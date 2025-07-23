package com.example.digitalacademyapp.ui.screens

import androidx.compose.runtime.Composable
import com.example.digitalacademyapp.models.Course
import com.example.digitalacademyapp.ui.courses.getCourseCategories

@Composable
fun getRecommendationsForRole(role: String): List<Course> {
    val allCats = getCourseCategories()


    val devCourses = allCats.find {
        it.categoryName.equals("Software Development", ignoreCase = true) ||
                it.categoryName.equals("Ανάπτυξη Λογισμικού", ignoreCase = true)
    }?.courses.orEmpty()

    val cyberCourses = allCats.find {
        it.categoryName.equals("Cybersecurity", ignoreCase = true) ||
                it.categoryName.equals("Κυβερνοασφάλεια", ignoreCase = true)
    }?.courses.orEmpty()

    val aiCourses = allCats.find {
        it.categoryName.equals("Artificial Intelligence", ignoreCase = true) ||
                it.categoryName.equals("Τεχνητή Νοημοσύνη", ignoreCase = true)
    }?.courses.orEmpty()

    val r = role.lowercase().trim()


    // Software Development regex keywords
    val devRegexList = listOf(
        Regex("^dev.*"),
        Regex("^pyth.*"),
        Regex("^progr.*"),        // progr*
        Regex("^προγ.*"),         // προγ* (προγραμματισμός κλπ)
        Regex("^κωδικ.*"),         // κωδικ* (κωδικός, κωδικοποίηση)
        Regex("^softw.*"),        // softw* (software)
        Regex("developer"),       // απλές λέξεις
        Regex("programmer"),
        Regex("software"),
        Regex("προγραμματιστή"),
        Regex("ανάπτυξη"),
        Regex("προγραμματιστής"),
        Regex("προγραμματίστρια"),
        Regex("προγραμματισμός"),
    )


    // AI regex keywords
    val aiRegexList = listOf(
        Regex("^ai.*"),           // ai*
        Regex("a\\.i\\.*"),       // A.I* ή a.i*
        Regex("^artifi.*"),       // artifi* (artificial)
        Regex("^τεχνητ.*"),       // τεχνητ* (τεχνητή, τεχνητο κλπ)
        Regex("^robo.*"),         // robo* (robotics)
        Regex("^ρομπο.*"),        // ρομπο*
        Regex("^machin.*"),       // machin* (machine learning)
        Regex("^μηχανικ.*"),      // μηχανικ* (μηχανική μάθηση)
        Regex("neural network"),
        Regex("νευρωνικ.*"),      // νευρωνικά, νευρωνικο
        Regex("deep learning"),
        Regex("machine learning"),
        Regex("τεχνητή νοημοσύνη"),
        Regex("τεχνητη νοημοσυνη"),
    )


    // Cybersecurity regex keywords
    val cyberRegexList = listOf(
        Regex("^cyber.*"),        // cyber*
        Regex("^sec.*"),          // sec* (security)
        Regex("^hack.*"),         // hack*
        Regex("^penetr.*"),       // penetr* (penetration)
        Regex("^anali.*"),        // anali* (analysis)
        Regex("^κυβερνοα.*"),     // κυβερνοασφάλεια, κυβερνοεπίθεση
        Regex("^χακ.*"),          // χακ*, hackers, hacking
        Regex("^ασφ.*"),          // ασφ* (ασφάλεια, ασφαλείας)
        Regex("malware"),
        Regex("ransomware"),
        Regex("phishing"),
        Regex("ddos"),
        Regex("pentest"),
        Regex("penetration testing"),
        Regex("cybersecurity"),
        Regex("cyber security"),
        Regex("ηλεκτρονική ασφάλεια"),
        Regex("^αναλ.*"),
    )


    // Helper function to test if any regex matches the role string
    fun matchesAnyRegex(text: String, regexList: List<Regex>): Boolean {
        return regexList.any { it.containsMatchIn(text) }
    }


    return when {
        matchesAnyRegex(r, devRegexList) -> devCourses
        matchesAnyRegex(r, cyberRegexList) -> cyberCourses.ifEmpty { devCourses.take(1) }
        matchesAnyRegex(r, aiRegexList) -> aiCourses.ifEmpty { devCourses.take(1) }
        else -> emptyList()
    }
}

