package com.example.gajanand.kotlindummy

data class Per(var a:Int,var b:String){
    var name:Int = a
    var subject:String = b
}

fun main(args: Array<String>) {
    val  b=Per(10,"Java")
    val (name,subject) = b
    println("You are learning "+subject+" from "+name)


}
