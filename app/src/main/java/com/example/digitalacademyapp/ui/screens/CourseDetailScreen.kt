package com.example.digitalacademyapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.digitalacademyapp.BadgeProgressStore
import com.example.digitalacademyapp.models.Course
import com.example.digitalacademyapp.models.Strings
import com.example.digitalacademyapp.ui.courses.getCourseSlides
import com.example.digitalacademyapp.ui.items.SlideViewer
import com.example.digitalacademyapp.userManager.UserManager

@Composable
fun CourseDetailScreen(
    course: Course, onBack: () -> Unit, onStartQuiz: () -> Unit, modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val userManager = remember { UserManager(context) }

    var userName by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        userName = userManager.getLoggedInUsername() ?: ""
    }

    val earnedBadges by BadgeProgressStore
        .earnedBadgesFlow(context, userName)
        .collectAsState(initial = emptySet())
    var showSlides by remember { mutableStateOf(false) }
    val slides = getCourseSlides(course.id)
    Column(modifier = modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onBack) {
                Icon(
                    imageVector = Icons.AutoMirrored.Default.ArrowBack, contentDescription = "Back"
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                course.title,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
        }
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if (course.iconRes != null) {
                            Image(
                                painter = painterResource(course.iconRes),
                                contentDescription = null,
                                modifier = Modifier.size(48.dp)
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                        }
                        Column {
                            Text(
                                course.level,
                                style = MaterialTheme.typography.labelLarge,
                                color = when (course.level) {
                                    "Beginner", "Αρχάριος" -> Color(0xFF4CAF50) // Green
                                    "Intermediate", "Μέσο επίπεδο" -> Color(0xFF2196F3) // Blue
                                    "Advanced", "Προχωρημένος" -> Color(0xFF9C27B0) // Purple
                                    else -> MaterialTheme.colorScheme.primary
                                }
                            )
                            Text(
                                course.duration, style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        Strings.get("about_course"),
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        course.description, style = MaterialTheme.typography.bodyLarge
                    )
                    if (earnedBadges.contains(course.id)) {
                        Text(Strings.get("completed"), color = Color(0xFF4CAF50), fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { showSlides = !showSlides },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (showSlides) MaterialTheme.colorScheme.secondaryContainer
                    else MaterialTheme.colorScheme.primaryContainer,
                    contentColor = if (showSlides) MaterialTheme.colorScheme.onSecondaryContainer
                    else MaterialTheme.colorScheme.onPrimaryContainer
                )
            ) {




                Text(if (showSlides) Strings.get("hide_course_mat") else Strings.get("view_course_mat"))
            }
            if (showSlides && slides.isNotEmpty()) {
                Spacer(modifier = Modifier.height(16.dp))


                Spacer(modifier = Modifier.height(8.dp))
                SlideViewer(slides = slides)
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = onStartQuiz,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {
                Text(Strings.get("quiz"), style = MaterialTheme.typography.labelLarge)
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}
