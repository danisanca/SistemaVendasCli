package projetoOrientacao2.dataBase

import projetoOrientacao2.Entity.Product

class ProductList(val product: Product) {
    var productListDb:MutableList<Product> = mutableListOf()
}