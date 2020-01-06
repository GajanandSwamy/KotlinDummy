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
     As if is an expression it is not used as standalone, it is used with if-else expression and the result of an if-else expression is assign into a variable.

     Syntax of if-else expression

      ```
     val returnValue = if (condation) {
          //code statement
         } else {
          // code statement
         }
         println(returnValue)

     ```

    ll