package com.example.gajanand.kotlindummy

fun main() {
    var map:Map<Int,String> = mapOf(1 to "KD",2 to "Gaju")

    for (key in map.keys)
        println(map[key])

    var maps:Map<Any,Any> = mapOf(1 to 1,"Gaja" to 3,4 to "Aisu")
    for (hh in maps.asIterable())
        println("${hh.key} ${hh.value}")

    for (hh in maps.iterator())
        println("${hh.key} ${hh.value}")

    var hashMap:HashMap<Int,String> = hashMapOf<Int,String>(1 to "Aisu",2 to "Gaju")
         hashMap.put(9 ,"jj")
    for (map in hashMap.keys)
        println(hashMap[map])

    for (map in hashMap.asIterable())
        println(map.value)

    for (hh in hashMap.iterator())
        println("${hh.key} ${hh.value}")


    var mut:MutableMap<Any,Any> = mutableMapOf(1 to 1,"Gaju" to "aisu",7 to "llo")
    mut.put("Gaju",99)

    for (map in mut.iterator())
        println("${map.key} ${map.value}")



}