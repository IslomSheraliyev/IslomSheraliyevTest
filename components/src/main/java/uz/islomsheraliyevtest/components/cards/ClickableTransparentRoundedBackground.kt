package uz.islomsheraliyevtest.components.cards

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import uz.islomsheraliyevtest.components.design.theme.TaxiTheme

@Composable
internal fun ClickableTransparentRoundedBackground(
    modifier: Modifier = Modifier,
    padding: Dp = 16.dp,
    onClick: () -> Unit,
    content: @Composable (modifier: Modifier) -> Unit
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(TaxiTheme.color.backGroundPrimary),
        modifier = modifier
    ) {
        content(Modifier.padding(all = padding))
    }
}
