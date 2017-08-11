package be.guyheylens.functions

fun main(args: Array<String>) {
    "Hello".shouldBeEqualTo("Hello")

    val output = "Hello"
    output shouldBeEqualTo "Hello"
}


infix fun String.shouldBeEqualTo(value: String) = this == value



