fun main(args: Array<String>) {
    fun calculateSum(a: Int, b: Int = 0): Int{
        return a + b
    }

    val sum = calculateSum(1,2)
    val notSum = calculateSum(1)

    println(sum)
    println(notSum)
    println("Result is ${calculateSum(2,3)}")
}