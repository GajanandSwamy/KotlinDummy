package com.example.gajanand.kotlindummy

sealed class Anim
class cat:Anim()
class dog:Anim()

fun main() {

   var a=cat()
    fee(a)
}


fun fee(anim: Anim){
    when(anim){
        is cat-> println("cat")
        is dog-> print("dog")
    }
}