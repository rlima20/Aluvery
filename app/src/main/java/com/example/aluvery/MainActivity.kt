package com.example.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.example.aluvery.ui.theme.AluveryTheme
import java.math.BigDecimal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aluvery()
        }
    }
}

@Composable
private fun Aluvery() {
    AluveryTheme {
        Surface {
            Column(
                Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                ProductSection()
                ProductSection()
                ProductSection()
            }
        }
    }
}

@Preview
@Composable
fun AluveryPreview() {
    Aluvery()
}

@Preview(showBackground = true)
@Composable
fun ProductItemPreview() {
    ProductItem(
        Product(
            LoremIpsum(50).values.first(),
            BigDecimal("14.6"),
            R.drawable.ic_launcher_background
        )
    )
}

@Preview(showBackground = true)
@Composable
fun ProductSectionPreview() {
    ProductSection()
}
