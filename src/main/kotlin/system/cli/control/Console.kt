package system.cli.control

/**
 * Adorei essa classe, bastante coisa acontecendo.
 *
 * Minha provocação:
 * Qual a responsabilidade do Console? Na minha visão, ler informações.

 * Será então que faz sentido as validações de valores? Por exemplo, valor entre 0 e 5 aqui na função
 * readInt? Será que não deveria somente ler um inteiro, não interessando qual o inteiro?
 * E a camada business lida com a lógica de valores válidos ou não?
 *
 * Fazendo readNameProduct e readPriceProduct você atrelou o Console a uma entidade.
 * E se fosse, readInt, readString, readFloat? Posteriormente quando você adicionar uma outra entidade,
 * seu Console já está pronto pra ler informações.
 *
 * */

// Ninguém precisa instanciar Console
class Console private constructor() {
    companion object {
        fun readInt(msg: String): Int {
            var value: Int? = null

            do {
                print(msg)
                val result = readLine()
                if (result != null && result != "") {
                    value = result.toIntOrNull()
                }
            } while (value == null || value < 0 || value > 5)
            return value

        }

        fun readNameProduct(msg: String): String {
            var value: String? = null
            do {
                print(msg)
                val result = readLine()
                if(result != null && result !="") {
                    value = result.toLowerCase().trim()
                }
            } while (value == null || value =="")
            return value
        }

        fun readPriceProduct(msg: String): Float {
            var value: Float? = null
            do {
                print(msg)
               val result = readLine()
                if(result !=null && result != "") {
                    value = result.toFloatOrNull()
                }
            } while (value == null || value < 0f)
            return value
        }

        fun readNewRegister(msg: String): Int {
            var value: Int? = null
            do {
                print(msg)
                val result = readLine()
                if(result !=null && result != "") {
                    value = result.toIntOrNull()
                }
            } while (value == null || value < 0 || value >1)
            return value
        }//readNewRegister
        fun backMenu(msg: String): Int {
            var value: Int? = null
            do {
                print(msg)
                val result = readLine()
                if(result !=null && result != "") {
                    value = result.toIntOrNull()
                }
            } while (value == null || value != 1)
            return value
        }//
    }
}

