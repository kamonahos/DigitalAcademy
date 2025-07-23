package com.example.digitalacademyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.digitalacademyapp.ui.courses.AppLanguage
import com.example.digitalacademyapp.ui.courses.LocalAppLanguage
import com.example.digitalacademyapp.ui.screens.LoginScreen
import com.example.digitalacademyapp.ui.screens.MainDashboardScreen
import com.example.digitalacademyapp. ui.screens.MainDashboardScreen
import com.example.digitalacademyapp.ui.screens.ProfileSetupScreen
import com.example.digitalacademyapp.ui.screens.RegisterScreen
import com.example.digitalacademyapp.ui.theme.DigitalAcademyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            DigitalAcademyAppTheme {
                CompositionLocalProvider(LocalAppLanguage provides AppLanguage.ENGLISH) {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        DigitalAcademyApp()
                    }
                }
            }
        }
    }

}

@Composable
fun DigitalAcademyApp() {
    var currentScreen by remember { mutableStateOf<Screen>(Screen.ProfileSetup) }
    var userName by remember { mutableStateOf("") }
    var appLanguage by remember { mutableStateOf(AppLanguage.ENGLISH) }
    var earnedBadges by remember { mutableStateOf(emptySet<String>()) }
    val context = LocalContext.current




    CompositionLocalProvider(
        LocalAppLanguage provides appLanguage
    ) {
        DigitalAcademyAppTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                when (currentScreen) {
                    is Screen.Login -> LoginScreen(
                        onLoginSuccess = { name, badges, language ->
                            userName = name
                            earnedBadges = badges
                            appLanguage = language
                            currentScreen = Screen.MainDashboard
                        },
                        onBackToRegister = {
                            currentScreen = Screen.ProfileSetup
                        }
                    )


                    is Screen.ProfileSetup -> ProfileSetupScreen(
                        currentLanguage = appLanguage,
                        onLanguageChange = { newLanguage ->
                            appLanguage = newLanguage
                        },
                        onRegisterSuccess = { name ->
                            userName = name
                            currentScreen = Screen.MainDashboard
                        },
                        onBackToLogin = {
                            currentScreen = Screen.Login
                        }
                    )

                    is Screen.MainDashboard -> MainDashboardScreen(
                        userName = userName,
                        currentLanguage = appLanguage,
                        onLanguageChange = { newLanguage: AppLanguage ->
                            appLanguage = newLanguage
                        }
                    )

                }
            }
        }
    }
}

sealed class Screen {
    object Login : Screen()
    object ProfileSetup : Screen()
    object MainDashboard : Screen()

}
