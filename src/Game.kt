import kotlin.random.Random

fun main() {
    val pilihan = listOf("Batu", "Gunting", "Kertas")
    println("GAME BATU GUNTING KERTAS")

    while (true){
        print("Masukan Pilihan Kamu: (Batu/Gunting/Kertas) Hasil: ")

        val userInput = readLine()?.capitalize()

        if (userInput == "Keluar") {
            println("Terima Kasih sudah bermain")
            break
        }
        if (userInput !in pilihan) {
            println("pilihan tidak valid")
            return
        }



        val komputer = pilihan.random()

        println("kamu: $userInput")
        println("komputer: $komputer")

        val hasil = when {
            userInput == komputer -> "Seri"
            userInput == "Batu" && komputer == "Gunting" -> "Menang"
            userInput == "Gunting" && komputer == "Kertas" -> "Menang"
            userInput == "Kertas" && komputer == "Batu" -> "Menang"
            else -> "Kamu Kalah"
        }
        println("Hasil: $hasil")
    }
    }
