package com.example.gajanand.kotlindummy

data class Book(var a:String,var b:Int)

fun main() {
    var b=Book("jeeva",10)
    println(b.a)
    println(b.b)
    b.a="Gaja"
    println(b.toString())
    println(b.hashCode())
}