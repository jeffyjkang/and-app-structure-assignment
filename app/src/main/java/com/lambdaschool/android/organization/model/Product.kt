package com.lambdaschool.android.organization.model

data class Product(
    val productName: String,
    val productDescription: String,
    val productPrice: Double,
    val productTax: Double,
    val productDiscount: Double
)
