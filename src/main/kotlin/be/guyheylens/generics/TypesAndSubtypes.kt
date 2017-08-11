package be.guyheylens.generics

open class Person(val id: Int, val name: String)

class Employee(employeeid: Int, id: Int, name: String): Person(id, name){}

fun operate(person: Person){}

fun main(args: Array<String>) {

    val p = Person(1, "Guy")
    val e = Employee(5, 1, "Guy")
    val op = operate(e)

}