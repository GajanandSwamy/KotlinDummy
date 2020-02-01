package com.example.gajanand.kotlindummy

fun main(args: Array<String>) {
    val list:List<Any> = listOf<Any>(1,2,3,4,"jfjf","kkjhd",445,0,99)
    for (element in list)
        println(element)

    for (index in list.indices)
        println(list[index])


    var mut:MutableList<String> = mutableListOf("Gajanand","kkk")
    var mut1 = mutableListOf("222",22)
    mut1.addAll(mut)
    for (ele in mut1)
        println(ele)
    val itr=mut1.iterator()
    while (itr.hasNext())
        println(itr.next())

    println("====================")

    var arr:ArrayList<String> = ArrayList<String>(1)
    arr.add("Gaju")
    arr.add("hh")

    val itt = arr.iterator()
    while (itt.hasNext())
        println(itt.next())

    println("=================")
    var li = arrayListOf("77","Gaju","ooo")
    li.add("hh")
    var lis:ArrayList<Any> = arrayListOf<Any>("22",22,33,"ji")
    lis.addAll(2,li)
    var ii=lis.iterator()
    while (ii.hasNext())
        println(ii.next())

    data class Emp(var  age:Int,var name:String)

    var emp:ArrayList<Emp> = arrayListOf()
    emp.add(Emp(122,"Gaju"))

    var tt=emp.iterator()
    while (tt.hasNext())
        println(tt.next())

   for (e in emp)
       println("${e.age} and ${e.name}")


    println("===============")

    var map= mapOf<Int,String>(1 to "Gaja",2 to "shiva")

    for (key in map.keys)
        println("$key to ${map[key]}")

    for (it in map.iterator())
        println("${it.key} and ${it.value}")

    var hmap:HashMap<String,Int> = HashMap();
    hmap.put("jj",1)
    hmap.put("kk",7)

    for (it in hmap.iterator())
        println("${it.value}")

    var mmap:MutableMap<Int,Int> = mutableMapOf()
    mmap.put(11,22)
    mmap.put(33,66)

    for (m in mmap)
        println(m.value)

    println("=================")

    var sets = setOf<Any>(1,"dd")

    for (e in sets)
        println(e)

    var ss:MutableSet<Any> = mutableSetOf(1,2)
    ss.add("jj")

   var ioo=ss.iterator()
    while (ioo.hasNext())
        println(ioo.next())

    var hashSetOf1 = hashSetOf<Int>(2,13,6,5,2,8)
    var hashSetOf2: HashSet<String> = hashSetOf<String>("Vijay","Ashu" ,"Vijay","Roshan")
    println("......traversing hashSetOf1......")
    for (element in hashSetOf1){
        println(element)
    }
    println("......traversing hashSetOf2......")
    for (element in hashSetOf2){
        println(element)
    }

}