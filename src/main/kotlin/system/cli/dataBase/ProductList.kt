package system.cli.dataBase

import system.cli.entity.Product

// Precisa do prduto no construtor?
class ProductList(val product: Product) {
    var productListDb:MutableList<Product> = mutableListOf()
}

/*
 * Achei bacana a ideia aqui de ter a camada do banco separada, parece bom.
 * O banco tem suas responsabilidades e seus controles, então faz sentido.
 *
 * Essa lista tá atrelada a instância da classe, seria melhor ser estática.
 * Assim como você fez no ManagerProduct.
 */