package com.example.gajanand.kotlindummy

fun main() {
    var a: Int = 10;
    var c: Int =30;
    var b: Int = 20;

    var max: Int = if (a > b) a else b;
    print(max)


//// when

    val s: Int = 30;

    when (s) {

        1 -> println("Ji")
        2 -> println("Jeeva")
        else ->
            println("Nothing bro")
    }

    when (s) {
        20, 20 -> println("May be")
//        30,20-> println("May be yes")
        30 -> println("yess")
        else ->
            println("Nothing bro")

    }

    //for loop

    val items = listOf(1, 2, 3, 4);

    for (i in items) {
        println(i)
    }

    for ((i, k) in items.withIndex()) {
        println("Items if index $i and value is $k")
    }

    var z: Int = 0;
    while (z <= 10) {
        println(z)
        z++;
    }

    do {
        println(z)
        z++;

    } while (z <= 10)


}