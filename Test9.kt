package com.example.gajanand.kotlindummy

class Test9 {
    var a:String="HI"
    fun print(){
        println("Love")
    }
}

class D{
    companion object{
        var a:String ="null"
        fun display(){
            println("Jeeva")
        }
    }
}

fun main(args: Array<String>) {
    var g=Test9()
    println(g.print())
    g.addThisMethodToTest9()
    D.display()
    println(D.a)
}

fun Test9.addThisMethodToTest9(){
    println("example of extension")
}
