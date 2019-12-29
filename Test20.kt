package com.example.gajanand.kotlindummy

import java.lang.ArithmeticException

fun main() {
    val ret=getNumber("Hi")
    print(ret)
}

fun getNumber(s: String): Int {

    return try {
        Integer.parseInt(s)
    }catch (e:NumberFormatException){
        9
    }
}
