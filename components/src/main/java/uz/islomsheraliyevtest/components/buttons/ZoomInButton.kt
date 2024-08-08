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
fun ZoomInButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    ClickableTransparentRoundedBackground(
        modifier = modifier.alpha(.8f),
        onClick = onClick,
    ) { insideModifier ->
        Icon(
            painter = painterResource(id = R.drawable.ic_zoom_in),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = insideModifier,
        )
    }
}