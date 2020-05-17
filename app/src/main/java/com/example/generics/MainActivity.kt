package com.example.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stackOfName: Stack<String> = Stack()
        stackOfName.push("Mary")
        stackOfName.push("Susan")
        stackOfName.push("George")
        stackOfName.push("Jessica")

        var stackOfInteger : Stack<Int> = Stack()
        stackOfInteger.push(15)
        stackOfInteger.push(44)

        do {
            Log.e("TAGX", "Nombre: ${stackOfName.pop()}")
        } while (!stackOfName.isEmpty)

        do {
            Log.e("TAGX", "Nombre: ${stackOfInteger.pop()}")
        } while (!stackOfInteger.isEmpty)

    }
}
