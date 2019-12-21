package com.example.gajanand.kotlindummy

class myClas{
     private var name:String="Gaju"

    fun printMe(){
        println("The name is $name")
    }

}

fun main() {
    val  obj=myClas()
    obj.printMe()
}