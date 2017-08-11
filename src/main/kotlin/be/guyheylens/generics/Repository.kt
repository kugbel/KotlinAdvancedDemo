package be.guyheylens.generics

import be.guyheylens.classes.Customer


open class Entity(val id: Int) {
    constructor() : this(0)
}

interface Serializable

//Default in Kotlin T is a nullable type "Any"
class Repository<T> where T: Entity, T:Serializable {
    fun save(entity: T){
        if(entity.id != 0){
            // ...
        }
    }
}


fun<T:Any> streamObject(obj: T){

}

fun<T:Any?> streamObject2(obj: T){

}

fun main(args: Array<String>) {
    val repo = Repository<Persona>()
}

class Persona: Entity(), Serializable{

}