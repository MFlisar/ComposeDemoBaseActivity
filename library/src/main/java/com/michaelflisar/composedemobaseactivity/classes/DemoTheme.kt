package com.michaelflisar.composedemobaseactivity.classes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable

enum class DemoTheme {
    System,
    Dark,
    Light;

    @Composable
    fun isDark(): Boolean {
        return when (this) {
            System -> isSystemInDarkTheme()
            Dark -> true
            Light -> false
        }
    }
}