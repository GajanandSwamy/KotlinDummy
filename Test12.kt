package com.example.gajanand.kotlindummy

import java.util.ArrayList

fun main(args: Array<String>) {
    var list:List<String> = listOf<String>("a","B","c")
    print(list)
    var ff:List<Float> = listOf(12.33f,22.44f)
    print(ff)
}

fun <T>print(list:ArrayList<T>){
    for (el in list)
        println(el)
}