import kotlin.random.Random

fun main() {
    val target = Random.nextInt(1, 51) // angka acak 1 - 50
    var tebakan: Int?
    var attempts = 0
    val maxAttempts = 5

    println("Tebak angka antara 1 sampai 50!")
    println("Kamu punya $maxAttempts kesempatan.")

    while (attempts < maxAttempts) {
        print("Masukkan tebakanmu: ")
        val input = readLine()

        // Validasi input
        tebakan = input?.toIntOrNull()
        if (tebakan == null) {
            println("Masukkan angka yang valid!")
            continue
        }

        attempts++

        if (tebakan == target) {
            println("Benar! Angkanya adalah $target 🎉")
            break
        } else if (tebakan < target) {
            println("Terlalu kecil! (Kesempatan tersisa: ${maxAttempts - attempts})")
        } else {
            println("Terlalu besar! (Kesempatan tersisa: ${maxAttempts - attempts})")
        }
    }

    if (attempts == maxAttempts) {
        println("Kesempatan habis! Angka yang benar adalah $target ❌")
    }
}
