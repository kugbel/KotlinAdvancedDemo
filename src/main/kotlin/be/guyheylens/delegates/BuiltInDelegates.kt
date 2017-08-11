package be.guyheylens.delegates

import kotlin.properties.Delegates

typealias Name = String


data class Employee(val name: Name, val email: String){

    var department: String by Delegates.observable("", {property, oldValue, newValue ->
        println("Property ${property.name} has changed from $oldValue to $newValue")
    })

}


fun main(args: Array<String>) {
    val employee = Employee("Guy", "guy@mosp.be")

}