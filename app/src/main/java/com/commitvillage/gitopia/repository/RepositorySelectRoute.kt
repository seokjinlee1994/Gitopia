package com.commitvillage.gitopia.repository

import androidx.compose.runtime.Composable

@Composable
fun RepositorySelectRoute(
    onRepositorySelected: () -> Unit,
    onBack: () -> Unit
) {
    RepositorySelectScreen(
        onRepositorySelected = onRepositorySelected,
        onBack = onBack
    )
}