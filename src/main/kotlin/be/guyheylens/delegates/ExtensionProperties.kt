package be.guyheylens.delegates

val String.hasAmpersand: Boolean
    get() = this.contains("&")

fun main(args: Array<String>) {
    println("Hello".hasAmpersand)

    println("Hello & By".hasAmpersand)
}