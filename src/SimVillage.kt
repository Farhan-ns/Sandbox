fun main(args: Array<String>) {
    val greetingFunction = { playerName: String, numOfBuildings: Int ->
        val currentYear = 2020
        println("Adding $numOfBuildings  houses")
        "Welcome to SimVillage, Mayor $playerName! (Copyright $currentYear)"
    }

    println(greetingFunction("Hans", 2))
}