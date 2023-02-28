package com.example.aluvery.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.R
import com.example.aluvery.extensions.toBrazilianCurrency
import com.example.aluvery.model.Product
import com.example.aluvery.ui.theme.Purple500
import com.example.aluvery.ui.theme.Teal200
import java.math.BigDecimal

@Composable
fun ProductItem(product: Product) {
    Surface(
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
        ) {
            CardSection(product.image)
            Spacer(modifier = Modifier.height(50.dp))
            TextSection(product.name, product.price.toBrazilianCurrency())
        }
    }
}

@Composable
private fun CardSection(image: Int) {
    Box(
        modifier = Modifier
            .height(100.dp)
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Purple500,
                        Teal200
                    )
                )
            )
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            Modifier
                .offset(y = (50).dp)
                .size(100.dp)
                .clip(shape = CircleShape)
                .align(alignment = Alignment.BottomCenter),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
private fun TextSection(text: String, value: String) {
    Column(Modifier.padding(16.dp)) {
        Text(
            text = text,
            fontSize = 18.sp,
            fontWeight = FontWeight(700),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = value,
            fontSize = 14.sp,
            fontWeight = FontWeight(400)
        )
    }
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
