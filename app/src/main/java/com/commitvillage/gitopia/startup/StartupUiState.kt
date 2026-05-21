package com.commitvillage.gitopia.startup

import com.commitvillage.gitopia.navigation.GitopiaRoute

data class StartupUiState(
    val isLoading: Boolean = true,
    val startDestination: GitopiaRoute = GitopiaRoute.Onboarding
)
