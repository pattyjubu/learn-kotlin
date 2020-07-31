fun main(args: Array<String>) {
    val animals = arrayListOf("bear", "tiger", "snake")
    val animalsColor = hashMapOf("bear" to "brown", "tiger" to "yellow", "snake" to "gray")

    // For loop
    for (animal in animals){
        println("$animal")
    }

    for ((animal, color) in animalsColor){
        println("$animal is $color")
    }

    // While loop
    var x = 10
    while (x > 0){
        println(x)
        x--
    }
}