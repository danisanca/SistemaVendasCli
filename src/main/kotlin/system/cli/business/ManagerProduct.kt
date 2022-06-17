package system.cli.business

import system.cli.dataBase.ProductList
import system.cli.entity.Product

class ManagerProduct() {

    companion object {
        fun registerProduct(product: Product): Boolean {
            val database = ProductList(product)
            database.productListDb.add(product)
            println("Registrando Produto: $product.name")
            return true
        }

    }

}