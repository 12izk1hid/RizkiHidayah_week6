package com.rizki.rizkihidayah_praktisi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rizki.rizkihidayah_praktisi.screen.Home
import com.rizki.rizkihidayah_praktisi.screen.Profile
import com.rizki.rizkihidayah_praktisi.screen.Setting



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}

@Composable
fun ScreenMain() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Home.route) {
        composable(Routes.Home.route) {
            Home(navController = navController)
        }
        composable(Routes.Profile.route) {
            Profile()
        }
        composable(Routes.Setting.route + "/{no}") { navBackStack ->
            val number = navBackStack.arguments?.getString("no")
            Setting(number = number)
        }
    }
}


