package com.example.gajanand.kotlindummy

class Persons(val age:Int,val name:String){
    var isElder:Boolean =false
    val myage=24
    init {
        isElder=age>myage
    }
}

fun main(args: Array<String>) {
    var b=Persons(29,"Gaju")
    print(b.isElder)
}