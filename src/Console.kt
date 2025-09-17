fun main() {
    val kataRahasia = "kotlin"
    val tebakan = CharArray(kataRahasia.length) { '_' }

    println("=== Game Tebak Kata ===")

    while (tebakan.contains('_')) {
        println(tebakan.joinToString(" "))
        print("Tebak huruf: ")
        val huruf = readLine()?.firstOrNull() ?: continue

        for (i in kataRahasia.indices) {
            if (kataRahasia[i] == huruf) {
                tebakan[i] = huruf
            }
        }
    }

    println("Selamat! Kata yang benar: $kataRahasia")
}
