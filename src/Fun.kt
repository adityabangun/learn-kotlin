fun main() {
    val greeting = birthdayGreeting("Rover", 5)
    println(birthdayGreeting(age = 5))
    println(birthdayGreeting(age = 2))

    val hello = sayhello("Aditya", 20)
    println(hello)

    val luas = hitungluas(10, 15)
    println(luas)
}

fun birthdayGreeting(name: String = "Rover", age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun sayhello(name: String, age: Int): String {
    val greet = "Hello, $name"
    val info = "You are $age year old"
    return "$greet\n$info"
}

fun hitungluas(panjang: Int, lebar: Int): Int {
    val luas = panjang * lebar
    return luas
}