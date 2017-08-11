package be.guyheylens.classes

fun main(args: Array<String>) {

}




class Customer(){
    var lastPurchasedAmount: Double = 0.0
        get() = field
        set(value) {
            if(value > 100){
                field = value
            }
        }


    var lastAmount: Double = 0.0
}