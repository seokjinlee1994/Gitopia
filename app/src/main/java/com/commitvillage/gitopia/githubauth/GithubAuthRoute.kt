package com.commitvillage.gitopia.githubauth

import androidx.compose.runtime.Composable

@Composable
fun GithubAuthRoute(
    onAuthSuccess: () -> Unit,
    onBack: () -> Unit,
) {
    GithubAuthScreen(
        onAuthSuccess = onAuthSuccess,
        onBack = onBack
    )
}