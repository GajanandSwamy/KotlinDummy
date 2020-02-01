package com.example.gajanand.kotlindummy

fun main(arg: Array<String>) {

    var s = String::class
    val c2 = ABCD::class
    var c = ABCD()
    c.show()

    println(::printt)

    fun isPositive(x: Int):Boolean{
      return (x > 0)
    }
    val numbers = listOf(-10, -5, 0, 5, 10)
    println(numbers.filter(::isPositive))



    println(::x.get())
    println(::x.name)

}
val x = 5
val y = 5

fun printt(): String {
    return "hh"
}


class ABCD {
    fun show() {
        print("KK")
    }
}