package projetoOrientacao2.Business

import projetoOrientacao2.Entity.Product
import projetoOrientacao2.dataBase.ProductList

class ManagerProduct() {

    companion object{
        fun registerProduct(product: Product):Boolean{
            val database = ProductList(product)
            database.productListDb.add(product)
            println("Registrando Produto: $product.name")
return true
        }
    }

}