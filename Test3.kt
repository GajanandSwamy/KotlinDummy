package com.example.gajanand.kotlindummy

fun main() {
    println(double(10))

    var x:Int=3;
    for(i in 1..10){

        if(i==3)
            break;

        println(i)
        continue

    }

    println("Example of Break and Continue")
    myLabel@ for(x in 1..10){ // appling the custom label
        if(x==5){
            println("I am inside if block with value"+x+"\n-- hence it will close the operation")
            break@myLabel //specifing the label
        }else{
            println("I am inside else block with value"+x)
            continue@myLabel
        }
    }
}

fun double(x:Int):Int{
return 2*x;
}