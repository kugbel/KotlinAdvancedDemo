package be.guyheylens.functions

inline fun operation(op: () -> Unit){
    println("Before calling op")
    op()
    println("After calling op")
}


fun main(args: Array<String>) {

    //enter the lambda
    operation {println("This is the actual function")}

}