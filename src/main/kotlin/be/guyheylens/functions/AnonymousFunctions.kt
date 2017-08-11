package be.guyheylens.functions

fun main(args: Array<String>) {

    //lambda version
    //println(op(3, {it * it}))


    //anonymous function
    println(op(2, fun(x): Int {return x * x}))



}






fun op(x: Int, op:(Int) -> Int): Int{
    if(x > 10){
        return 0
    } else {
        return x * x
    }
}

