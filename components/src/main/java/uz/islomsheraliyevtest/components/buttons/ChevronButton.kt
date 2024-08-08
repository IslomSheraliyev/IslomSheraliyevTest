package uz.islomsheraliyevtest.components.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import uz.islomsheraliyevtest.components.R
import uz.islomsheraliyevtest.components.design.theme.TaxiTheme

@Composable
fun ChevronButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(TaxiTheme.color.backgroundSecondary),
        modifier = modifier.alpha(.8f),
        border = BorderStroke(
            color = TaxiTheme.color.backGroundPrimary.copy(alpha = .9f),
            width = 4.dp
        )
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_move_up),
            contentDescription = null,
            tint = TaxiTheme.color.contentSecondary,
            modifier = Modifier.padding(16.dp)
        )
    }
}