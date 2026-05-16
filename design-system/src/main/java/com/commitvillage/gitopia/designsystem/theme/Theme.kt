package com.commitvillage.gitopia.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val GitopiaDarkColorScheme = darkColorScheme(
    primary = GitopiaPrimary,
    onPrimary = GitopiaOnPrimary,
    primaryContainer = GitopiaPrimaryContainer,
    onPrimaryContainer = GitopiaOnPrimaryContainer,
    inversePrimary = GitopiaInversePrimary,
    secondary = GitopiaSecondary,
    onSecondary = GitopiaOnSecondary,
    secondaryContainer = GitopiaSecondaryContainer,
    onSecondaryContainer = GitopiaOnSecondaryContainer,
    tertiary = GitopiaTertiary,
    onTertiary = GitopiaOnTertiary,
    tertiaryContainer = GitopiaTertiaryContainer,
    onTertiaryContainer = GitopiaOnTertiaryContainer,
    background = GitopiaBackground,
    onBackground = GitopiaOnBackground,
    surface = GitopiaSurface,
    onSurface = GitopiaOnSurface,
    surfaceVariant = GitopiaSurfaceVariant,
    onSurfaceVariant = GitopiaOnSurfaceVariant,
    surfaceTint = GitopiaSurfaceTint,
    inverseSurface = GitopiaInverseSurface,
    inverseOnSurface = GitopiaInverseOnSurface,
    error = GitopiaError,
    onError = GitopiaOnError,
    errorContainer = GitopiaErrorContainer,
    onErrorContainer = GitopiaOnErrorContainer,
    outline = GitopiaOutline,
    outlineVariant = GitopiaOutlineVariant,
    scrim = GitopiaSurfaceContainerLowest,
    surfaceDim = GitopiaSurfaceDim,
    surfaceBright = GitopiaSurfaceBright,
    surfaceContainerLowest = GitopiaSurfaceContainerLowest,
    surfaceContainerLow = GitopiaSurfaceContainerLow,
    surfaceContainer = GitopiaSurfaceContainer,
    surfaceContainerHigh = GitopiaSurfaceContainerHigh,
    surfaceContainerHighest = GitopiaSurfaceContainerHighest
)

@Composable
fun GitopiaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = GitopiaDarkColorScheme,
        typography = GitopiaTypography,
        shapes = GitopiaShapes,
        content = content
    )
}
