fun main(args: Array<String>) {
    println("Hello world")

    // val for defining the constant
    // var for normal variable
    val greeting = "Hello"
    var name = "Patty"

    println(greeting + " " + name + " ;)")
    println("$greeting $name ;)")

    var a = 3
    var b = 5
    println(a + b)

    var aStr = a.toString()

    val doubleNumber = 123.45 // 64 bits
    val floatNumber = 123.45f // 32 bits (with f)
    val longNumber = 12345678901123445L // 64 bits (with L)

    // if we need to specify type
    var str: String = "test"
    var c: Int = 3
}