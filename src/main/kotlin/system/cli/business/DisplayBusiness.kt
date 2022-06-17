package system.cli.business

class DisplayBusiness {

    // Talvez também faria sentido usar um companion?
    fun changeDisplay(option:Int):Int{
        return when (option) {
            // Simplificando..
            in 0..2 -> option
            else -> -1
        }
    }
}