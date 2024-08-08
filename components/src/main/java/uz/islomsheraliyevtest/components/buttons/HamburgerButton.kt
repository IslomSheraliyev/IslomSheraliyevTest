package uz.islomsheraliyevtest.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.islomsheraliyevtest.components.R
import uz.islomsheraliyevtest.components.design.theme.TaxiTheme

@Composable
fun HamburgerButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .background(
                color = TaxiTheme.color.outlineOtherPure,
                shape = RoundedCornerShape(14.dp)
            )
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_hamburger),
            tint = TaxiTheme.color.contentPrimary,
            contentDescription = null,
            modifier = Modifier
                .padding(
                    all = 8.dp
                )
        )
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0x000
)
@Composable
fun Pre() {
    HamburgerButton {

    }
}