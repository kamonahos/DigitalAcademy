package com.example.digitalacademyapp.ui.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
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
import androidx.compose.ui.unit.sp
import com.example.digitalacademyapp.BadgeProgressStore
import com.example.digitalacademyapp.R
import com.example.digitalacademyapp.UserSession
import com.example.digitalacademyapp.models.Course
import com.example.digitalacademyapp.models.CourseCategory
import com.example.digitalacademyapp.models.Strings
import com.example.digitalacademyapp.ui.courses.getCourseCategories
import com.example.digitalacademyapp.userManager.UserManager


@Composable
fun SlideViewer(slides: List<String>) {
    var index by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        if (slides.isNotEmpty()) {
            Text(Strings.get("slide") + " ${index + 1} " + Strings.get("of") + " ${slides.size}", style = MaterialTheme.typography.bodySmall)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = slides[index], style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(onClick = { if (index > 0) index-- }, enabled = index > 0) {
                    Text(Strings.get("prev"))
                }
                Button(
                    onClick = { if (index < slides.size - 1) index++ },
                    enabled = index < slides.size - 1
                ) {
                    Text(Strings.get("next"))
                }
            }
        }
    }
}
@Composable
fun CourseCategoriesList(onCourseSelected: (Course) -> Unit) {
    val categories = getCourseCategories()
    val expandedCategories = remember { mutableStateMapOf<String, Boolean>() }
    val context = LocalContext.current

    val userManager = remember { UserManager(context) }

    var userName by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        userName = userManager.getLoggedInUsername() ?: ""
    }

    val earnedBadges by BadgeProgressStore
        .earnedBadgesFlow(context, userName)
        .collectAsState(initial = emptySet())

    LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        items(categories) { category ->
            CourseCategoryItem(
                category = category,
                isExpanded = expandedCategories[category.categoryName] ?: false,
                onToggle = {
                    expandedCategories[category.categoryName] =
                        !(expandedCategories[category.categoryName] ?: false)
                },
                onCourseSelected = onCourseSelected,
                earnedBadges = earnedBadges
            )
        }
    }
}
@Composable
fun CourseCategoryItem(
    category: CourseCategory,
    isExpanded: Boolean,
    onToggle: () -> Unit,
    onCourseSelected: (Course) -> Unit,
    earnedBadges: Set<String>
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column {
            Row(modifier = Modifier
                .fillMaxWidth()
                .clickable { onToggle() }
                .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically) {
                if (category.iconRes != null) {
                    Image(
                        painter = painterResource(R.drawable.book_open_page_variant),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                }
                Text(
                    category.categoryName,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.weight(1f)
                )
                Icon(
                    imageVector = if (isExpanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                    contentDescription = if (isExpanded) "Collapse" else "Expand"
                )
            }
            if (isExpanded) {
                if (category.courses.isEmpty()) {
                    Text(
                        Strings.get("no_course"),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.padding(16.dp)
                    )
                } else {
                    Column(
                        modifier = Modifier.padding(
                            start = 16.dp, end = 16.dp, bottom = 16.dp
                        ), verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        category.courses.forEach { course ->
                            CourseItem(course = course, onClick = { onCourseSelected(course) },
                                showBadge = earnedBadges.contains(course.id)
                            )
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun CourseItem(course: Course, onClick: () -> Unit,showBadge: Boolean) {
    val levelColor = when (course.level) {
        "Beginner", "Αρχάριος" -> Color(0xFF4CAF50) // Green
        "Intermediate", "Μέσο επίπεδο" -> Color(0xFF2196F3) // Blue
        "Advanced", "Προχωρημένος" -> Color(0xFF9C27B0) // Purple
        else -> MaterialTheme.colorScheme.primary
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Row(
            modifier = Modifier.padding(12.dp), verticalAlignment = Alignment.CenterVertically
        ) {
            if (course.iconRes != null) {
                Image(
                    painter = painterResource(course.iconRes),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
            }
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    course.title,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Medium
                )
                if (showBadge) {
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("✅", fontSize = 18.sp)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .background(
                                color = levelColor.copy(alpha = 0.2f),
                                shape = RoundedCornerShape(4.dp)
                            )
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            course.level, color = levelColor, fontSize = 12.sp
                        )
                    }
                    Text(
                        course.duration,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 12.sp
                    )
                }
            }
            Icon(
                imageVector = Icons.Default.PlayArrow,
                contentDescription = "View course",
                tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )
        }
    }
}