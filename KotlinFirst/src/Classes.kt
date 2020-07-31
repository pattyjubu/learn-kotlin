open class Pet(val name: String, val owner: String){
    open fun movement(){
        println("$name run!!")
    }

    fun getOwner(){
        println("$name is $owner's pet")
    }
}

class Cat(name: String, owner: String, var color: String) : Pet(name, owner){
    fun say(){
        println("$name say Meow")
    }

    override fun movement(){
        println("$name walk~")
        super.movement()
    }
}

fun main(args: Array<String>) {
    val catA = Cat("A", "Patty", "White")
    catA.getOwner()
    catA.movement()
    catA.say()
    println(catA.color)
}