package com.lambdaschool.android.organization.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.model.Product
import com.lambdaschool.android.organization.util.DateUtils
import com.lambdaschool.android.organization.util.TextUtils
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)

        val aProduct = Product(
            productName = "Toy",
            productDescription = "Cool Toy",
            productPrice = 100.00,
            productTax = .10,
            productDiscount = .05
        )
        displayProductDetails(aProduct)
    }

    private fun displayProductDetails(product: Product) {
        // todo: Instantiate a Product, set its characteristics, and
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields
        productName.text = product.productName
        productDescription.text = product.productDescription
        productPrice.text = TextUtils.formatCurrency(product.productPrice)
        productTax.text = TextUtils.formatPercent(product.productTax)
        totalProductPrice.text = TextUtils.formatCurrency(
            (product.productPrice * (1 + product.productTax)) * (1 - product.productDiscount)
        )
        productDiscount.text = TextUtils.formatPercent(product.productDiscount)
        orderDate.text = DateUtils.formatDate(Date())
    }
}
