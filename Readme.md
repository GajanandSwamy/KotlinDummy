
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




