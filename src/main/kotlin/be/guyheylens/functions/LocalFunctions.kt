package be.guyheylens.functions

fun main(args: Array<String>) {
    foo("test")
    
}

//example of a local function

fun foo(fooParam: String){

    val outerFunction = "Value"

    //function within a function
    fun bar(barParam: String){

        println(barParam)
        println(fooParam)
        println(outerFunction)

    }

    bar(fooParam)
}