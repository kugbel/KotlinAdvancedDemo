package be.guyheylens.classes

import kotlin.properties.Delegates

class Veto{
    var value: String by Delegates.vetoable("String") {prop, old, new -> new.startsWith("S")}
}


fun main(args: Array<String>) {
    val veto = Veto()

    println(veto.value)
    veto.value = "Brussels"
    println(veto.value)
    veto.value = "Spain"
    println(veto.value)

}