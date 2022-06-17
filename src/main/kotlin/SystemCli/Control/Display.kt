package projetoOrientacao2.Control

import projetoOrientacao2.Business.DisplayBusiness
import projetoOrientacao2.Business.ManagerProduct
import projetoOrientacao2.Business.ManagerProduct.Companion.registerProduct
import projetoOrientacao2.Entity.Product

class Display {
    val optionValue:Int? =null
    private val display = DisplayBusiness()

    init{
        displayList()
    }

    fun displayList(){
        displayMenuOption()
        do{
            val resultLine = Console.readInt("Escolha a Opção desejada: ")
            if (display.changeDisplay(resultLine) == 1){
                displayListProducts()
            }else if (display.changeDisplay(resultLine) == 2){
                displayRegisterProducts()
            }else if(display.changeDisplay(resultLine) == 0){
                println("Fechando o Programa")
                return
            }
        }while(display.changeDisplay(resultLine) == -1)

    }
    fun displayMenuOption(){
        println("================= Escolha a opção desejada.============================")
        println("1- Lista de Produtos.")
        println("2- Cadastrar Produto.")
        println("0- Sair do Programa.")
        println("========================================================================")
    }
    fun displayListProducts(){
        println("================================ Menu ==================================")
        println("1- Voltar ao menu Principal.")
        println("=========================Lista de Produtos==============================")



    }
    fun displayRegisterProducts(){
        println("==================== Cadastrar Produto.==============================")
do{
    var optionvalue:Int = 0
    val resultName = Console.readNameProduct("Digite o nome do produto: ")
    val resultPreco = Console.readPriceProduct("Digite o preco do produto: ")
    val cadastrar = registerProduct(Product(resultName,resultPreco))

    if(cadastrar){
        println("Produto cadastrado com sucesso")
        val newRegister = Console.readNewRegister("Deseja Cadastrar novo Produto? 1-Sim ou 0-Não ")
        optionvalue = newRegister
    }

}while(optionvalue !=0)
        displayList()
    }
}