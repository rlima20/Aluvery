package com.example.aluvery.model

import com.example.aluvery.R
import java.math.BigDecimal

val productItemList = mutableListOf(
    Product(
        "Hamburguer",
        BigDecimal("12.99"),
        R.drawable.burger
    ),
    Product(
        "Pizza",
        BigDecimal("19.99"),
        R.drawable.pizza
    ),
    Product(
        "Batata frita",
        BigDecimal("7.99"),
        R.drawable.fries
    )
)
