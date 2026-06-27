package com.example.todolist.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val BulbasaurColorScheme = lightColorScheme(
    primary = BulbasaurEyeRed,
    onPrimary = BulbasaurPureWhite,
    secondary = BulbasaurBulbGreen,
    onSecondary = BulbasaurDarkText,
    background = BulbasaurSoftBackground,
    surface = BulbasaurPureWhite
)


@Composable
fun TodoListTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = BulbasaurColorScheme,
        typography = Typography,
        content = content
    )
}
