package com.commitvillage.gitopia.village

import androidx.compose.runtime.Composable

@Composable
fun VillageHomeRoute(
    onOpenShop: () -> Unit,
    onSelectRepository: () -> Unit
) {
    VillageHomeScreen(
        onOpenShop = onOpenShop,
        onSelectRepository = onSelectRepository
    )
}