package com.example.gajanand.kotlindummy

fun main() {

    val list: ArrayList<String> = arrayListOf("gg", "jjj")
    val list2: ArrayList<Int> = arrayListOf(1, 2)

    printv(list)
    printv(list2)
    val s = (30.downTo(1))
    var it = s.iterator()
    while (it.hasNext()){
        println(it.nextInt())
    }
}

fun <T> printv(list: ArrayList<T>) {
    for (el in list) {
        println(el)
    }


}

