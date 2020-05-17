package com.example.generics

class Stack {

    private var items: MutableList<Any>

    constructor(){
        items = ArrayList()
    }

    val isEmpty: Boolean
        get() =  this.items.isEmpty()

    fun pop() : Any? {
        val dato: Any?

        if (!isEmpty) {
            val index = items.size - 1
            dato = items[index]
            items.removeAt(index)
            return dato
        } else {
            return null
        }
    }

    fun push(dato: Any) {
        items.add(dato)
    }

}