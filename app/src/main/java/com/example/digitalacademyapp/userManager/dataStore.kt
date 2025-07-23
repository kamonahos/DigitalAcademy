package com.example.digitalacademyapp.userManager

import android.content.Context
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

private val Context.dataStore by preferencesDataStore(name = "user_prefs")

class UserManager(private val context: Context) {

    companion object {
        private val USERNAMES = stringSetPreferencesKey("usernames")
        private fun passwordKey(username: String) = stringPreferencesKey("password_$username")
        private val CURRENT_USERNAME = stringPreferencesKey("current_username")
    }

    /** Register user (adds username and password, keeps all users) */
    suspend fun registerUser(username: String, password: String) {
        context.dataStore.edit { prefs ->
            val users = prefs[USERNAMES]?.toMutableSet() ?: mutableSetOf()
            users.add(username)
            prefs[USERNAMES] = users
            prefs[passwordKey(username)] = password
        }
        loginUser(username, password)
    }

    /** Login user (verifies password, sets current user if success) */
    suspend fun loginUser(username: String, password: String): Boolean {
        val prefs = context.dataStore.data.first()
        val storedPassword = prefs[passwordKey(username)]

        return if (storedPassword == password) {
            context.dataStore.edit {
                it[CURRENT_USERNAME] = username
            }
            true
        } else {
            false
        }
    }

    /** Get current logged-in username */
    suspend fun getLoggedInUsername(): String? {
        val prefs = context.dataStore.data.first()
        return prefs[CURRENT_USERNAME]
    }

    //    suspend fun clearAll() {
//        context.dataStore.edit { prefs ->
//            prefs.clear()
//        }
//    }
}
