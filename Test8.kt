package com.example.gajanand.kotlindummy

interface A{
    var a:String
    fun he():String
    fun love(){
        println("ais")
    }
}
class BB : A,B{

    override var a:String="ji"
    override fun he()="lov"
    override fun love() {
        println("nnaa")
    }

    override fun ff(){
        println("from B")
    }



}

interface B{
    fun ff(){

    }
}

fun main() {
    var a=BB()
    println(a.a)
    println(a.he())
    println(a.love())
    println(a.ff())

}