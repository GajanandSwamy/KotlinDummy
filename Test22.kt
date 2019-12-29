package com.example.gajanand.kotlindummy

fun main() {
    var myArr = Array<Int>(5) { 9 }
    myArr[0] = 1
    myArr[4] = 8
    for (element in myArr)
        println(element)


    var myArra1 = arrayOf(1, 2, "Gaju", "aisu", "kd", "swamy", 12.7f, 22.00)
    for (element in myArra1)
        println(element)


    var array: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
    for (el in 0..array.size - 1)
        println(array[el])


    var list = listOf(1, 2, 3, 4, 5, "Ha", "Ja")
    for (li in list)
        println(li)

    var lists: List<Any> = listOf<Any>(0, 1, 2, 5, "Gaja", 22.88f)
    for (a in 0..lists.size - 1)
        println(lists[a])

    var li: MutableList<Int> = mutableListOf<Int>(1, 2, 3, 4)
    li.add(0)

    for (li in li)
        println(li)

    var ji:MutableList<Any> = mutableListOf()
    ji.add("Hi")
    ji.add(12)
    ji.addAll(li)
    ji.addAll(myArra1)

    for(ji in ji)
        println(ji)

    var Arr:ArrayList<String> = ArrayList();
    Arr.add("KI")
    Arr.add("JI")
    Arr.add("kk")
    var d=Arr.iterator()
    while (d.hasNext())
        println(d.next())

    var arr:ArrayList<KDA> = arrayListOf()
    arr.add(KDA(22,"SweetHeart"))
    arr.add(KDA(55,"jio"))

    var iterator=arr.iterator();
    while (iterator.hasNext())
        println(iterator.next())

    for (e in arr)
        println("${e.age} ${e.name}")
}

data class KDA(var age:Int,var name: String)