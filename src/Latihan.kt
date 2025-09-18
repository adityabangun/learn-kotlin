// 1. Mencetak pesan ini di empat baris terpisah
fun main() {
    println("Use the val keyword when the value doesn't change. ")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it. ")
    println("When you call a function, you pass arguments for the parameters.\n")

// 2. Memperbaiki error kompilasi
//  println("New chat message from a friend'} --- Kotlin: Syntax error: Expecting '"'
    println("New chat message from a friend")

// 3. Template string
//    val discountPercentage: Int = 0
//    val offer: String = ""
//    val item = "Google Chromecast"
//    discountPercentage = 20
//    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
//
//    println(offer)

    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)

// 4. Penyambungan string
    val numberOfAdults = 20 //"20" ubah ke Int hapus tanda ""
    val numberOfKids = 30   //"30" ubah ke Int hapus tanda ""
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

// 5. Pemformatan pesan
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")


// 6. Mengimplementasikan operasi matematika dasar
    val firstNumber = 10
    val secondNumber = 5
    var result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")

    val firstNumber1 = 10
    val secondNumber2 = 5
    val thirdNumber = 8

    val result1 = add(firstNumber1, secondNumber2)
    val anotherResult = add(firstNumber1, thirdNumber)
    val resultSubtact = subtract(firstNumber1, secondNumber2)

    println("$firstNumber1 + $secondNumber2 = $result1")
    println("$firstNumber1 + $thirdNumber = $anotherResult")
    println("$firstNumber1 - $secondNumber2 = $resultSubtact")


    println("What yours name?")
    val name = readln()
    println("My name is $name")
}

    fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}