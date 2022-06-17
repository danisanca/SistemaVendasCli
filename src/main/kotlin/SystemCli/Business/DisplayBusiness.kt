package projetoOrientacao2.Business

class DisplayBusiness {
    fun changeDisplay(option:Int):Int{
       return when(option){
            1 -> return option
            2 -> return option
            0 -> return option

        else -> -1
        }
    }
}