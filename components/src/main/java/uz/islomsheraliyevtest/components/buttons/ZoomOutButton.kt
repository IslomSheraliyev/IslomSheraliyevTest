package uz.islomsheraliyevtest.components.buttons

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import uz.islomsheraliyevtest.components.R
import uz.islomsheraliyevtest.components.cards.ClickableTransparentRoundedBackground

@Composable
fun ZoomOutButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    ClickableTransparentRoundedBackground(
        onClick = onClick,
        modifier = modifier.alpha(.8f)
    ) { insideModifier ->
        Icon(
            painter = painterResource(id = R.drawable.ic_zoom_out),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = insideModifier
        )
    }
}