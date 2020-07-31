fun main(args: Array<String>) {
    var a : String = "a"
    //a = null => cannot set null to variable that have type

    // use ? after type to set the variable can be null
    var nullable : String? = "a"
    //nullable = null

    // Null check
    var length = 0
    if (nullable != null){
        length = nullable.length
    } else {
        length = -1
    }
    println(length)

    // Null check by Safe call operator "?"
    println(nullable?.length)

    // Null check by Elvis operator "?:"
    val len = nullable?.length ?: -1 //if nullable is null, len = -1

    // If we know 100% that the variable is not null, can use "!!" to force getting value
    println(nullable!!.length)
}