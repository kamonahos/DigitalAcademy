package com.example.digitalacademyapp.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.digitalacademyapp.models.Strings
import com.example.digitalacademyapp.userManager.UserManager
import kotlinx.coroutines.launch
@Composable
fun RegisterScreen(
    onRegisterSuccess: (String) -> Unit  // pass username back
) {
    val context = LocalContext.current
    val userManager = remember { UserManager(context) }
    val coroutineScope = rememberCoroutineScope()

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    // 🔁 Μεταγλώττιση των μεταφράσεων εντός Composable
    val msgSuccess = Strings.get("registration_success")
    val msgEmptyFields = Strings.get("fill_all_fields")
    val usernameLabel = Strings.get("Username")
    val passwordLabel = Strings.get("Password")
    val registerText = Strings.get("Register")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text(usernameLabel) }
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(passwordLabel) },
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            if (username.isNotBlank() && password.isNotBlank()) {
                coroutineScope.launch {
                    userManager.registerUser(username, password)
                    Toast.makeText(context, msgSuccess, Toast.LENGTH_SHORT).show()
                    onRegisterSuccess(username)
                }
            } else {
                Toast.makeText(context, msgEmptyFields, Toast.LENGTH_SHORT).show()
            }
        }) {
            Text(registerText)
        }
    }
}
