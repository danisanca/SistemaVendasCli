package system.cli.control

class Console {
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
    }
}

