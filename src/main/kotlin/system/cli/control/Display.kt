package system.cli.control

import system.cli.business.ManagerProduct.Companion.registerProduct
import system.cli.business.DisplayBusiness.Companion.changeDisplay
import system.cli.business.ManagerProduct.Companion.listarProduct
import system.cli.entity.Product

// Muito show, sistemas assim são muito bons pra praticar a lógica e os vários fluxos que podem acontecer.

class Display {

    init {
        displayList()
    }

    private fun displayList() {
        displayMenuOption()
        do {
            val resultLine = Console.readInt("Escolha a Opção desejada: ")
            if (changeDisplay(resultLine) == 1) {
                displayListProducts()
            } else if (changeDisplay(resultLine) == 2) {
                displayRegisterProducts()
            } else if (changeDisplay(resultLine) == 0) {
                println("Fechando o Programa")
                return
            }
        } while (changeDisplay(resultLine) == -1)

    }

    private fun displayMenuOption() {
        println("================= Escolha a opção desejada.============================")
        println("1- Lista de Produtos.")
        println("2- Cadastrar Produto.")
        println("0- Sair do Programa.")
        println("========================================================================")
    }

    private fun displayListProducts() {
        var optionvalue: Int
        println("================================ Menu ==================================")
        println("1- Voltar ao menu Principal.")
        println("=========================Lista de Produtos==============================")
        listarProduct()
        do {
            val resultName = Console.backMenu("Digite a opção desejada: ")
                optionvalue = resultName

        } while (optionvalue != 1 )
        displayList()
    }

    private fun displayRegisterProducts() {
        println("==================== Cadastrar Produto.==============================")
        do {
            var optionvalue = 0
            val resultName = Console.readNameProduct("Digite o nome do produto: ")
            val resultPreco = Console.readPriceProduct("Digite o preco do produto: ")
            val cadastrar = registerProduct(Product(resultName, resultPreco))

            if (cadastrar) {
                println("Produto cadastrado com sucesso")
                val newRegister = Console.readNewRegister("Deseja Cadastrar novo Produto? 1-Sim ou 0-Não ")
                optionvalue = newRegister
            }

        } while (optionvalue != 0)
        displayList()
    }
}