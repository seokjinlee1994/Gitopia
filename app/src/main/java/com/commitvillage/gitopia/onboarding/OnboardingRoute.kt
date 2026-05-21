package com.commitvillage.gitopia.onboarding

import androidx.compose.runtime.Composable

@Composable
fun OnboardingRoute(
    onStartWithGithub: () -> Unit
) {
    OnboardingScreen(
        onStartWithGithub = onStartWithGithub
    )
}