package uz.islomsheraliyevtest.app.ui.sheets

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import uz.islomsheraliyevtest.components.R
import uz.islomsheraliyevtest.components.design.theme.TaxiTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainBottomSheet() {
    val sheetState = rememberModalBottomSheetState()
    val scope = rememberCoroutineScope()

    ModalBottomSheet(
        onDismissRequest = { scope.launch { sheetState.partialExpand() } },
        containerColor = Color.Unspecified,
        scrimColor = Color.Unspecified,
        sheetState = sheetState,
        shape = RoundedCornerShape(
            topStart = 16.dp,
            topEnd = 16.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = TaxiTheme.color.backGroundPrimary,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(
                    all = 16.dp
                )
                .background(
                    color = TaxiTheme.color.backgroundSecondary,
                    shape = RoundedCornerShape(8.dp)
                )
        ) {
            Tariff { scope.launch { sheetState.hide() } }

            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 16.dp),
                thickness = 1.dp,
                color = TaxiTheme.color.outlineSecondary
            )

            Orders { scope.launch { sheetState.hide() } }

            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 16.dp),
                thickness = 1.dp,
                color = TaxiTheme.color.outlineSecondary
            )

            Bordur { scope.launch { sheetState.partialExpand() } }
        }
    }
}

@Composable
private fun Tariff(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(
                role = Role.Button,
                interactionSource = remember { MutableInteractionSource() },
                indication = LocalIndication.current,
                onClick = onClick
            )
            .padding(
                all = 16.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_switch),
            contentDescription = null
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = stringResource(id = R.string.tariff),
            color = TaxiTheme.color.contentPrimary,
            style = TaxiTheme.typography.semiBoldText
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "6/8",
            color = TaxiTheme.color.contentSecondary,
            style = TaxiTheme.typography.semiBoldText
        )

        Spacer(modifier = Modifier.width(2.dp))

        Icon(
            painter = painterResource(id = R.drawable.ic_show_all),
            contentDescription = null
        )
    }
}

@Composable
private fun Orders(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(
                role = Role.Button,
                interactionSource = remember { MutableInteractionSource() },
                indication = LocalIndication.current,
                onClick = onClick
            )
            .padding(
                all = 16.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_orders),
            contentDescription = null
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = stringResource(id = R.string.orders),
            color = TaxiTheme.color.contentPrimary,
            style = TaxiTheme.typography.semiBoldText
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "0",
            color = TaxiTheme.color.contentSecondary,
            style = TaxiTheme.typography.semiBoldText
        )

        Spacer(modifier = Modifier.width(2.dp))

        Icon(
            painter = painterResource(id = R.drawable.ic_show_all),
            contentDescription = null
        )
    }
}

@Composable
private fun Bordur(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(
                role = Role.Button,
                interactionSource = remember { MutableInteractionSource() },
                indication = LocalIndication.current,
                onClick = onClick
            )
            .padding(
                all = 16.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_orders),
            contentDescription = null
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = stringResource(id = R.string.bordur),
            color = TaxiTheme.color.contentPrimary,
            style = TaxiTheme.typography.semiBoldText
        )

        Spacer(modifier = Modifier.weight(1f))

        Icon(
            painter = painterResource(id = R.drawable.ic_show_all),
            contentDescription = null
        )
    }
}





