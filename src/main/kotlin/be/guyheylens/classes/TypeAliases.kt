package be.guyheylens.classes

fun main(args: Array<String>) {

}

//I want to create a type Name?



typealias Name = String


data class Employee(val name: Name, val email: String){
    fun printName(string: Name){

    }
}