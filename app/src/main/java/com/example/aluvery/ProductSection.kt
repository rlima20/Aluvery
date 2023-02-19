package com.example.aluvery

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val ITEM_TEXT = LoremIpsum(50).values.first()
private const val ITEM_VALUE = "R$ 14,99"
private const val ITEM_IMAGE = R.drawable.ic_launcher_background

@Composable
fun ProductSection() {
    val productItemList = mutableListOf<Item>()

    for (item in 1..5) {
        productItemList.add(Item(ITEM_TEXT, ITEM_VALUE, ITEM_IMAGE))
    }

    Column {
        Text(
            modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp),
            text = "Promoções",
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            BuildProductList(productItemList)
        }
    }
}

@Composable
private fun BuildProductList(productItemList: MutableList<Item>) {
    productItemList.forEach {
        ProductItem(
            it.text,
            it.value,
            it.image
        )
    }
}
