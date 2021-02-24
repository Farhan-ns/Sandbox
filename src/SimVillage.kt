fun main(args: Array<String>) {
    runSimulation("Hans") { playerName, buildings ->
        val currentYear = 2020
        println("Adding $buildings  houses")
        "Welcome to SimVillage, Mayor $playerName! (Copyright $currentYear)"
    }
}

inline fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String ) {
    val numOfBuilding = (1..3).shuffled().last()
    println(greetingFunction(playerName, numOfBuilding))
}