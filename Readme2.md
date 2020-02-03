Om Namah Shivaya-Hare Krishna
==============================

# Features of Kotlin

Concise: Kotlin reduces writing the extra codes. This makes Kotlin more concise.

Null safety:  Kotlin is null safety language. Kotlin aimed to eliminate the NullPointerException (null reference) from the code.Interoperable.

Interoperable: Kotlin easily calls the Java code in a natural way as well as Kotlin code can be used by Java.

Smart cast: It explicitly typecasts the immutable values and inserts the value in its safe cast automatically.

Compilation Time: It has better performance and fast compilation time.

Tool-friendly: Kotlin programs are build using the command line as well as any of Java IDE.

Extension function: Kotlin supports extension functions and extension properties which means it helps to extend the functionality of classes without touching their code.

 ```
 fun main(args: Array<String>) {  
     println("Hello World!")  
 }  
  ```
  
# Kotlin First Program Concept

The main () function takes an array of string (Array<String>) as a parameter and returns Unit. 
Unit is used to indicate the function and does not return any value (void as in Java).
 Declaring Unit is an optional, we do not declare it explicitly.
 
 Note: Semicolons are optional in Kotlin.

# Difference between var and val

var (Mutable variable): We can change the value of variable declared using var keyword later in the program.
val (Immutable variable): We cannot change the value of variable which is declared using val keyword.

# Types of String

1. Escaped String: Escape String is declared within double quote (" ") and may 
contain escape characters like '\n', '\t', '\b' etc.

 ```
val text1 ="Hello, JavaTpoint"  
//or  
val text2 ="Hello, JavaTpoint\n"  
//or  
val text3 ="Hello, \nJavaTpoint"  
 ```

2. Raw String: Row String is declared within triple quote (""" """).
 It provides facility to declare String in new lines and contain multiple lines.
 Row String cannot contain any escape character.
 
  ```
  val text1 ="""  
               Welcome   
                   To  
             JavaTpoint  
      """  
      
  ```

# Kotlin if-else Expression
     As if is an expression it is not used as standalone,
     it is used with if-else expression and the result of an if-else expression is assign into a variable.

     Syntax of if-else expression

      ```
     val returnValue = if (condation) {
          //code statement
         } else {
          // code statement
         }
         println(returnValue)

     ```

Multiple Statement of when Using Braces

```
fun main(args: Array<String>){
    var number = 1
    when(number) {
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")
    }
}
```

# Using when in the range

```
fun main(args: Array<String>){
    var number = 7
    when(number) {
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    }
}
```


# Kotlin Labeled break Expression

```
fun main(args: Array<String>) {
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2)
                break@loop
        }
    }
}


op:
i = 1 and j = 1
i = 1 and j = 2
i = 1 and j = 3
i = 2 and j = 1

```
Default argument : passing all argument in function call

```
fun main(args: Array<String>) {
    run(3,'a')
}
fun run(num:Int= 5, latter: Char ='x'){
    print("parameter in function definition $num and $latter")
}
```

op:
parameter in function definition 3 and a


Constructor of array:

Array constructor is declared with specified size and init function.
The init function is used to returns the elements of array with their index.

Array(size: Int, init: (Int) -> T)


Kotlin Array Example 1:

```
fun main(args: Array<String>){
var myArray = Array<Int>(5){0}

    for(element in myArray){
println(element)
    }
}
```

op:

0
0
0
0
0

Note: Kotlin does not support checked exception.

Note: The finally block will not be executed if program exits
 (either by calling exitProcess(Int) or any error that causes the process to abort).

Note: At a time only one exception is occured and at a time only one catch block is executed.

Rule: All catch blocks must be placed from most specific to general
i.e. catch for ArithmeticException must come before catch for Exception.

# Kotlin Null Safety

NullPointerException can only possible on following causes:

An forcefully call to throw NullPointerException();

An uninitialized of this operator which is available in a constructor passed and used somewhere.

Use of external java code as Kotlin is Java interoperability.


Nullable Types
Nullable types are declared by putting a ? behind the String as:

```
var str1: String? = "hello"
str1 = null // ok
```

Non Nullable Types
Non nullable types are normal strings which are declared as String types as:


val str: String = null // compile error
str = "hello" // compile error Val cannot be reassign
var str2: String = "hello"
str2 = null // compile error


Unsafe cast operator: as
===============================

A nullable string (String?) cannot be cast to non nullabe string (String), this throw an exception.

```
fun main(args: Array<String>){
val obj: Any? = null
val str: String = obj as String
println(str)
 }

 Exception in thread "main" kotlin.TypeCastException: null cannot be cast to non-null type kotlin.String
  at TestKt.main(Test.kt:3)

```

Kotlin Safe cast operator: as?

Kotlin provides a safe cast operator as? for safely cast to a type.
It returns a null if casting is not possible rather than throwing an ClassCastException exception.

```
fun main(args: Array<String>){

val location: Any = "Kotlin"
val safeString: String? = location as? String
val safeInt: Int? = location as? Int
println(safeString)
println(safeInt)
}

```

Kotlin Elvis Operator example

Elvis operator returns expression left to ?: i.e -1. (str?. length)
if it is not null otherwise it returns expression right to (?:)i.e(-1).
The expression right side of Elvis operator evaluated only if the left side returns null.

```
fun main(args: Array<String>){

var str: String? = null
var str2: String? = "May be declare nullable string"
var len1:  Int = str ?.length ?: -1
var len2:  Int = str2 ?.length ?:  -1

println("Length of str is ${len1}")
println("Length of str2 is ${len2}")
}

```

op:
Length of str is -1
Length of str2 is 30

# Kotlin Reflection

Reflection is a set of language and library features that examines the structure of program at runtime

Class Reference
Class reference is used to obtain the reference of KClass object.
To obtain the reference of statically Kclass, we should use the class literal(i.e. use double colons).

Syntax of class reference:

```
val c1 = String::class
val c2 = MyClass::class
```

Note: KClass represents a class and provides examination capabilities.
To obtain the instance of this class use syntax ::class.

# Functional Reference:

Kotlin functional is used to obtain the reference of function using double colons.
The reference of function can be used in another
function as a parameter. To use this reference in another function we use the :: operator:

```
fun main(args: Array<String>) {
    fun isPositive(x: Int) = x > 0
val numbers = listOf(-10, -5, 0, 5, 10)
println(numbers.filter(::isPositive))
}
```

op:
[5,10]

# Property Reference

We can also access the properties as first-class object in Kotlin,
to access object property we can use :: operator:

```
fun main(args: Array<String>) {
println(::x.get())
println(::x.name)
println(::y.set(10))
}
val x = 5
var y = 5
```

op:
5
x
10

Kotlin Nested class
=====================================
 Nested class is by default static, so its data member and member function can be
 accessed without creating an object of class.
 Nested class cannot be able to access the data member of outer class.

```
 class outerClass{
     private var name: String = "Ashu"
     class nestedClass{
 var description: String = "code inside nested class"
         private var id: Int = 101
         fun foo(){
           //  print("name is ${name}") // cannot access the outer class member
 println("Id is ${id}")
         }
     }
 }
 fun main(args: Array<String>){
 // nested class must be initialize
 println(outerClass.nestedClass().description) // accessing property
 var obj = outerClass.nestedClass() // object creation
     obj.foo() // access member function
 }
```

Kotlin Inner class
======================
The advantage of inner class over nested class is that, it is able to access members of
outer class even it is private. Inner class keeps a reference to an object of outer class.

```
class outerClass{
     private  var name: String = "Ashu"
     inner class  innerClass{
var description: String = "code inside inner class"
        private var id: Int = 101
       fun foo(){
println("name is ${name}") // access the outer class member even private
println("Id is ${id}")
        }
    }
}
fun main(args: Array<String>){
println(outerClass().innerClass().description) // accessing property
var obj = outerClass().innerClass() // object creation
    obj.foo() // access member function

}
```

Primary constructor with initializer block
===================
The primary constructor does not contain any code. Initializer blocks are used to initialization of code. This block is prefixed with init keyword. At the period of instance initialization,
 the initialized blocks are executed in the same order as they appear in class body.

```
 class myClass(name: String, id: Int) {
 val e_name: String
 var e_id: Int
 init{
 e_name = name.capitalize()
 e_id = id

 println("Name = ${e_name}")
 println("Id = ${e_id}")
     }
 }
 fun main(args: Array<String>){
 val myclass = myClass ("Ashu", 101)

 }
 ```

 By using primary as well secondary constructor in same class, secondary constructor needs to authorize to primary constructor.
 Authorization to another constructor in same class is done using this() keyword.

  ```
 class myClass(password: String){

     constructor(name: String, id: Int, password: String): this(password){
 println("Name = ${name}")
 println("Id = ${id}")
 println("Password = ${password}")
     }
 }
 fun main(args: Array<String>){
 val myclass = myClass ("Ashu", 101, "mypassword")

 }
  ```

  In Kotlin, one secondary constructor can call another
   secondary constructor of same class. This is done by using this() keyword.

  ```
   class myClass{

       constructor(name: String, id: Int): this(name,id, "mypassword"){
   println("this executes next")
   println("Name = ${name}")
   println("Id = ${id}")
       }

       constructor(name: String, id: Int,pass: String){
   println("this executes first")
   println("Name = ${name}")
   println("Id = ${id}")
   println("Password = ${pass}")
       }
   }
   fun main(args: Array<String>){
   val myclass = myClass ("Ashu", 101)

   }

   ```

 n Kotlin, one derived class secondary constructor can call the base class secondary constructor.
 This is done using super keyword, this is the concept of inheritance.

 ```

 open class Parent{

     constructor(name: String, id: Int){
 println("this executes first")
 println("Name = ${name}")
 println("Id = ${id}")
     }

     constructor(name: String, id: Int,pass: String){
 println("this executes third")
 println("Name = ${name}")
 println("Id = ${id}")
 println("Password = ${pass}")
     }
 }
 class Child: Parent{
     constructor(name: String, id: Int): super(name,id){
 println("this executes second")
 println("Name = ${name}")
 println("Id = ${id}")
     }

    constructor(name: String, id: Int,pass: String):super(name,id,"password"){
 println("this executes forth")
 println("Name = ${name}")
 println("Id = ${id}")
 println("Password = ${pass}")
     }
 }
 fun main(args: Array<String>){
 val obj1 = Child("Ashu", 101)
 val obj2 = Child("Ashu", 101,"mypassword")
 }

 ```

 Kotlin Visibility Modifier
----------------------------------

* A public modifier is accessible from everywhere in the project. It is a default modifier in Kotlin.
  If any class, interface etc. are not specified with any access modifier then that class, interface etc.
  are used in public scope.

* A protected modifier with class or interface allows visibility to its class or subclass only.
  A protected declaration (when overridden) in its subclass is also protected modifier unless
  it is explicitly changed.

* The internal modifiers are newly added in Kotlin, it is not available in Java.
  Declaring anything makes that field marked as internal field.The internal modifier makes the field visible only
  inside the module in which it is implemented.


 ```
internal class Example{
    internal val x = 5
    internal fun getValue(){

    }
}
internal val y = 10
 ```


* A private modifier allows the declaration to be accessible only within the block in which properties,
  fields, etc. are declare. The private modifier declaration does not allow to access the outside the scope.
  A private package can be accessible within that specific file.


  Kotlin Inheritance
  ======================

  As Kotlin classes are final by default, they cannot be inherited simply.
  We use the open keyword before the class to inherit a class and make it to non-final


  When a base and derived class both contains different numbers of parameters
  in their primary constructor then base class parameters are initialized form derived class object.

  ```
  open class Employee(name: String,salary: Float) {
  init {
  println("Name is $name.")
  println("Salary is $salary")
      }
  }
  class Programmer(name: String, dept: String, salary: Float):Employee(name,salary){
  init {
  println("Name $name of department $dept with salary $salary.")
      }
      fun doProgram() {
  println("Programming is my passion.")

      }
  }
  class Salesman(name: String, dept: String, salary: Float):Employee(name,salary){
  init {
  println("Name $name of department $dept with salary $salary.")
      }
      fun fieldWork() {
  println("Travelling is my hobby.")

      }
  }
  fun main(args: Array<String>){
  val obj1 = Programmer("Ashu", "Development", 40000f)
      obj1.doProgram()
  println()
  val obj2 = Salesman("Ajay", "Marketing", 30000f)
      obj2.fieldWork()
  }

  ```
   op:

  ```
  Name is Ashu.
  Salary is 40000.0
  Name Ashu of department Development with salary 40000.0.
  Programming is my passion.

  Name is Ajay.
  Salary is 30000.0
  Name Ajay of department Marketing with salary 30000.0.
  Travelling is my hobby.

  ```

  If derived class does not contain any primary constructor
  then it is required to call the base class secondary constructor
  from derived class using super keyword.

  ```
  open class Patent {

      constructor(name: String, id: Int) {
  println("execute super constructor $name: $id")
      }
  }

  class Child: Patent {

      constructor(name: String, id: Int, dept: String): super(name, id) {
          print("execute child class constructor with property $name, $id, $dept")
      }
  }
  fun main(args: Array<String>) {
  val child = Child("Ashu",101, "Developer")
  }

  ```

  Kotlin Method Overriding
  ==============================

  KotlinRules of method overriding

  1.Parent class and its method or property which is to be overridden must be open (non-final).
  2.Method name of base class and derived class must have same.
  3.Method must have same parameter as in base class.

  Derived class can also call its superclass methods and property using super keyword.

  ```
  open class Bird {
      open var color = "Black"
      open fun fly() {
  println("Bird is flying...")
      }
  }
  class Parrot: Bird() {
      override var color = "Green"
      override fun fly() {
          super.fly()
  println("Parrot is flying...")

      }
  }

  fun main(args: Array<String>) {
  val p = Parrot()
      p.fly()
  println(p.color)

  }

  ```

  op:

  ```

  Bird is flying...
  Parrot is flying...
  Green

  ```

  Kotlin multiple class implementation
--------------------------------------------

In Kotlin, derived class uses a supertype name in angle brackets,
e.gsuper<Base> when it implements same function name provided in multiple classes.

For example, a derived class Parrotextends its superclass Bird and implement Duck interface containing same function fly(). To call particular method of each class and interface we must be mention
supertype name in angle brackets as super<Bird>.fly() and super<Duck>.fly() for each method.

```
open class Bird {
    open var color = "Black"
    open fun fly() {
println("Bird is flying...")
    }
}
interface Duck {
     fun fly() {
println("Duck is flying...")
    }
}
class Parrot: Bird(),Duck {
    override var color = "Green"
    override fun fly() {
        super<Bird>.fly()
        super<Duck>.fly()
println("Parrot is flying...")

    }
}
fun main(args: Array<String>) {
val p = Parrot()
    p.fly()
println(p.color)

}
```

Kotlin Abstract class
=============================

A class which is declared with abstract keyword is known as abstract class.
An abstract class cannot be instantiated. Means, we cannot create object of abstract class.
The method and properties of abstract class are non-abstract unless
they are explicitly declared as abstract.

```

abstract class Car{
    abstract fun run()
}
class Honda: Car(){
   override fun run(){
println("Honda is running safely..")
   }
}
fun main(args: Array<String>){
val obj = Honda()
obj.run();
}

```

Note:
A non-abstract open member function can be over ridden in an abstract class.

```
open class Car {
    open fun run() {
println("Car is running..")
    }
}
abstract class Honda : Car() {
    override abstract fun run()
}
class City: Honda(){
    override fun run() {
      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
println("Honda City is running..")
    }
}
fun main(args: Array<String>){
val car = Car()
car.run()
val city = City()
city.run()
}
```

op:

```

Car is running..
Honda City is running..

```

Kotlin Interface
==================

```

interface MyInterface {

val id: Int // abstract property
    fun absMethod()// abstract method
    fun doSomthing() {
      // optional body
    }
}

```

The methods which are only declared without their method body are abstract by default.

Following are the reasons to use interface:

Using interface supports functionality of multiple inheritance.
It can be used achieve to loose coupling.
It is used to achieve abstraction.

Resolving different Interfaces having same method overriding conflicts
=========================================================================

```
interface MyInterface1 {
    fun doSomthing() {
println("MyInterface 1 doing some work")
    }
        fun absMethod()
}
interface MyInterface2 {
    fun doSomthing(){
println("MyInterface 2 doing some work")
    }
    fun absMethod(name: String)
}
class MyClass : MyInterface1, MyInterface2 {
    override fun doSomthing() {
        super<MyInterface2>.doSomthing()
    }

    override fun absMethod() {
println("Implements absMethod() of MyInterface1")
    }
    override fun absMethod(n: String) {
println("Implements absMethod(name) of MyInterface2 name is  $n")
    }
}
fun main(args: Array<String>) {
val myClass = MyClass()
myClass.doSomthing()
myClass.absMethod()
myClass.absMethod("Ashu")
}

```

op:

```

MyInterface 2 doing some work
Implements absMethod() of MyInterface1
Implements absMethod(name) of MyInterface2 name is  Ashu

```

Kotlin Data class
===================

Data class is a simple class which is used to hold data/state and contains standard functionality.
A data keyword is used to declare a class as a data class.

Data class internally contains the following functions:

equals(): Boolean
hashCode(): Int
toString(): String
component() functions corresponding to the properties
copy()
Due to presence of above functions internally in data class, the data class eliminates the boilerplate code.


Requirements of data class
In order to create a data class, we need to fulfill the following requirements:

Contain primary constructor with at least one parameter.
Parameters of primary constructor marked as val or var.
Data class cannot be abstract, inner, open or sealed.
Before 1.1,data class may only implements interface. After that data classes may extend other classes.


Kotlin data class copy() method
---------------------------------
The data class provides a copy() method which is used to create a copy (or colon) of object.
 Using copy() method, some or all properties of object can be altered.


```
 data class Product(var item: String, var price: Int)
 fun main(agrs: Array<String>) {
 val p1 = Product("laptop", 25000)
 println("p1 object contain data : $p1")
 val p2 = p1.copy()
 println("p2 copied object contains default data of p1: $p2")
 val p3 = p1.copy(price = 20000)
 println("p3 contain altered data of p1 : $p3")
 }
```


output:

```
p1 object contain data : Product(item=laptop, price=25000)
p2 copied object contains default data of p1: Product(item=laptop, price=25000)
p3 contain altered data of p1 : Product(item=laptop, price=20000)
```

Default and named arguments in data class
==========================================

We can also assign the default arguments in primary constructor of data class.
These default values can be changed later on program if required.

```
data class Product(var item: String = "laptop", var price: Int = 25000)
fun main(agrs: Array<String>) {
val p1 = Product(price = 20000)
println(p1)
}
```

op:


```
Product(item=laptop, price=20000)

```


Kotlin Sealed Class
=======================
* It is used to represent restricted class hierarchy.
* The constructors of sealed classes are private in default and cannot be allowed as non-private.
* The subclasses of sealed classes must be declared in the same file in which sealed class itself.

```
sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()
 object NotAShape : Shape()
}
```


A sealed class is implicitly an abstract class which cannot be instantiated.

```
sealed class MyClass
fun main(args: Array<String>)
{
var myClass = MyClass() //compiler error. sealed types cannot be instantiated.
}
```

Sealed classes are commonly used with when expression. As the sub classes of sealed classes have their own types act as a case.
Due to this, when expression in sealed class covers all the cases and avoid to add else clause.

```
sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()
  //  object NotAShape : Shape()
}

fun eval(e: Shape) =
        when (e) {
            is Shape.Circle ->println("Circle area is ${3.14*e.radius*e.radius}")
            is Shape.Square ->println("Square area is ${e.length*e.length}")
            is Shape.Rectangle ->println("Rectagle area is ${e.length*e.breadth}")
            //else -> "else case is not require as all case is covered above"
          //  Shape.NotAShape ->Double.NaN
        }
fun main(args: Array<String>) {

var circle = Shape.Circle(5.0f)
var square = Shape.Square(5)
var rectangle = Shape.Rectangle(4,5)

eval(circle)
eval(square)
eval(rectangle)
}
```

op:

```
Circle area is 78.5
Square area is 25
Rectagle area is 20
```

Kotlin Extension Function
===========================
Kotlin extension function provides a facility to "add" methods to class without inheriting a class or
using any type of design pattern. The created extension functions are used as a
regular function inside that class.

```
class Student{
    fun isPassed(mark: Int): Boolean{
        return mark>40
    }
}
fun Student.isExcellent(mark: Int): Boolean{
    return mark > 90
}
fun main(args: Array<String>){
val student = Student()
val passingStatus = student.isPassed(55)
println("student passing status is $passingStatus")

val excellentStatus = student.isExcellent(95)
println("student excellent status is $excellentStatus")
}
```

op:

```
student passing status is true
student excellent status is true
```


Companion Object Extensions
===========================


A companion object is an object which is declared inside a class and marked with the companion keyword. Companion object
is used to call the member function of class directly using the class name (like static in java).

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

Companion object extensions example
====================================

```
class MyClass {
    companion object {
        fun create(): String {
            return "calling create method of companion object"
        }
    }
}
fun MyClass.Companion.helloWorld() {
println("executing extension of companion object")
}
fun main(args: Array<String>) {
MyClass.helloWorld() //extension function declared upon the companion object
}
```

Kotlin Generics
===================

Advantage of Generics
Following are the key advantages of using generics:

Type-safety: Generic allows to hold only single type of object. Generic does not allow to store other object.
Type casting is not required: There is no need to typecast the object.
Compile time checking: Generics code is checked at compile time so that it can avoid any problems at runtime.

Kotlin generic example
========================

```
fun main(args: Array<String>){
val stringList: ArrayList<String> = arrayListOf<String>("Ashu","Ajay")
val s: String = stringList[0]
println("printing the string value of stringList: $s")
printValue(stringList)
val floatList: ArrayList<Float> = arrayListOf<Float>(10.5f,5.0f,25.5f)
printValue(floatList)
}
fun <T>printValue(list: ArrayList<T>){
    for(element in list){
println(element)
    }
}
```



op:

```
printing the string value of stringList: Ashu
Ashu
Ajay
10.5
5.0
25.5
```

Kotlin generic extension function example
=========================================

```
fun main(args: Array<String>){
val stringList: ArrayList<String> = arrayListOf<String>("Ashu","Ajay")
stringList.printValue()
val floatList: ArrayList<Float> = arrayListOf<Float>(10.5f,5.0f,25.5f)
floatList.printValue()
}
fun <T>ArrayList<T>.printValue(){
    for(element in this){
println(element)
    }
}
```

op:

```
Ashu
Ajay
10.5
5.0
25.5
```

Kotlin Ranges
================
Kotlin range is defined as an interval from start value to the end value. Range expressions
are created with operator (. .) which is complemented by in and !in. The value which is equal or
greater than start value and smaller or equal to end value comes inside the defined range.

Integral Type Ranges
====================

```
fun main(args: Array<String>) {

   for (a in 1..5){
        print(a )
    }
println()
for(x in 'a'..'f'){
        print(x )
    }
println()
val range = 1.0..5.0
println(range)
println("3.14 in range is ${3.14 in range}")
}
```

op:

```
12345
abcdef
1.0..5.0
3.14 in range is true
```

To iterate the element in decreasing order, use the standard library downTo() function or downTo keyword.

```
for (a in 5 downTo 1){
        print(a )// 54321
    }
```

The until() function or until keyword in range is used to exclude the last element. It iterates range from start to 1 less than end.

```
for (a in 1 until 5){
        print(a ) // print 1234

   }
```

The above range excludes 5 and iterate from 1 to 4.

Kotlin range of integer
Let's see an example of integer range using downTo(), downTo, and rangeTo() methods.

```
    fun main(args: Array<String>) {
        for (x in 1..5)
            print(x)
println()
        for (x in 5 downTo 1)
            print(x)
println()
        for (x in 1.rangeTo(5))
            print(x)
println()
        for (x in 5.downTo(1))
            print(x)
println()
    }
```
op:

```
12345
54321
12345
54321
```

Kotlin range of characters
Example of Kotlin ranges using char data types.

```
fun main(args: Array<String>) {
 (x in 'a'..'e')
        print("$x ")
ntln()
    for (x in 'e' downTo 'a')
        print("$x ")
}
```

op:

```
a bcde
edcba
```


Kotlin range step
Kotlin step keyword in range is used to iterate the range in the interval of given step value (int value).

```
fun main(args: Array<String>) {
        for (x in 1..10 step 2)
            print("$x ")
println()
        for (x in 10 downTo 1 step 3)
            print("$x ")
    }
```

op:

```
1 3 5 7 9
10 7 4 1
```

Kotlin range iterator
=========================

An iterator() method is also be used to iterate the range value.
It uses hasNext() method which checks the next element
in the range and next() method returns the next element of the range.

```
fun main(args: Array<String>) {

val chars = ('a'..'e')
val it = chars.iterator()
    while (it.hasNext()) {
val x = it.next()
        print("$x ")
    }
}
```
op:

a b c d e


Kotlin step()
The step() function ( or step operator) is used to return the range value in interval of given step value.
A step value always takes a positive parameter.The negative step value generates
the IllegalArgumentException exception.

```
fun main(args: Array<String>) {
val range: IntRange = 1..10
println("Print range value with step 2:")
    for(x in range step (2)){
        print("$x ")
    }
println("")
println("Print range value with step 3:")
    for(x in range step 3){
        print("$x ")
    }
val first=((range step 2).first)
val last=((range step 2).last)
println("")
println("First value of interval: $first")
println("Last value of interval: $last ")
}
```


op:

```
Print range value with step 2:
1 3 5 7 9
Print range value with step 3:
1 4 7 10
First value of interval: 1
Last value of interval: 9
```

