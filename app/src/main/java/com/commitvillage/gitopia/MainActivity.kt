package com.commitvillage.gitopia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.rememberNavController
import com.commitvillage.gitopia.designsystem.theme.GitopiaTheme
import com.commitvillage.gitopia.navigation.GitopiaNavHost
import com.commitvillage.gitopia.startup.StartupViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            GitopiaTheme {
                val startupViewModel: StartupViewModel = hiltViewModel()
                val startupUiState by startupViewModel.uiState.collectAsStateWithLifecycle()

                splashScreen.setKeepOnScreenCondition {
                    startupUiState.isLoading
                }

                if (!startupUiState.isLoading) {
                    val navController = rememberNavController()

                    GitopiaNavHost(
                        navController = navController,
                        startDestination = startupUiState.startDestination
                    )
                }
            }
        }
    }
}