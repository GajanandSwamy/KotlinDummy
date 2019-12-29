interface Base {
    fun printMe() //abstract method
}
class BaseImpl(var x: Int) : Base {
    override fun printMe() { println(x) }   //implementation of the method
}
class Derived(b: Base) : Base by b  // delegating the public method on the object b

val aa:String by lazy {
    "Hi"
}

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).printMe() // prints 10 :: accessing the printMe() method
    println(aa)
}