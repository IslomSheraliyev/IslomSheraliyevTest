package uz.islomsheraliyevtest.components.design.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import uz.islomsheraliyevtest.components.design.font.LocalCustomTypography
import uz.islomsheraliyevtest.components.design.color.CustomColorScheme
import uz.islomsheraliyevtest.components.design.color.LocalCustomColorScheme
import uz.islomsheraliyevtest.components.design.font.TypographyScheme

object TaxiTheme {
    val color: CustomColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalCustomColorScheme.current

    val typography: TypographyScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalCustomTypography.current
}

@Composable
fun TaxiTheme(
    color: CustomColorScheme,
    typography: TypographyScheme,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalCustomColorScheme provides color,
        LocalCustomTypography provides typography
    ) {
        content()
    }
}