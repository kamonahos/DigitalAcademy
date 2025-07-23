package com.example.digitalacademyapp.ui.courses


import androidx.compose.runtime.Composable
import com.example.digitalacademyapp.R
import com.example.digitalacademyapp.models.Course
import com.example.digitalacademyapp.models.CourseCategory


@Composable
fun getCourseCategories(): List<CourseCategory> {
    return when (LocalAppLanguage.current) {
        AppLanguage.ENGLISH -> listOf(
            CourseCategory(
                "Software Development", iconRes = R.drawable.language_python, courses = listOf(
                    Course(
                        "A",
                        "Python Programming for Beginners",
                        "Beginner",
                        "8 hours",
                        "Learn Python fundamentals with hands-on exercises",
                        R.drawable.language_python
                    ), Course(
                        "B",
                        "Advanced Python Programming",
                        "Advanced",
                        "3 hours",
                        "The objective of the course is to deepen the audience's knowledge in programming. It covers topics such as object-oriented programming with Python, connecting Python to databases, and graphical interface programming using tkinter.",
                        R.drawable.language_python
                    )
                )
            ),


            CourseCategory(
                "Cybersecurity", iconRes = R.drawable.shield_lock_outline, courses = listOf(
                    Course(
                        "D",
                        "Introduction to Cybersecurity",
                        "Beginner",
                        " 1-3 hours",
                        "Cybersecurity includes technologies, processes, and controls designed to protect systems, networks, and data from cyber attacks. Effective cybersecurity reduces the risk of attacks and protects organizations and individuals from unauthorized exploitation of systems, networks, and technologies.",
                        R.drawable.shield_lock_outline
                    )
                )
            ), CourseCategory(
                "Artificial Intelligence", iconRes = R.drawable.robot, courses = listOf(
                    Course(
                        "E",
                        "Introduction to Artificial Intelligence",
                        "Beginner",
                        " 1-3 hours",
                        "Learn the basic concepts of Artificial Intelligence, including machine learning, neural networks, and real-world applications in modern technology.",
                        R.drawable.robot
                    ),
                    Course(
                        "F",
                        "Foundations of Prompt Engineering",
                        "Beginner",
                        " 1-3 hours",
                        "Welcome to Foundations of Prompt Engineering. In this course, you will learn to create and optimize prompts for a variety of generative artificial intelligence (generative AI) models. You will learn the principles, techniques, and best practices for designing effective prompts.",
                        R.drawable.robot




                    )
                )
            )
        )
        AppLanguage.GREEK -> listOf(
            CourseCategory(
                "Ανάπτυξη Λογισμικού", iconRes = R.drawable.language_python, courses = listOf(
                    Course(
                        "A",
                        "Προγραμματισμός Python για αρχάριους",
                        "Αρχάριος",
                        "8 ώρες",
                        "Μάθετε τα βασικά της Python με πρακτικές ασκήσεις",
                        R.drawable.language_python
                    ),
                    Course(
                        "B",
                        "Προχωρημένος Προγραμματισμός σε Python",
                        "Προχωρημένος",
                        "3 ώρες",
                        "Στόχος του μαθήματος είναι να εμβαθύνει τις γνώσεις του κοινού στον προγραμματισμό. Καλύπτει θέματα, όπως: αντικειμενοστραφής προγραμματισμός με την Python, σύνδεση της Python με βάσεις δεδομένων, προγραμματισμός γραφικών διεπαφών με την tkinter.",
                        R.drawable.language_python
                    )
                )
            ),


            CourseCategory(
                "Κυβερνοασφάλεια", iconRes = R.drawable.shield_lock_outline, courses = listOf(
                    Course(
                        "D",
                        "Εισαγωγή στην Κυβερνοασφάλεια",
                        "Αρχάριος",
                        "1-3 ώρες",
                        "Η ασφάλεια στον κυβερνοχώρο περιλαμβάνει τεχνολογίες, διαδικασίες και ελέγχους, που έχουν σχεδιαστεί για να προστατεύουν συστήματα, δίκτυα και δεδομένα από επιθέσεις στον κυβερνοχώρο. Η αποτελεσματική ασφάλεια στον κυβερνοχώρο περιορίζει τον κίνδυνο επιθέσεων και προστατεύει οργανισμούς και ιδιώτες από τη μη εξουσιοδοτημένη εκμετάλλευση συστημάτων, δικτύων και τεχνολογιών.",
                        R.drawable.shield_lock_outline
                    )
                )
            ),
            CourseCategory(
                "Τεχνητή Νοημοσύνη", iconRes = R.drawable.robot, courses = listOf(
                    Course(
                        "E",
                        "Εισαγωγή στην Τεχνητή Νοημοσύνη",
                        "Αρχάριος",
                        "1-3 ώρες",
                        "Μάθετε τις βασικές έννοιες της Τεχνητής Νοημοσύνης, όπως η μηχανική μάθηση, τα νευρωνικά δίκτυα και οι εφαρμογές τους στη σύγχρονη τεχνολογία.",
                        R.drawable.robot
                    ),
                    Course(
                        "F",
                        "Βάσεις Μηχανικής Εντολών (Prompt Engineering)",
                        "Αρχάριος",
                        "1-3 ώρες",
                        "Καλώς ήρθατε στις Βάσεις Μηχανικής Εντολών. Σε αυτό το μάθημα, θα μάθετε πώς να δημιουργείτε και να βελτιστοποιείτε εντολές (prompts) για διάφορα μοντέλα γεννητικής τεχνητής νοημοσύνης (generative AI). Θα μάθετε τις αρχές, τις τεχνικές και τις βέλτιστες πρακτικές για το σχεδιασμό αποτελεσματικών εντολών." ,
                        R.drawable.robot


                    )
                )
            )
        )
        else -> emptyList()
    }
}