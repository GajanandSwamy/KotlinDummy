package com.example.gajanand.kotlindummy

inline fun add(a:Int,b:Int,myGun:()->Unit):Unit{
myGun()
    print("KI   ")
}
fun main() {
    add(2,9,myGun = {"ji"})
}