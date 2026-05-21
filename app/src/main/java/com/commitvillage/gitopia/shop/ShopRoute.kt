package com.commitvillage.gitopia.shop

import androidx.compose.runtime.Composable

@Composable
fun ShopRoute(
    onBack: () -> Unit
) {
    ShopScreen(
        onBack = onBack
    )
}