package com.example.generics

class Stack {

    private var items: MutableList<String>

    constructor(){
        items = ArrayList()
    }

    val isEmpty: Boolean
        get() =  this.items.isEmpty()

    fun pop() : String? {
        val dato: String?

        if (!isEmpty) {
            val index = items.size - 1
            dato = items[index]
            items.removeAt(index)
            return dato
        } else {
            return null
        }
    }

    fun push(dato: String) {
        items.add(dato)
    }

}