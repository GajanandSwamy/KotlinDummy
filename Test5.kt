package com.example.gajanand.kotlindummy
//Nested class
class ex{
    private var bb:String="Gaju"
    class anEx{
        fun me(){
//            bb=""  compilte time error
            println("Hi")
        }
    }
}

class inner{
    private var bb:String="Gaju"

    inner class Jeeva{
        fun hi(){
            bb="love"
            println("lve")
        }
    }
}

fun main() {
    val obj=ex.anEx().me() //Nested class
    val  on=inner().Jeeva().hi()
    println(obj)
    println(on)
}