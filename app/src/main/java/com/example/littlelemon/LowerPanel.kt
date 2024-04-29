package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecial()
        MenuDish()
    }
}


@Composable
fun WeeklySpecial() {
    Card(
        Modifier
            .fillMaxWidth()
    ) {
        Text(
            "Weekly Special",
            Modifier.padding(8.dp),
            style = TextStyle(
                fontSize = 26.sp,
                fontWeight = Bold,
            ),
        )
    }
}


@Composable
fun MenuDish() {
    Card() {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {

            Column() {
                Text(
                    text = "Greek Salad",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = Bold,
                    )
                )
                Text(
                    text =
                    "The famous Greek salad of crispy lettuce, peppers, olives, our Chicago ...",
                    Modifier
                        .paddingFromBaseline(5.dp, 5.dp)
                        .fillMaxWidth(.75f),
                    style = TextStyle(color = Color.Gray)
                )
                Text(
                    text = "\$12.99",
                    style = TextStyle(fontWeight = Bold),
                    color = Color.Gray
                )
            }
            Image(
                painterResource(id = R.drawable.greeksalad),
                contentDescription = "Greek Salad Image"
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview() {
    LowerPanel()
}
