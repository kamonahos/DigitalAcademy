package com.example.digitalacademyapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.digitalacademyapp.BadgeProgressStore
import com.example.digitalacademyapp.R
import com.example.digitalacademyapp.UserSession
import com.example.digitalacademyapp.models.Course
import com.example.digitalacademyapp.models.QuizQuestion
import com.example.digitalacademyapp.models.Strings
import com.example.digitalacademyapp.ui.courses.getQuizForCourse
import com.example.digitalacademyapp.userManager.UserManager
import kotlinx.coroutines.delay

@SuppressLint("NotConstructor")
@Composable
fun QuizScreen(
    course: Course,
    onQuizCompleted: (scorePercent: Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val questions = getQuizForCourse(course.id)

    val userManager = remember { UserManager(context) }
    val userName by produceState(initialValue = "") {
        value = userManager.getLoggedInUsername() ?: ""
    }

    if (questions.isEmpty()) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = Strings.get("no_quiz_available"),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.error
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { onQuizCompleted(0) }) {
                Text(text = Strings.get("back_course"))
            }
        }
        return
    }

    var currentQuestionIndex by remember { mutableStateOf(0) }
    var score by remember { mutableStateOf(0) }
    var quizCompleted by remember { mutableStateOf(false) }

    if (quizCompleted) {
        val scorePercent = (score * 100) / questions.size
        LaunchedEffect(scorePercent, userName) {
            if (scorePercent >= 80 && userName.isNotBlank()) {
                //  Correctly save badge progress with actual username
                BadgeProgressStore.markBadgeEarned(context, userName, course.id)
            }
        }
        QuizResultScreen(
            score = score,
            totalQuestions = questions.size,
            onContinue = { onQuizCompleted(scorePercent) },
            course
        )
    } else {
        Column(modifier = modifier.fillMaxSize()) {
            LinearProgressIndicator(
                progress = { (currentQuestionIndex + 1).toFloat() / questions.size.toFloat() },
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colorScheme.primary,
            )
            QuizQuestionCard(
                question = questions[currentQuestionIndex],
                questionNumber = currentQuestionIndex + 1,
                totalQuestions = questions.size,
                onAnswerSelected = { answer ->
                    if (answer == questions[currentQuestionIndex].correctAnswer) {
                        score++
                    }
                    if (currentQuestionIndex == questions.size - 1) {
                        quizCompleted = true
                    } else {
                        currentQuestionIndex++
                    }
                }
            )
        }
    }
}



@Composable
fun QuizQuestionCard(
    question: QuizQuestion,
    questionNumber: Int,
    totalQuestions: Int,
    onAnswerSelected: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            "Question $questionNumber of $totalQuestions",
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            question.question,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(24.dp))
        Column(
            modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            question.options.forEach { option ->
                OutlinedButton(
                    onClick = { onAnswerSelected(option) },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = MaterialTheme.colorScheme.onSurface
                    )
                ) {
                    Text(
                        option,
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun QuizResultScreen(
    score: Int, totalQuestions: Int, onContinue: () -> Unit, course: Course
) {
    val percentage = (score * 100) / totalQuestions
    val passed = percentage >= 80
    val resultColor = if (passed) Color(0xFF4CAF50) else Color(0xFFF44336)
    val context = LocalContext.current
    val questions = getQuizForCourse(course.id)

    val userManager = remember { UserManager(context) }
    val userName by produceState(initialValue = "") {
        value = userManager.getLoggedInUsername() ?: ""
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            contentAlignment = Alignment.Center, modifier = Modifier
                .size(120.dp)
                .background(
                    color = resultColor.copy(alpha = 0.2f), shape = CircleShape
                )
        ) {
            Text(
                "$percentage%",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = resultColor
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            if (passed) Strings.get("congz") else Strings.get("try"),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = resultColor
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            Strings.get("score") + " $score " + Strings.get("out") + " $totalQuestions",
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(24.dp))
        val coroutineScope = rememberCoroutineScope()
        if (passed) {
            coroutineScope.launch {
                BadgeProgressStore.markBadgeEarned(context, userName, course.id)
                delay(5000)
                onContinue()
            }

            Text(
                Strings.get("earned_badge"),
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(R.drawable.trophy),
                contentDescription = "Badge earned",
                modifier = Modifier.size(80.dp)
            )
        } else {
            Text(
                Strings.get("atleast"),
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = onContinue,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            )
        ) {
            Text(
                if (passed) Strings.get("continue_learn") else Strings.get("back_course"),
                style = MaterialTheme.typography.labelLarge
            )
        }
    }
}