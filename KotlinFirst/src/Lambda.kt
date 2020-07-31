fun main(args: Array<String>) {
    val printMessage = {message: String -> println(message)}
    // that equal to
//    fun printMessage(message: String){
//        println(message)
//    }
    printMessage("Hello")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(3,2))

    val sumB : (Int, Int) -> Int = {x, y -> x + y}
    println(sumB(1,2))

    // second argument is for defining function,
    // function detail will be written when call the function
    fun downloadData(url: String, completion: () -> Unit){
        completion()
        println(url)
    }
    downloadData("test.com", {println("What?")})
    downloadData("test.com") {println("What?")}

    fun downloadCatData(url: String, completion:(Cat) -> Unit){
        val cat = Cat("M", "Patty", "Orange")
        completion(cat)
    }
    downloadCatData("test.com"){cat ->
        println("${cat.name} is ${cat.color}")
    }

}