package com.example.gajanand.kotlindummy

open class ABC {
    open fun print() {
        println("Hi")
    }
}

class BC : ABC() {

    override fun print() {
        println("Jeeva")
    }


}

fun main() {
    var a = BC()
    a.print()
}