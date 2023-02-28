package com.example.aluvery.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.model.productItemList
import com.example.aluvery.ui.theme.AluveryTheme

@Composable
fun HomeScreen() {
    AluveryTheme {
        Surface {
            Column(
                Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                ProductSection("Promoções", productItemList)
                ProductSection("Doces", productItemList)
                ProductSection("Bebidas", productItemList)
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
