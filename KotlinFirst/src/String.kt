fun main(args: Array<String>) {
    // escape character
    println("I said \"Hello\"\nYou said nothings")

    // Long string
    val longString = """Long
        |Long
        |Long...
    """.trimMargin()
    println(longString)

    // compare string
    val testStr = "Test"
    val compareResult = testStr.contentEquals("Test")
    println(compareResult)

    val containResult = testStr.contains("te", true)
    println(containResult)

    // convert
    val upper = testStr.toUpperCase()
    val lower = testStr.toLowerCase()
    println(upper)
    println(lower)

    // subsequence
    val sub = testStr.subSequence(1,3)
    println(sub)

    // string template
    val greeting = "Hello"
    val name = "Patty"
    val num = 55
    println(greeting + " " + name + " " + num)
    println("$greeting $name $num") // much easier
    println("$greeting ${name.toUpperCase()}") // {} for operation with the variable
}