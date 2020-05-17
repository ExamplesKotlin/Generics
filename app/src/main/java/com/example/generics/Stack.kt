package com.example.generics

class Stack<T> {

    private var items: MutableList<T>

    constructor(){
        items = ArrayList()
    }

    constructor(items: ArrayList<T>){
        this.items = items
    }

    val isEmpty: Boolean
        get() =  this.items.isEmpty()

    fun pop() : T? {
        val dato: T?

        if (!isEmpty) {
            val index = items.size - 1
            dato = items[index]
            items.removeAt(index)
            return dato
        } else {
            return null
        }
    }

    fun push(dato: T) {
        items.add(dato)
    }

}