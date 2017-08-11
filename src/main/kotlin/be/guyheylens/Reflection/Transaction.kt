package be.guyheylens.Reflection

class Transaction( val id: Int, val amount: Double, var description: String){
    fun validate(){
        if (amount > 10000){
            println("Transaction is too large")
        }
    }
}