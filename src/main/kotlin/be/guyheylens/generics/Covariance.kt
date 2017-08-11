package be.guyheylens.generics

import java.util.ArrayList



open class Person2
class Employee2: Person2()

fun operate(person: List<Person2>){
}

interface ReadOnlyRepo<out T>{
    fun getId(id: Int): T

    fun getAll(): List<T>
}

interface Writerepo<in T>{
    fun save(obj: T)
    fun saveAll(list:T)
}

fun main(args: Array<String>) {
    operate(listOf<Person2>())
    operate(listOf<Employee2>())
}


val integer: Int = 1;
val nullableInteger: Int? = integer;

abstract class Animal(val size: Int)
class Dog(val cuteness: Int): Animal(100)
class Spider(val terrorFactor: Int): Animal(1)

var dogList: List<Dog> = ArrayList<Dog>()
var animalList: List<Animal> = dogList // Compiler error