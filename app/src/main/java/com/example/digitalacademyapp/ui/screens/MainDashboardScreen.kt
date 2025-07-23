package com.example.digitalacademyapp.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.example.digitalacademyapp.BadgeProgressStore
import com.example.digitalacademyapp.R
import com.example.digitalacademyapp.models.Badge
import com.example.digitalacademyapp.models.Course
import com.example.digitalacademyapp.models.Strings
import com.example.digitalacademyapp.ui.courses.AppLanguage
import com.example.digitalacademyapp.ui.courses.getCourseCategories
import com.example.digitalacademyapp.userManager.UserManager
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainDashboardScreen(userName: String, currentLanguage: AppLanguage,
                        onLanguageChange: (AppLanguage) -> Unit) {
    var selectedCourse by remember { mutableStateOf<Course?>(null) }
    var showQuiz by remember { mutableStateOf(false) }
    var currentScreen by remember { mutableStateOf("courses") }
    val context = LocalContext.current
    val userManager = remember { UserManager(context) }

    var userName by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        userName = userManager.getLoggedInUsername() ?: ""
    }

    val earnedBadgeIds by BadgeProgressStore
        .earnedBadgesFlow(context, userName)
        .collectAsState(initial = emptySet())


    val earnedBadges: List<Badge> = earnedBadgeIds.map { badgeId ->
        Badge(
            courseName = badgeId,
            dateEarned = "",
            level = "",
            iconRes = R.drawable.ic_launcher_foreground
        )
    }
    var badgesState by remember { mutableStateOf(earnedBadges) }

    var showSlides by remember { mutableStateOf(false) }

    val showLanguageToggle = currentScreen == "courses" && selectedCourse == null && !showQuiz
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        Strings.get("digital_academy"),
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                ),
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            ) {
                NavigationBarItem(selected = currentScreen == "courses",
                    onClick = { currentScreen = "courses" },
                    icon = { Icon(painterResource(id = R.drawable.book_multiple), contentDescription = "Courses") },
                    label = { Text(Strings.get("courses")) })
                NavigationBarItem(selected = currentScreen == "achievements",
                    onClick = { currentScreen = "achievements" },
                    icon = {
                        Icon(
                            painterResource(id = R.drawable.trophy), contentDescription = "Achievements"
                        )
                    },
                    label = { Text(Strings.get("achievements")) })
                NavigationBarItem(selected = currentScreen == "profile",
                    onClick = { currentScreen = "profile" },
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profile") },
                    label = { Text(Strings.get("profile")) })
            }
        }) { innerPadding ->
        val allCourses = getCourseCategories().flatMap { it.courses }
        val enrichedBadges = earnedBadges.mapNotNull { badge ->
            val course = allCourses.find { it.id == badge.courseName }  // badge.courseName περιέχει id
            course?.let {
                Badge(
                    courseName = it.title,
                    level = it.level,
                    iconRes = it.iconRes,
                    dateEarned = badge.dateEarned // διατήρησε timestamp αν υπάρχει
                )
            }
        }
        when (currentScreen) {
            "achievements" -> {
                AchievementsScreen(
                    earnedBadges = enrichedBadges, modifier = Modifier.padding(innerPadding)
                )
            }
            "courses" -> {
                when {
                    selectedCourse != null && !showQuiz -> {
                        CourseDetailScreen(course = selectedCourse!!,
                            onBack = { selectedCourse = null },
                            onStartQuiz = { showQuiz = true },
                            modifier = Modifier.padding(innerPadding)
                        )
                    }

                    showQuiz && selectedCourse != null -> {
                        val coroutineScope = rememberCoroutineScope()

                        QuizScreen(
                            course = selectedCourse!!,
                            onQuizCompleted = { score ->
                                if (score >= 80) {
                                    val newBadge = Badge(
                                        courseName = selectedCourse!!.title,
                                        dateEarned = SimpleDateFormat("yyyy-MM-dd").format(Date()),
                                        level = selectedCourse!!.level,
                                        iconRes = R.drawable.ic_launcher_foreground
                                    )
                                    badgesState = badgesState + newBadge

                                    // Launch coroutine to save the badge
                                    coroutineScope.launch {
                                        BadgeProgressStore.markBadgeEarned(context, userName, newBadge.courseName)
                                    }
                                }
                                showQuiz = false
                                selectedCourse = null
                            },
                            modifier = Modifier.padding(innerPadding)
                        )

                    }
                    else -> {
                        HomeScreen(
                            onCourseSelected = { course -> selectedCourse = course },
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
            "profile" -> {
                ProfileScreen(
                    userName = userName,
                    earnedBadges = enrichedBadges,
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}