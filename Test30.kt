package com.example.gajanand.kotlindummy

open class Ex{
    open fun fly(){
        println("Bird fly:Base class")
    }
}

open interface gg{

  open   fun fly(){
        println("Bird fly:Interface")
    }
}


class Dd:Ex(),gg{
    override fun fly(){
        super<Ex>.fly()
        super<gg>.fly()

    }
}

fun main() {
    var s=Dd()
    s.fly()
}
