package uz.islomsheraliyevtest.components.segmented

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import uz.islomsheraliyevtest.components.design.theme.TaxiTheme

@Composable
fun AnimatedTabSelector(
    tabs: List<String>,
    selectedOption: Int = 0,
    containerColor: Color = TaxiTheme.color.backGroundPrimary,
    tabColor: Color = TaxiTheme.color.buttonPrimary2Default,
    selectedOptionColor: Color = TaxiTheme.color.immutableDark,
    containerCornerRadius: Dp = 14.dp,
    tabCornerRadius: Dp = 10.dp,
    selectorHeight: Dp = 56.dp,
    tabHeight: Dp = 48.dp,
    tabWidth: Dp = 92.dp,
    textStyle: TextStyle = TaxiTheme.typography.regularText,
    selectedTabTextStyle: TextStyle = TaxiTheme.typography.semiBoldText,
    onTabSelected: (selectedIndex: Int) -> Unit = {}
) {
    if (tabs.size !in 2..4) {
        throw IllegalArgumentException("DynamicTabSelector must have between 2 and 4 options")
    }

    BoxWithConstraints(
        modifier = Modifier
            .clip(RoundedCornerShape(containerCornerRadius))
            .height(selectorHeight)
            .background(containerColor)
            .padding(horizontal = 4.dp)
    ) {
        val positions = tabs.indices.map { index -> tabWidth * index }
        val animatedOffsetX by animateDpAsState(targetValue = positions[selectedOption], label = "")
        val containerHeight = maxHeight
        val verticalOffset = (containerHeight - tabHeight) / 2


        Box(
            modifier = Modifier
                .offset(x = animatedOffsetX, y = verticalOffset)
                .clip(RoundedCornerShape(tabCornerRadius))
                .width(tabWidth)
                .height(tabHeight)
                .background(tabColor)
        )

        Row(
            modifier = Modifier.fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            tabs.forEachIndexed { index, text ->
                Text(
                    text = text,
                    style =
                    if (index == selectedOption) selectedTabTextStyle.copy(color = selectedOptionColor)
                    else textStyle.copy(color = TaxiTheme.color.contentPrimary),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .widthIn(min = tabWidth)
                        .clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() }
                        ) {
                            onTabSelected(index)
                        }
                )
            }
        }

    }
}