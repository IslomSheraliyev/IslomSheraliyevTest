package uz.islomsheraliyevtest.components.cards

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.islomsheraliyevtest.components.design.theme.TaxiTheme

@Composable
fun SpeedCard(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(
                color = TaxiTheme.color.outlineOtherPure,
                shape = RoundedCornerShape(14.dp)
            )
            .padding(
                all = 4.dp
            )
            .background(
                color = TaxiTheme.color.buttonPrimary2Default,
                shape = RoundedCornerShape(10.dp)
            )
    ) {
        Text(
            text = text,
            color = TaxiTheme.color.immutableDark,
            style = TaxiTheme.typography.boldText,
            modifier = Modifier
                .padding(
                    all = 12.dp
                )
        )
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0x000,
    uiMode = Configuration.UI_MODE_NIGHT_MASK
)
@Composable
fun Pre(){
    SpeedCard(text = "95")
}