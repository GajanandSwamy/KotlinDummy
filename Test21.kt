package com.example.gajanand.kotlindummy

fun main(args: Array<String>){
    try {
        val a = IntArray(5)
        a[5] = 10 / 0
    } catch (e: ArithmeticException) {
        println("arithmetic exception catch")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("array index outofbounds exception")
    } catch (e: Exception) {
        println("parent exception class")
    }

     validate(12)
    println("code after try catch...")
}

fun validate(i: Int) {
         if(i<18)
             throw java.lang.ArithmeticException(" Under age")
}

