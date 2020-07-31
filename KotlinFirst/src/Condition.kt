fun main(args: Array<String>) {
    //== != < > <= >=
    val a =5
    if(a >= 0 || a <= 10) {
        println("0-10")
    } else if (a > 10 || a <= 20) {
        println("11 - 20")
    } else {
        println("<20")
    }

    //switch case
    val x = 5
    when (x) {
        1 -> println("1")
        2 -> println("2")
        else -> println("other")
    }
}