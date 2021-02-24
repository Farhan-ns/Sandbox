fun main(args: Array<String>) {
    val greetingFunction = { playerName: String, numOfBuildings: Int ->
        val currentYear = 2020
        println("Adding $numOfBuildings  houses")
        "Welcome to SimVillage, Mayor $playerName! (Copyright $currentYear)"
    }

    runSimulation("Hans", greetingFunction)
}

fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String ) {
    val numOfBuilding = (1..3).shuffled().last()
    println(greetingFunction(playerName, numOfBuilding))
}