package uz.islomsheraliyevtest.components.design.font

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import uz.islomsheraliyevtest.components.R.font.lato_400
import uz.islomsheraliyevtest.components.R.font.lato_600
import uz.islomsheraliyevtest.components.R.font.lato_700

val typographyScheme = TypographyScheme(
    regularText = createTextStyle(
        fontResId = lato_400,
        size = 18,
        lineHeight = 21.6f
    ),

    semiBoldText = createTextStyle(
        fontResId = lato_600,
        size = 18,
        lineHeight = 21.6f
    ),

    boldText = createTextStyle(
        fontResId = lato_700,
        size = 20,
        lineHeight = 24f
    )
)

val LocalCustomTypography = staticCompositionLocalOf { typographyScheme }

private fun createTextStyle(
    fontResId: Int,
    size: Int,
    lineHeight: Float,
): TextStyle {
    return TextStyle(
        fontFamily = FontFamily(Font(fontResId)),
        fontSize = size.sp,
        lineHeight = lineHeight.sp,
    )
}