fun main(args: Array<String>) {
    val greetingFunction: (String) -> String = {
        val currentYear = 2020
        "Welcome to SimVillage, Mayor $it! (Copyright $currentYear)"
    }

    println(greetingFunction("Hans"))
}