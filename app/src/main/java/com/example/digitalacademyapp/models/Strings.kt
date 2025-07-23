package com.example.digitalacademyapp.models

import androidx.compose.runtime.Composable
import com.example.digitalacademyapp.ui.courses.AppLanguage
import com.example.digitalacademyapp.ui.courses.LocalAppLanguage

object Strings {
    @Composable
    fun get(key: String): String {
        val language = LocalAppLanguage.current
        return when (language) {
            AppLanguage.ENGLISH -> englishStrings[key] ?: key
            AppLanguage.GREEK -> greekStrings[key] ?: englishStrings[key] ?: key
        }
    }

    private val englishStrings = mapOf(
        "welcome" to "Welcome to Digital Academy",
        "av_cour" to "Available Courses",
        "setup_profile" to "Let's set up your profile",
        "name" to "Your Name",
        "job_role" to "Your Job Role",
        "continue" to "Continue",
        "courses" to "Courses",
        "achievements" to "Achievements",
        "profile" to "Profile",
        "digital_academy" to "Digital Academy",
        "about_course" to "About this course",
        "view_course_mat" to "View Course Material",
        "hide_course_mat" to "Hide Course Material",
        "quiz" to "Start Quiz",
        "prev" to "Previous",
        "next" to "Next",
        "congz" to "Congratulations! \uD83C\uDF89",
        "try" to "Try Again",
        "earned_badge" to "You've earned a badge for completing this course!",
        "atleast" to "You need at least 80% to pass. Review the material and try again!",
        "continue_learn" to "Continue Learning",
        "back_course" to "Back to Course",
        "score" to "You scored",
        "out" to "out of",
        "no_badge" to "No badges yet. Complete courses to earn achievements!",
        "ach" to "Your Achievements",
        "no_course" to "No courses available yet",
        "no_quiz_available" to "No quiz available in this language",
        "back_course" to "Back to Course",
        "earn" to "Earned on:",
        "wb" to "Welcome Back",
        "slide" to "Slide",
        "of" to "of",
        "Password" to "Password",
        "Register" to "Register",
        "Login" to "Login",
        "Username" to "Username",
        "recommendations" to "Recommended for you",
        "back_login" to "Back to Login",
        "back_reg" to "Back to Register",
        "login_fail" to "Login Failed",
        "fill_all_fields" to "Please Fill all Fields",
        "registration_success" to "Registered Successfully",
        "completed" to "✅ completed"

    )




    private val greekStrings = mapOf(
        "welcome" to "Καλώς ήρθατε στην e-Ακαδημία",
        "Password" to "Κωδικός",
        "Username" to "Όνομα χρήστη",
        "av_cour" to "Διαθέσιμα Μαθήματα",
        "setup_profile" to "Ας ρυθμίσουμε το προφίλ σας",
        "name" to "Το Όνομα σας",
        "job_role" to "Η Επαγγελματική Σας Θέση",
        "continue" to "Συνέχεια",
        "courses" to "Μαθήματα",
        "achievements" to "Επιτεύγματα",
        "profile" to "Προφίλ",
        "no_course" to "Δεν υπάρχουν διαθέσιμα μαθήματα",
        "digital_academy" to "Ψηφιακή Ακαδημία",
        "about_course" to "Σχετικά με αυτό το μάθημα",
        "view_course_mat" to "Προβολή Υλικού Μαθήματος",
        "hide_course_mat" to "Απόκρυψη Υλικού Μαθήματος",
        "quiz" to "Έναρξη κουίζ",
        "prev" to "Προηγούμενο",
        "next" to "Επόμενο",
        "congz" to "Συγχαρητήρια! \uD83C\uDF89",
        "try" to "Προσπαθήστε Ξανά",
        "earned_badge" to "Κερδίσατε ένα παράσημο για την ολοκλήρωση αυτού του μαθήματος!",
        "atleast" to "Χρειάζεστε τουλάχιστον 80% για να περάσετε.Επαναλάβετε το μάθημα και προσπαθήστε ξανά!",
        "continue_learn" to "Συνέχισε την Εκμάθηση",
        "back_course" to "Επιστροφή στο Μάθημα",
        "score" to "Έκανες σωστά",
        "out" to "από",
        "no_badge" to "Δεν έχετε παράσημα.Ολοκληρώστε μαθήματα για να κερδίσετε επιτεύγματα!",
        "ach" to "Τα Επιτεύγματα σας",
        "no_quiz_available" to "Δεν υπάρχει διαθέσιμο κουίζ σε αυτή τη γλώσσα",
        "back_course" to "Επιστροφή στο μάθημα",
        "earn" to "Αποκτήθηκε στις:",
        "wb" to "Καλώς ήρθατε ξανά",
        "slide" to "Διαφάνεια",
        "of" to "από",
        "Register" to "Εγγραφή",
        "Login" to "Είσοδος",
        "Username" to "Όνομα Χρήστη",
        "recommendations" to "Οι Προτάσεις μας",
        "back_login" to "Πίσω στην Είσοδο",
        "back_reg" to "Πίσω στην Εγγραφή",
        "login_fail" to "Αδυναμία Εισόδου",
        "fill_all_fields" to "Παρακαλώ συμπληρώστε όλα τα πεδία",
        "registration_success" to "Επιτυχία Εγγραφής",
        "completed" to "✅ ολοκληρωμένο"
    )
}

