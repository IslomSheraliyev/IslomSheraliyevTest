package uz.islomsheraliyevtest.components.design.color

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

class CustomColorScheme(
    backGroundPrimary: Color,
    backgroundSecondary: Color,
    contentPrimary: Color,
    contentSecondary: Color,
    contentTertiary: Color,
    outlineSecondary: Color,
    outlineOtherPure: Color,
    buttonPrimary2: Color,
    immutableDark: Color,
    dropShadow: Color
) {
    var backGroundPrimary by mutableStateOf(backGroundPrimary, structuralEqualityPolicy())
    var backgroundSecondary by mutableStateOf(backgroundSecondary, structuralEqualityPolicy())
    var contentPrimary by mutableStateOf(contentPrimary, structuralEqualityPolicy())
    var contentSecondary by mutableStateOf(contentSecondary, structuralEqualityPolicy())
    var contentTertiary by mutableStateOf(contentTertiary, structuralEqualityPolicy())
    var outlineSecondary by mutableStateOf(outlineSecondary, structuralEqualityPolicy())
    var outlineOtherPure by mutableStateOf(outlineOtherPure, structuralEqualityPolicy())
    var buttonPrimary2Default by mutableStateOf(buttonPrimary2, structuralEqualityPolicy())
    var immutableDark by mutableStateOf(immutableDark, structuralEqualityPolicy())
    var dropShadow by mutableStateOf(dropShadow, structuralEqualityPolicy())
}

fun taxiLightColorScheme(
    backGroundPrimary: Color = backgroundPrimaryLight,
    backgroundSecondary: Color = backgroundSecondaryLight,
    contentPrimary: Color = contentPrimaryLight,
    contentSecondary: Color = contentSecondaryLight,
    contentTertiary: Color = contentTertiaryLight,
    outlineSecondary: Color = outlineSecondaryLight,
    outlineOtherPure: Color = outlineOtherPureLight,
    buttonPrimary2: Color = buttonPrimary2Default,
    immutableDark: Color = immutableDarkDefault,
    dropShadow: Color = dropShadowDefault

) = CustomColorScheme(
    backGroundPrimary = backGroundPrimary,
    backgroundSecondary = backgroundSecondary,
    contentPrimary = contentPrimary,
    contentSecondary = contentSecondary,
    contentTertiary = contentTertiary,
    outlineSecondary = outlineSecondary,
    outlineOtherPure = outlineOtherPure,
    buttonPrimary2 = buttonPrimary2,
    immutableDark = immutableDark,
    dropShadow = dropShadow
)

fun taxiDarkColorScheme(
    backGroundPrimary: Color = backgroundPrimaryDark,
    backgroundSecondary: Color = backgroundSecondaryDark,
    contentPrimary: Color = contentPrimaryDark,
    contentSecondary: Color = contentSecondaryDark,
    contentTertiary: Color = contentTertiaryDark,
    outlineSecondary: Color = outlineSecondaryDark,
    outlineOtherPure: Color = outlineOtherPureDark,
    buttonPrimary2: Color = buttonPrimary2Default,
    immutableDark: Color = immutableDarkDefault,
    dropShadow: Color = dropShadowDefault
) = CustomColorScheme(
    backGroundPrimary = backGroundPrimary,
    backgroundSecondary = backgroundSecondary,
    contentPrimary = contentPrimary,
    contentSecondary = contentSecondary,
    contentTertiary = contentTertiary,
    outlineSecondary = outlineSecondary,
    outlineOtherPure = outlineOtherPure,
    buttonPrimary2 = buttonPrimary2,
    immutableDark = immutableDark,
    dropShadow = dropShadow
)

val LocalCustomColorScheme = staticCompositionLocalOf { taxiLightColorScheme() }
