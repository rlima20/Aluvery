package com.example.aluvery.components

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.model.Product
import com.example.aluvery.model.sampleProducts

@Composable
fun ProductsSection(
    title: String,
    products: List<Product>
) {
    Column {
        Text(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            BuildProductList(products)
        }
    }
}

@Composable
private fun BuildProductList(productItemList: List<Product>) {
    productItemList.forEach { product ->
        ProductItem(
            Product(
                product.name,
                product.price,
                product.image
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProductSectionPreview() {
    ProductsSection("Teste", sampleProducts)
}
