package com.example.gajanand.kotlindummy

class Test6(val name: String, var age: Int) {

}


fun main(args: Array<String>) {
    val person1 = Test6("Gaju", 28);
    val  per=Test6("ais",33)
    println("Values are ${person1.name} and ${person1.age}")
    println(per.name +" and "+per.age)
    val nn=Person("jvv",18,"love")
    val n=Person("pp",99)
    println("${nn.name}${nn.aa}${nn.age}")
}

class Person(val name:String,var age: Int){
    var aa:String="Hi"
    constructor(name: String,age: Int,message:String):this(name,age)
}