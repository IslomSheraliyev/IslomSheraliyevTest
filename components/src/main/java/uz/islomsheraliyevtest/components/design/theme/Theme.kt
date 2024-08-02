package uz.islomsheraliyevtest.components.design.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import uz.islomsheraliyevtest.components.design.font.typographyScheme
import uz.islomsheraliyevtest.components.design.color.taxiDarkColorScheme
import uz.islomsheraliyevtest.components.design.color.taxiLightColorScheme


private val taxiLightTheme = taxiLightColorScheme()
private val taxiDarkTheme = taxiDarkColorScheme()

private val LightColorScheme = lightColorScheme(
    primary = Color.Transparent,
    secondary = Color.Transparent,
    tertiary = Color.Transparent,
    background = Color.Transparent,
    surface = Color.Transparent,
    onPrimary = Color.Transparent,
    onError = Color.Red,
)

private val DarkColorScheme = darkColorScheme(
    primary = Color.Transparent,
    secondary = Color.Transparent,
    tertiary = Color.Transparent,
    background = Color.Transparent,
    surface = Color.Transparent,
    onPrimary = Color.Transparent,
    onError = Color.Red,
)


@Composable
fun MyTaxiTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val customColorScheme = if (darkTheme) taxiDarkTheme else taxiLightTheme

    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    TaxiTheme(
        customColorScheme,
        typographyScheme
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )
    }
}