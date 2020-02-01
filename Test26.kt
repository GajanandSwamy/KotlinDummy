package com.example.gajanand.kotlindummy

fun main(args: Array<String>) {
    var hi: String? = "hi"
    hi = null
    println(hi)

    var gj: String = "hii"

    val h: String? = "hh"
    if (h != null) {
        println(h.length)
    }
    var obj: Any? = null
    var hhk: String? = obj as? String
    println(hhk)

    var ch: String? = null
    var ff: String = "ll"
    var len: Int = ch?.length ?: -1
    var f: Int = ff?.length ?: -1

    println("$len and $f")

    var chj: IntArray = intArrayOf(12, 2, 3, 94, 5)

    for (el in chj)
        println(el)

    for (el in 0..chj.size - 1)
        println(chj[el])


    for (el in chj.indices)
        println(chj[el])
}