package com.example.gajanand.kotlindummy

fun main(args: Array<String>) {
    var hi: String = """" Hi 
        wel come
        ki """"
    println(hi)

    var hie = if (true) "just" else "Ki"
    println(hie)

    var num = 2;
    var g = when (num) {
        in 1..3 -> " Hi here"
        in 4..6 -> " Just not"
        else -> "Nothing here "
    }
    println(g)

    for (i in 1..6)
        println(i)

    for (i in 2..9 step 1)
        println(i)
    for (i in 3..55 step 3)
        println(i)
    for (i in 5 downTo 3 step 2)
        println(i)
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i $i and j $j")
            if (i == 2)
                break@loop
        }


    }
    for (i in 1..3) {
        if (i == 2) {
            continue
        }
        println(i)
    }

    fun sun(x: Int): Int {
        return if (x <= 1) {
            x.toInt()
        } else {
            x + sun(x - 1)
        }
    }


    println(sun(10))
 fun check(num:Int = 10 ,ch:Char='a'):Unit {
     println("parameter in function definition $num and $ch")

 }

    check()
    check(12,'f')
    check(ch='a')

    val mylamda:(Int)->Unit={s: Int -> println(s)}
    fun lam(a:Int,b:Int, mylamda:(Int)->Unit){
        var c=a+b
        mylamda(c)

    }
    lam(10,20,mylamda)

    var my:(String,String)->String={S,J-> "$S and $J "}
    fun ll(s:String,j:String,fn:(String,String)->String):Unit{
      var c=fn(s,j)
        println(c)
    }
    ll("k","k",my)

}


