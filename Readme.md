
This is Just a dummy project for kotlin practise not android kotlin project.

Om Namah Shivaya  -- Hare Krishna

Kotlin
=========================================


 Statically typed programming languages do type checking (i.e. the process of verifying and
 enforcing the constraints of types) at compile-time as opposed to run-time.

 Examples: C, C++, Java, Rust, Go, Scala


Dynamically typed programming languages do type checking at run-time as opposed to compile-time.

Examples: Perl, Ruby, Python, PHP, JavaScript

Features of Kotlin
-------------------------------------

Concise: Kotlin reduces writing the extra codes. This makes Kotlin more concise.

Null safety: Kotlin is null safety language. Kotlin aimed to eliminate the NullPointerException (null reference) from the code.Interoperable.


Interoperable: Kotlin easily calls the Java code in a natural way as well as Kotlin code can be used by Java.

Smart cast: It explicitly typecasts the immutable values and inserts the value in its safe cast automatically.

Compilation Time: It has better performance and fast compilation time.

Tool-friendly: Kotlin programs are build using the command line as well as any of Java IDE.

Extension function: Kotlin supports extension functions and extension properties which means it helps to extend the functionality of classes without touching their code.



Java vs Kotlin
---------------------
https://kotlinlang.org/docs/reference/comparison-to-java.html


https://www.educba.com/java-vs-kotlin/



var is like general variable and it's known as a mutable variable in kotlin and
can be assigned multiple times.

val is like Final variable and it's known as immutable in kotlin and can be
initialized only single time.


Ranges is another unique characteristic of Kotlin. Like Haskell,
 it provides an operator that helps you iterate through a range.
 Internally, it is implemented using rangeTo() and its operator form is (..).

In the following example, we will see how Kotlin interprets this range operator.

fun main(args: Array<String>) {
   val i:Int  = 2
   for (j in 1..4)
   print(j) // prints "1234"

   if (i in 1..10) { // equivalent of 1 < = i && i < = 10
      println("we found your number --"+i)
   }
}

0/p:1234we found your number --2

If - Else

Kotlin is a functional language hence like every functional language in Kotlin “if” is an expression,
it is not a keyword. The expression “if” will return a value whenever necessary.
 Like other programming language, “if-else” block is used as an initial conditional checking operator.
In the following example, we will compare two variables and provide the required output accordingly.


fun main(args: Array<String>) {
   val a:Int = 5
   val b:Int = 2
   var max: Int

   if (a > b) {
      max = a
   } else {
      max = b
   }
   print("Maximum of a or b is " +max)

   // As expression
   // val max = if (a > b) a else b
}

Maximum of a or b is 5

Use of When

same as switch in java

fun main(args: Array<String>) {
   val x:Int = 5
   when (x) {
      1 -> print("x = = 1")
      2 -> print("x = = 2")

      else -> { // Note the block
         print("x is neither 1 nor 2")
      }
   }
}

x is neither 1 nor 2


Kotlin provides another flexibility to the developer,
where the developer can provide multiple checks in the same line by providing “,”
inside the checks. Let us modify the above example as follows.

fun main(args: Array<String>) {
   val x:Int = 5
   when (x) {
      1,2 -> print(" Value of X either 1,2")

      else -> { // Note the block
         print("x is neither 1 nor 2")
      }
   }
}

x is neither 1 nor 2


For Loop
=================

fun main(args: Array<String>) {
   val items = listOf(1, 22, 83, 4)

   for ((index, value) in items.withIndex()) {
      println("the element at $index is $value")
   }
}

op:
values of the array1
values of the array2
values of the array3
values of the array4

Following is another example of code, where we are using some
library function to make our development work easier than ever before.

fun main(args: Array<String>) {
   val items = listOf(1, 22, 83, 4)

   for ((index, value) in items.withIndex()) {
      println("the element at $index is $value")
   }
}


the element at 0 is 1
the element at 1 is 22
the element at 2 is 83
the element at 3 is 4


while:
=========

fun main(args: Array<String>) {
   var x:Int = 0
   println("Example of While Loop--")

   while(x< = 10) {
      println(x)
      x++
   }
}
Example of While Loop--
0
1
2
3
4
5
6
7
8
9
10

Kotlin also has another loop called Do-While loop,
where the loop body will be executed once, only then the condition will be checked.
The following example shows the usage of the Do-while loop.

fun main(args: Array<String>) {
   var x:Int = 0
   do {
      x = x + 10
      println("I am inside Do block---"+x)
   } while(x <= 50)
}

I am inside Do block---10
I am inside Do block---20
I am inside Do block---30
I am inside Do block---40
I am inside Do block---50
I am inside Do block---60


Return − Return is a keyword that returns some value to the calling function from the called function.
 In the following example, we will implement this scenario using our Kotlin coding ground.

 fun main(args: Array<String>) {
    var x:Int = 10
    println("The value of X is--"+doubleMe(x))
 }
 fun doubleMe(x:Int):Int {
    return 2*x;
 }

 The value of X is--20

Continue & Break:
===================
fun main(args: Array<String>) {
   println("Example of Break and Continue")
   myLabel@ for(x in 1..10) { // appling the custom label
      if(x = = 5) {
         println("I am inside if block with value"+x+"\n-- hence it will close the operation")
         break@myLabel //specifing the label
      } else {
         println("I am inside else block with value"+x)
         continue@myLabel
      }
   }
}

Example of Break and Continue
I am inside else block with value1
I am inside else block with value2
I am inside else block with value3
I am inside else block with value4
I am inside if block with value5
-- hence it will close the operation


NOTE:
--------

Nested classes are divided into two categories: static and non-static.
Nested classes that are declared static are simply called static nested classes.
Non-static nested classes are called inner classes.

Classes:
========================
a class is a blueprint of a runtime entity and object is its state,
 which includes both its behavior and state.

 Nested Class
 --------------

 By definition, when a class has been created inside another class,
  then it is called as a nested class. In Kotlin, nested class is by default static,
   hence, it can be accessed without creating any object of that class.
 In the following example, we will see how Kotlin interprets our nested class.


fun main(args: Array<String>) {
   val demo = Outer.Nested().foo() // calling nested class method
   print(demo)
}
class Outer {
   class Nested {
      fun foo() = "Welcome to The TutorialsPoint.com"
   }
}

op:
Welcome to The TutorialsPoint.com

inner class
-----------------
When a nested class is marked as a “inner”, then it will be called as an Inner class.
 An inner class can be accessed by the data member of the outer class.
 In the following example, we will be accessing the data member of the outer class.

fun main(args: Array<String>) {
   val demo = Outer().Nested().foo() // calling nested class method
   print(demo)
}
class Outer {
   private val welcomeMessage: String = "Welcome to the TutorialsPoint.com"
   inner class Nested {
      fun foo() = welcomeMessage
   }
}

op:
Welcome to the TutorialsPoint.com

note: u can access the members of outeclass in inner class


Type Aliases
==============
Type aliases are a property of Kotlin compiler.
It provides the flexibility of creating a new name of an existing type,
it does not create a new type. If the type name is too long,
you can easily introduce a shorter name and use the same for future usage.

Constructors
=======================
Kotlin has two types of constructor -
one is the primary constructor and the other is the secondary constructor.

fun main(args: Array<String>) {
   val person1 = Person("TutorialsPoint.com", 15)
   println("First Name = ${person1.firstName}")
   println("Age = ${person1.age}")
}
class Person(val firstName: String, var age: Int) {
}

op:
First Name = TutorialsPoint.com
Age = 15

This secondary constructor is created using the “constructor” keyword.
 It is required whenever you want to create more than one constructor in Kotlin or whenever you want to include more logic in the primary constructor
 and you cannot do that because the primary constructor may be called by some other class.





