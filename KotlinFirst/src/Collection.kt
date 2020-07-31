fun main(args: Array<String>) {
    // listOf: read-only list, cannot be changed
    val pet = listOf("cat", "dog", "mouse")
    println(pet.sorted())
    println(pet[1])
    println(pet.last())
    println("My home has cat: ${pet.contains("cat")}")

    // arrayListOf: can be changed list
    val animals = arrayListOf("bear", "tiger", "snake")
    println(animals.size)
    animals.add("lion")
    println(animals)
    animals.add(0, "fox")
    println(animals)
    println(animals.indexOf("fox"))
    animals.remove("bear")
    println(animals)

    // mapOf: read-only map, cannot be changed
    val animalsLeg = mapOf("bear" to 4, "tiger" to 4, "snake" to 0)
    println(animalsLeg["bear"])
    println(animalsLeg.get("bear"))
    println(animalsLeg.getOrDefault("bird", "No this animal"))

    // hashMapOf: can be changed map
    val animalsColor = hashMapOf("bear" to "brown", "tiger" to "yellow", "snake" to "gray")
    animalsColor["snake"] = "brown"
    animalsColor.put("bird", "blue")
    animalsColor["lion"] = "brown"
    println(animalsColor)
    animalsColor.remove("bear")
    println(animalsColor)
    animalsColor.clear()
    println(animalsColor)
    print(animalsColor.isEmpty())
}