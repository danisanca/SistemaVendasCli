package system.cli.dataBase

import system.cli.entity.Product

class ProductList(val product: Product) {

    var productListDb:MutableList<Product> = mutableListOf()

}