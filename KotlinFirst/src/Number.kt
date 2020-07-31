fun main(args: Array<String>) {
    val a = 11
    val b = 5
    println(a / b) // no precision
    println(a.toDouble() / b.toDouble())

    val x = 11.0
    val y = 5.0
    println(x / y)

}