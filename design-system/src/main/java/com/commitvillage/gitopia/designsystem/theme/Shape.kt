package com.commitvillage.gitopia.designsystem.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

object GitopiaRadius {
    val Default = 4.dp
    val Large = 8.dp
    val ExtraLarge = 12.dp
}

val GitopiaShapes = Shapes(
    extraSmall = RoundedCornerShape(GitopiaRadius.Default),
    small = RoundedCornerShape(GitopiaRadius.Default),
    medium = RoundedCornerShape(GitopiaRadius.Large),
    large = RoundedCornerShape(GitopiaRadius.ExtraLarge),
    extraLarge = RoundedCornerShape(GitopiaRadius.ExtraLarge)
)
