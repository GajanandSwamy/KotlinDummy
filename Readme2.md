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