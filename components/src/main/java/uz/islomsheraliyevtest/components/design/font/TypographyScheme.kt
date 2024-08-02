package uz.islomsheraliyevtest.components.design.font

import androidx.compose.ui.text.TextStyle

data class TypographyScheme(
    val regularText: TextStyle = TextStyle(),
    val semiBoldText: TextStyle = TextStyle(),
    val boldText: TextStyle = TextStyle()
)