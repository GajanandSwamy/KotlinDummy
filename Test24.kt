package com.example.gajanand.kotlindummy

fun main() {
    var set: Set<Int> = setOf<Int>(1, 2, 3, 3)
    var anySet: Set<Any> = setOf(1, "Gaju", "kd")
    for (el in set)
        println(el)
    for (ell in anySet)
        println(ell)

    var setw = mutableSetOf<Any>(1, 2, "JJ")
    setw.add("kk")
    for (dd in setw)
        println(dd)

        var hashSet = HashSet<Int>(6)
        hashSet.add(2)
        hashSet.add(13)
        hashSet.add(6)
        hashSet.add(5)
        hashSet.add(2)
        hashSet.add(8)
        println("......traversing hashSet......")
        for (element in hashSet){
            println(element)
        }
}