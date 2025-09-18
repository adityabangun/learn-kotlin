fun main() {
    val list = listOf("1", "2", "3")
    val buah = listOf<String>("Apel", "Cherry", "Durian")
    val negara = listOf<String>("Indonesia", "Argentina", "Australia", "Belanda", "Belgia", "Columbia")


    val name = mutableListOf("Anadle", "Benford", "Chrost", "Dikacg", "Efanl")  // mutableListOf
    name.add("Fgans")   // .add
    println(name)

    name.remove("Dikacg") // .remove
    println(name)

    println(list)
    println("I have ${list[0]} dollar")
    println("I need ${list[2]} for my photo")    // [0]
    println("I want a ${buah.first()} please")   // .first()
    println("I buy 20 ${buah.last()} in market") // .last()
    println("Yesterday i go to ${negara.last()} with my family")
    println("I have ${negara.count()} tickets for my traveling in next mount")  // .count()
    println("Indonesia" in negara)
    println("Brazl" in negara)    // in


    val day = setOf("Monday", "Sunday", "Tuesday", "Wednesday", "Thursday", "Friday", "Friday", "Saturday")
    println(day)  // setOf

    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    val jus = mapOf("apel" to 1, "kiwi" to 2, "jeruk" to 3) // mapOf
    println(jus)

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "HTTP"
    val isSupported = requested.uppercase() in SUPPORTED
        println("Support for $requested: $isSupported")

    val a = setOf("abc", "bcd", "efg")
    val b = "hij"
    val c = b.uppercase() in a
        println("Number $b: $c")
}