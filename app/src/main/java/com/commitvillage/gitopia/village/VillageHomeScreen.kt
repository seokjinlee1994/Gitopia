package com.commitvillage.gitopia.village

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun VillageHomeScreen(
    onOpenShop: () -> Unit,
    onSelectRepository: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Village Home")

        Button(
            onClick = onOpenShop
        ) {
            Text(text = "상점")
        }

        OutlinedButton(
            onClick = onSelectRepository
        ) {
            Text(text = "Repository 다시 선택")
        }
    }
}