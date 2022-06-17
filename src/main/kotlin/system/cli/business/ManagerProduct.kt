package system.cli.business

import system.cli.entity.Product

class ManagerProduct {
    companion object{
        private val database: MutableList<Product> = mutableListOf()

        fun registerProduct(product: Product):Boolean{

            // Talvez tenha um erro de conceito aqui
            // Toda vez que você adiciona um produto, a classe ProductList é instanciada.
            // O que significa que seu 'banco de dados' é inicializado e os produtos são perdidos.

            database.add(product)

            // Essa interpolação do Kotlin faltou só uma chaves pra ficar 100%
            // println("Registrando Produto: ${product.name}")

            // Mas com a mudança de data class, talvez possa deixar print no objeto
            // Aí depende do gosto
            println("Registrando Produto: ${product.nome}")

            return true
        }
        fun listarProduct(){

               database.forEach{
                    println(it.nome)
                }

        }
    }

}