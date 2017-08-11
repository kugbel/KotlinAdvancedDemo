package be.guyheylens.functions

fun main(args: Array<String>) {
    containingAnonFunc()
}


fun containingFunction(){
    val numbers = 1..100

    numbers.forEach myLabel@{
        if(it % 5 == 0){
            return@myLabel
        }

    }

    println("Hello!")
}

fun containingAnonFunc(){
    val numbers = 1..100
    numbers.forEach(fun(element){
        if(element % 5 == 0){
            return
        }
    })

    println("Hello")
}
