
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

 ```
fun main(args: Array<String>) {
   val i:Int  = 2
   for (j in 1..4)
   print(j) // prints "1234"

   if (i in 1..10) { // equivalent of 1 < = i && i < = 10
      println("we found your number --"+i)
   }
}

 ```
0/p:1234we found your number --2

If - Else

Kotlin is a functional language hence like every functional language in Kotlin “if” is an expression,
it is not a keyword. The expression “if” will return a value whenever necessary.
 Like other programming language, “if-else” block is used as an initial conditional checking operator.
In the following example, we will compare two variables and provide the required output accordingly.

 ```
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
 ```
Maximum of a or b is 5

Use of When

same as switch in java
 ```
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
 ```
x is neither 1 nor 2


Kotlin provides another flexibility to the developer,
where the developer can provide multiple checks in the same line by providing “,”
inside the checks. Let us modify the above example as follows.

 ```
fun main(args: Array<String>) {
   val x:Int = 5
   when (x) {
      1,2 -> print(" Value of X either 1,2")

      else -> { // Note the block
         print("x is neither 1 nor 2")
      }
   }
}
 ```
x is neither 1 nor 2


For Loop
=================

 ```
fun main(args: Array<String>) {
   val items = listOf(1, 22, 83, 4)

   for ((index, value) in items.withIndex()) {
      println("the element at $index is $value")
   }
}

 ```
op:
values of the array1
values of the array2
values of the array3
values of the array4

Following is another example of code, where we are using some
library function to make our development work easier than ever before.

 ```
fun main(args: Array<String>) {
   val items = listOf(1, 22, 83, 4)

   for ((index, value) in items.withIndex()) {
      println("the element at $index is $value")
   }
}
 ```

the element at 0 is 1
the element at 1 is 22
the element at 2 is 83
the element at 3 is 4


while:
=========

 ```

fun main(args: Array<String>) {
   var x:Int = 0
   println("Example of While Loop--")

   while(x< = 10) {
      println(x)
      x++
   }
}
 ```
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

 ```
fun main(args: Array<String>) {
   var x:Int = 0
   do {
      x = x + 10
      println("I am inside Do block---"+x)
   } while(x <= 50)
}

 ```
I am inside Do block---10
I am inside Do block---20
I am inside Do block---30
I am inside Do block---40
I am inside Do block---50
I am inside Do block---60


Return − Return is a keyword that returns some value to the calling function from the called function.
 In the following example, we will implement this scenario using our Kotlin coding ground.

 ```
 fun main(args: Array<String>) {
    var x:Int = 10
    println("The value of X is--"+doubleMe(x))
 }
 fun doubleMe(x:Int):Int {
    return 2*x;
 }

 ```
 The value of X is--20

Continue & Break:
===================
 ```
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
 ```
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

 ```
fun main(args: Array<String>) {
   val demo = Outer.Nested().foo() // calling nested class method
   print(demo)
}
class Outer {
   class Nested {
      fun foo() = "Welcome to The TutorialsPoint.com"
   }
}
 ```
op:
Welcome to The TutorialsPoint.com

inner class
-----------------
When a nested class is marked as a “inner”, then it will be called as an Inner class.
 An inner class can be accessed by the data member of the outer class.
 In the following example, we will be accessing the data member of the outer class.
 ```
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
 ```
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
 ```
fun main(args: Array<String>) {
   val person1 = Person("TutorialsPoint.com", 15)
   println("First Name = ${person1.firstName}")
   println("Age = ${person1.age}")
}
class Person(val firstName: String, var age: Int) {
}
 ```
op:
First Name = TutorialsPoint.com
Age = 15

This secondary constructor is created using the “constructor” keyword.
 It is required whenever you want to create more than one constructor in Kotlin or whenever you want to include more logic in the primary constructor
 and you cannot do that because the primary constructor may be called by some other class.

 ```
fun main(args: Array<String>) {
   val HUman = HUman("TutorialsPoint.com", 25)
   print("${HUman.message}"+"${HUman.firstName}"+
      "Welcome to the example of Secondary  constructor, Your Age is-${HUman.age}")
}

class HUman(val firstName: String, var age: Int) {
   val message:String  = "Hey!!!"
	constructor(name : String , age :Int ,message :String):this(name,age) {
   }
}


 ```
output:
Hey!!! TutorialsPoint.comWelcome to the example of Secondary  constructor, Your Age is- 25



Inheritance
====================


Like all other OOPS, Kotlin also provides this functionality using one keyword known as “:”.

Everything in Kotlin is by default final, hence, we need to use the keyword “open” in front of the class declaration to make it allowable to inherit.
Take a look at the following example of inheritance.

 ```
import java.util.Arrays

open class ABC {
   fun think () {
      print("Hey!! i am thiking ")
   }
}
class BCD: ABC(){ // inheritence happend using default constructor
}

fun main(args: Array<String>) {
   var  a = BCD()
   a.think()
}
 ```
op:

Hey!! i am thiking

Now, what if we want to override the think() method in the child class

 ```
import java.util.Arrays

open class ABC {
   open fun think () {
      print("Hey!! i am thinking ")
   }
}
class BCD: ABC() { // inheritance happens using default constructor
   override fun think() {
      print("I Am from Child")
   }
}
fun main(args: Array<String>) {
   var  a = BCD()
   a.think()
}
 ```

op:
I Am from Child


Interface
================
In Kotlin, the interface works exactly similar to Java 8,
 which means they can contain method implementation as well as abstract methods declaration.
 ```
interface ExampleInterface  {
   var myVar: Int            // abstract property
   fun absMethod():String    // abstract method

   fun hello() {
      println("Hello there, Welcome to TutorialsPoint.Com!")
   }
}
class InterfaceImp : ExampleInterface {
   override var myVar: Int = 25
   override fun absMethod() = "Happy Learning "
}
fun main(args: Array<String>) {
   val obj = InterfaceImp()
   println("My Variable Value is = ${obj.myVar}")
   print("Calling hello(): ")
   obj.hello()

   print("Message from the Website-- ")
   println(obj.absMethod())
}
 ```
op:
Calling hello(): Hello there, Welcome to TutorialsPoint.Com!
Message from the Website-- Happy Learning

we will create two interfaces and later we will implement both the interfaces into a class.

 ```
interface A {
   fun printMe() {
      println(" method of interface A")
   }
}
interface B  {
   fun printMeToo() {
      println("I am another Method from interface B")
   }
}

// implements two interfaces A and B
class multipleInterfaceExample: A, B

fun main(args: Array<String>) {
   val obj = multipleInterfaceExample()
   obj.printMe()
   obj.printMeToo()
}
 ```
op:
method of interface A
I am another Method from interface B


Visibility Modifiers:
---------------------
1.If you do not specify any visibility modifier, public is used by default,
 which means that your declarations will be visible everywhere;

2.If you mark a declaration private, it will only be visible inside the file containing the declaration;3
3.If you mark it internal, it is visible everywhere in the same module;
4.protected visible inside the same class and it subclass.


https://media.geeksforgeeks.org/wp-content/uploads/20190619121051/modi.jpg

By default constructors are public, but we can also change the visibility of
 constructor using the modifiers.
 ```
class A (name : String) {
      // other code
}
 ```
We must explicitly specify with constructor keyword while changing the visibility.
 ```
class A private constructor (name : String) {
      // other code
}
 ```

Function Extension
====================

Using extension, we will be able to add or remove
 some method functionality even without inheriting or modifying them.
 ```
class Alien {
   var skills : String = "null"

   fun printMySkills() {
      print(skills)
   }
}
fun main(args: Array<String>) {
   var  a1 = Alien()
   a1.skills = "JAVA"
   //a1.printMySkills()

   var  a2 = Alien()
   a2.skills = "SQL"
   //a2.printMySkills()

   var  a3 = Alien()
   a3.skills = a1.addMySkills(a2)
   a3.printMySkills()
}
fun Alien.addMySkills(a:Alien):String{
   var a4 = Alien()
   a4.skills = this.skills + " " +a.skills
   return a4.skills
}
 ```
 op:
 JAVA SQL


Object Extension
=======================

A companion object is an object which is
 declared inside a class and marked with the companion keyword. Companion object is used to call the member function of class directly using the class name (like static in java).

A class which contains companion object can also be defined as extension function
and property for the companion object.

 ```
class MyClass {
    companion object {
        fun create():String{
            return "calls create method of companion object"
        }
    }
}
fun main(args: Array<String>){
val instance = MyClass.create()
}

 ```
op:
calls create method of companion object

Data Classes
=========================================
1.A class can be marked as a Data class whenever it is marked as ”data”. This type of class can be used to hold the basic data apart.
 Other than this, it does not provide any other functionality.
2.All the data classes need to have one primary constructor
and all the primary constructor should have at least one parameter.
3.Any data class cannot have a modifier like abstract and open or internal.
 Data class can be extended to other classes too.

 ```
fun main(args: Array<String>) {
   val book: Book = Book("Kotlin", "TutorialPoint.com", 5)
   println("Name of the Book is--"+book.name) // "Kotlin"
   println("Puclisher Name--"+book.publisher) // "TutorialPoint.com"
   println("Review of the book is--"+book.reviewScore) // 5
   book.reviewScore = 7
   println("Printing all the info all together--"+book.toString())
   //using inbuilt function of the data class

   println("Example of the hashCode function--"+book.hashCode())
}


data class Book(val name: String, val publisher: String, var reviewScore: Int)

 ```
op:

Name of the Book is--"Kotlin"
Puclisher Name--"TutorialPoint.com"
Review of the book is--5
Printing all the info all together--(name-Kotlin, publisher-TutorialPoint.com, reviewScore-7)
Example of the hashCode function---1753517245


Sealed Class
==================
https://stackoverflow.com/questions/50772328/what-are-sealed-classes-in-kotlin

Sealed classes are used for representing restricted class hierarchies,
 when a value can have one of the types from a limited set, but cannot have any other type.

 A sealed class is abstract by itself, it cannot be instantiated directly and can have abstract members.

Sealed classes are not allowed to have non-private constructors (their constructors are private by default).

 ```
sealed class MyExample {
   class OP1 : MyExample() // MyExmaple class can be of two types only
   class OP2 : MyExample()
}
fun main(args: Array<String>) {
   val obj: MyExample = MyExample.OP2()

   val output = when (obj) { // defining the object of the class depending on the inuputs
      is MyExample.OP1 -> "Option One has been chosen"
      is MyExample.OP2 -> "option Two has been chosen"
   }

   println(output)
}

 ```
op:
option Two has been chosen


Delegation
==================
Kotlin supports “delegation” design pattern by introducing a new keyword “by”.
 Using this keyword or delegation methodology, Kotlin allows the derived class to access all the implemented public methods of an interface through a specific object.
The following example demonstrates how this happens in Kotlin.

 ```
interface Base {
   fun printMe() //abstract method
}
class BaseImpl(val x: Int) : Base {
   override fun printMe() { println(x) }   //implementation of the method
}
class Derived(b: Base) : Base by b  // delegating the public method on the object b

fun main(args: Array<String>) {
   val b = BaseImpl(10)
   Derived(b).printMe() // prints 10 :: accessing the printMe() method
}

 ```
op:
10

Using Lazy()
===============
Lazy is a lambda function which takes a property as an input and in return gives an instance of Lazy<T>, where <T> is basically the type of the properties it is using.
Let us take a look at the following to understand how it works.

only for val

 ```
val myVar: String by lazy {
   "Hello"
}
fun main(args: Array<String>) {
   println(myVar +" My dear friend")
}
 ```
op:
Hello My dear friend


Init in Kotlin
========================
1.The init block is always called after the primary constructor before secondary constructor
2.A class file can have one or more init blocks executing in series.

Lambda Function
======================

Lambda is a function which has no name.
Lambda is defined with a curly braces {} which takes variable as a parameter (if any)
 and body of function. The body of function is written after variable (if any) followed by -> operator.

syntax:
{ variable -> body_of_function}

addition of two numbers:
 ```

fun main(args: Array<String>){
    val myLambda: (Int) -> Unit= {s: Int -> println(s) } //lambda function
    addNumber(5,10,myLambda)
}
fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit ){   //high level function lambda as parameter
    val add = a + b
    mylambda(add) // println(add)
}

 ```

op:
15

Higher order function
===========================
High order function (Higher level function) is a function which accepts function as a parameter or
 returns a function or can do both. Means, instead of passing Int, String,
or other types as a parameter in a function we can pass a function as a parameter in other function.

 ```
fun myFun(org: String,portal: String, fn: (String,String) -> String): Unit {
    val result = fn(org,portal)
    println(result)
}

fun main(args: Array<String>){
    val fn:(String,String)->String={org,portal->"$org develop $portal"}
    myFun("sssit.org","javatpoint.com",fn)
}

 ```
op:
sssit.org develop javatpoint.com

Inline Function
=====================


An inline function is declare with a keyword inline.
 The use of inline function enhances the performance of higher order function.
The inline function tells the compiler to copy parameters and functions to the call site.

 ```
fun main(args: Array<String>) {
inlineFunction({ println("calling inline functions")})
}

inline fun inlineFunction(myFun: () -> Unit ) {
myFun()
    print("code inside inline function")
}

 ```
op:
calling inline functions
code inside inline function


Destructuring Declarations
==================================
It allows you to declare multiple variables at once. This technique is called Destructuring declaration.

Following is the basic syntax of the destructuring declaration.

val (name, age) = person

 ```
fun main(args: Array<String>) {
   val s = Student("TutorialsPoint.com","Kotlin")
   val (name,subject) = s
   println("You are learning "+subject+" from "+name)
}
data class Student( val a :String,val b: String ){
   var name:String = a
   var subject:String = b
}

 ```
op:
You are learning Kotlin from TutorialsPoint.com


Kotlin Exception Handling
===============================
 ```

try {
    // some code
}
catch (e: SomeException) {
    // handler
}
finally {
    // optional finally block
}
 ```
Note: Kotlin does not support checked exception.


Note: At a time only one exception is occured and at a time only one catch block is executed.

 ```
fun main(args: Array<String>){
    try {
        val a = IntArray(5)
        a[5] = 10 / 0
    }
    catch (e: Exception) {
        println("parent exception catch")
    }
    catch (e: ArithmeticException) {
        println("arithmetic exception catch")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("array index outofbounds exception")
    }

    println("code after try catch...")
}

 ```
Output at compile time

warning : division by zero
a[5] = 10/0

Output at run time

parent exception catch
code after try catch...

Note: The finally block will not be executed if program exits
(either by calling exitProcess(Int) or any error that causes the process to abort).

Kotlin throw keyword
=====================
Kotlin throw keyword is used to throw an explicit exception. It is used to throw a custom exception.

Syntax:
throw SomeException()


Collections:

----------------------------------------------------------

Kotlin Array
-----------------
It initializes the element of array of int type with size 5 with all elements as 0 (zero).

var myArray = Array<Int>(5){0}


Kotlin array declaration - using arrayOf function
=====================================================

var myArray1 = arrayOf(1,10,4,6,15)
var myArray2 = arrayOf<Int>(1,10,4,6,15)
val myArray3 = arrayOf<String>("Ajay","Prakesh","Michel","John","Sumit")
var myArray4= arrayOf(1,10,4, "Ajay","Prakesh")

Kotlin Array Example 1:
 ```
fun main(args: Array<String>){
    var myArray = Array<Int>(5){0}

    for(element in myArray){
        println(element)
    }
}
 ```
Output:

0
0
0
0
0

Kotlin Array Example 2:

We can also able to rewrite the value of array using its index value.
Since we can able to modify the value of array, so it is called as mutable in nature. For example:

 ```
fun main(args: Array<String>){
    var myArray = Array<Int>(5){0}

    myArray[1]= 10
    myArray[3]= 15

    for(element in myArray){
        println(element)
    }
}
 ```
Output:

0
10
0
15
0

Kotlin List Interface
======================
Kotlin List is an interface and generic collection of elements.
The List interface inherits form Collection<T> class. It is immutable and its methods supports only read functionalities.

To use the List interface we need to use its function called listOf(), listOf<E>().

 ```
fun main(args: Array<String>){
    var list = listOf(1,2,3,"Ajay","Vijay","Prakash")//read only, fix-size
    for(element in list){
        println(element)
    }
    println()
    for(index in 0..list.size-1){
        println(list[index])
    }
}
 ```
op:
1
2
3
Ajay
Vijay
Prakash


Kotlin MutableList (mutableListOf())
=========================================
The methods of MutableList interface supports both read and write functionalities.
Once the elements in MutableList have declared,
 it can be added more elements in it or removed, so it has no fixed size length.
 ```

 fun main(args: Array<String>){
     var mutableList = mutableListOf("Ajay","Vijay","Prakash","Vijay")

     for(element in mutableList){
         println(element)
     }
     println()
     for(index in 0..mutableList.size-1){
         println(mutableList[index])
     }
 }
 
  ```
 Output:

 Ajay
 Vijay
 Prakash
 Vijay

 Ajay
 Vijay
 Prakash
 Vijay

 Kotlin ArrayList class
================================
Kotlin ArrayList class is used to create a dynamic array. Which means the size of ArrayList class can be increased or decreased according to requirement.
 ArrayList class provides both read and write functionalities.

Kotlin ArrayList class follows the sequence of insertion order.
 ArrayList class is non synchronized and it may contains duplicate elements. The elements of ArrayList class are accessed randomly as it works on index basis.

 ```
fun main(args: Array<String>){

    val arrayList = ArrayList<String>()//Creating an empty arraylist
    arrayList.add("Ajay")//Adding object in arraylist
    arrayList.add("Vijay")
    arrayList.add("Prakash")
    arrayList.add("Rohan")
    arrayList.add("Vijay")
    println(".......print ArrayList.......")
    for (i in arrayList) {
        println(i)
    }
}
 ```
Output:

......print ArrayList......
Ajay
Vijay
Prakash
Rohan
Vijay

Kotlin ArrayList: arrayListOf()
An arrayListOf() is a function of ArrayList class.
ArrayList is mutable which means it provides both read am write functionalities.
The arrayListOf() function returns an ArrayList type.
 ```

fun main(args: Array<String>){

    var intArrayList: ArrayList<Int> = arrayListOf<Int>(1,2,3)
    var stringArrayList: ArrayList<String> = arrayListOf<String>("Ajay","Vijay","Prakash")
    var anyArrayList: ArrayList<Any> = arrayListOf<Any>(1,2,3,"Ajay","Vijay","Prakash")
    println("print int ArrayList")
    for(element in intArrayList){
        println(element)
    }
    println()
    println("print string ArrayList")
    for(element in stringArrayList){
        println(element)
    }
        println()
    println("print any ArrayList")
    for(element in anyArrayList){
        println(element)
    }
}

 ```
Output:

print int ArrayList
1
2
3

print string ArrayList
Ajay
Vijay
Prakash

print any ArrayList
1
2
3
Ajay
Vijay
Prakash


Kotlin Map Interface
===========================

Kotlin Map is an interface and generic collection of elements. Map interface holds data in the form of key and value pair. Map key are unique and holds only one value for each key. The key and value may be of different pairs such as <Int, Int>,<Int, String>, <Char, String>etc. This interface is immutable, fixed size and its methods support read only access.

To use the Map interface we need to use its function called mapOf() or mapOf<k,v>().

 ```
fun main(args: Array<String>){

    val myMap: Map<Int, String> = mapOf<Int,String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")
    for(key in myMap.keys){
        println("Element at key $key = ${myMap.get(key)}")
    }
}
 ```
Output:

Element at key 1 = Ajay
Element at key 4 = Vijay
Element at key 3 = Prakash

Kotlin Map Interface Example 10 - mapOf().asIterable ()
 ```
fun main(args: Array<String>){

    val myMap: Map<Int,String> = mapOf<Int, String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")

    for(key in myMap.keys){
        println("Element at key $key = ${myMap.get(key)}")
    }
      println(".......myMap.asIterable().....")
      for(itr in myMap.asIterable()){
          println("key = ${itr.key} value = ${itr.value}")
      }
}
 ```
Output:

Element at key 1 = Ajay
Element at key 4 = Vijay
Element at key 3 = Prakash
.......myMap.asIterable().....
key = 1 value = Ajay
key = 4 value = Vijay
key = 3 value = Prakash
Kotlin Map Interface Example 11 - mapOf().iterator()
 ```
fun main(args: Array<String>){

    val myMap: Map<Int,String> = mapOf<Int, String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")

    for(key in myMap.keys){
        println("Element at key $key = ${myMap.get(key)}")
    }
      println("......myMap.iterator()......")
      for(itr1 in myMap.iterator()){
          println("key = ${itr1.key} value = ${itr1.value}")
      }
}
 ```
Output:

Element at key 1 = Ajay
Element at key 4 = Vijay
Element at key 3 = Prakash
......myMap.iterator()......
key = 1 value = Ajay
key = 4 value = Vijay
key = 3 value = Prakash

Kotlin HashMap class
==========================
Kotlin HashMap is class of collection based on MutableMap interface.
Kotlin HashMap class implements the MutableMap interface using Hash table.
It store the data in the form of key and value pair. It is represented as HashMap<key, value>
or HashMap<K, V>.

The implementation of HashMap class does not make guarantees about the order of data of key,
 value and entries of collections.

 Kotlin HashMap Example 1- empty HashMap
 Let's create a simple example of HashMap class define with empty HashMap of <Int, String> and add elements later. To print the value of HashMap we will either use HashMap[key] or HashMap.get(key).


 fun main(args: Array<String>){

     val hashMap:HashMap<Int,String> = HashMap<Int,String>() //define empty hashmap
     hashMap.put(1,"Ajay")
     hashMap.put(3,"Vijay")
     hashMap.put(4,"Praveen")
     hashMap.put(2,"Ajay")
     println(".....traversing hashmap.......")
     for(key in hashMap.keys){
         println("Element at key $key = ${hashMap[key]}")
     }
     }
      
 Output:

 .....traversing hashmap.......
 Element at key 1 = Ajay
 Element at key 2 = Ajay
 Element at key 3 = Vijay
 Element at key 4 = Praveen

 Kotlin HashMap: hashMapOf():
 ================================

A hashMapOf() is a function of HashMap class. It returns a new HashMap with the specified contents.
 It contains pairs of data in the form of key and value.
 HashMap is mutable collection which provides both read am write functionalities.

 ```
 fun main(args: Array<String>){

     val intMap: HashMap<Int, String> = hashMapOf<Int,String>(1 to "Ashu",4 to "Rohan", 2 to "Ajeet", 3 to "Vijay")

     val stringMap: HashMap<String,String> = hashMapOf<String,String>("name" to "Ashu")
     stringMap.put("city", "Delhi")
     stringMap.put("department", "Development")
     stringMap.put("hobby", "Playing")
     val anyMap: HashMap<Any, Any> = hashMapOf<Any, Any>(1 to "Ashu", "name" to "Rohsan", 2 to 200)
     println(".....traverse intMap........")
     for(key in intMap.keys){
         println(intMap[key])
     }
     println("......traverse stringMap.......")
     for(key in stringMap.keys){
         println(stringMap[key])
     }
     println("......traverse anyMap.......")
     for(key in anyMap.keys){
         println(anyMap[key])
     }
 }
 
  ```
 Output:

 .....traverse intMap........
 Ashu
 Ajeet
 Vijay
 Rohan
 ......traverse stringMap.......
 Ashu
 Development
 Delhi
 Playing
 ......traverse anyMap.......
 Rohsan
 Ashu
 200

Kotlin Set Interface
Kotlin Set interface is a generic unordered collection of elements.
 Set interface does not support duplicate elements.
 This interface is immutable in nature its methods supports read-only functionality of the set.

Set interface uses setOf() function to create the list of object of set interface which
contains list of elements.

 ```
fun main(args: Array<String>){
    val intSet = setOf(2,6,4,29,4,5)
    val mySet: Set<Any> = setOf(2,6,4,29,4,5,"Ashu","Ajay")
    println(".......print Int set.........")
    for(element in intSet){
        println(element)
    }
    println(".......print Any set.........")
    for(element in mySet){
        println(element)
    }

}
 ```
Output:

.......print Int set.........
2
6
4
29
5
.......print Any set.........
2
6
4
29
5
Ashu
Ajay

Kotlin MutableSet Interface
===============================
Kotlin MutableSet interface is a generic unordered collection of elements.
MutableSet interface does not support duplicate elements.
 This interface is mutable so its methods support read-write functionality supports adding and removing elements.

Set interface uses mutableSetOf() function to create the list of object of
set interface which contains list of elements.

Kotlin MutableSet Interface Example 1
Let's create an example of MutableSet declaring and traversing its elements.

 ```
fun main(args: Array<String>) {
    val intmutableSet = mutableSetOf<Int>(2, 6, 4, 29, 4, 5)
    val anymutableSet: Set<Any> = setOf(2, 6, 4, 29, 4, 5, "Ajay", "Ashu", "Ajay")
    println("....intmutableSet....")
    for(element in intmutableSet){
        println(element)
    }
    println("....anymutableSet......")
    for(element in anymutableSet){
        println(element)
    }
}
 ```
Output:

....intmutableSet....
2
6
4
29
5
....anymutableSet......
2
6
4
29
5
Ajay
Ashu

Kotlin HashSet class
Kotlin HashSet is class of collection which extends AbstractMutableSet class and
implements Set interface. The HashSet class store elements using hashing mechanism. It support both read and write functionality. It does not support duplicate value and does not make guarantees about the order sequence of element.

 ```
fun main(args: Array<String>){
    var hashSet = HashSet<Int>(6)
    hashSet.add(2)
    hashSet.add(13)
    hashSet.add(6)
    hashSet.add(5)
    hashSet.add(2)
    hashSet.add(8)
    println("......traversing hashSet......")
    for (element in hashSet){
        println(element)
    }
}
 ```
op:
 ```
......traversing hashSet......
8
2
13
5
6
 ```
