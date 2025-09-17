fun hitungLuas(panjang: Int, lebar: Int): Int {
    return panjang * lebar
}

fun hitungLuas(sisi: Int): Int {
    return sisi * sisi
}

fun main() {
    println("Luas persegi panjang: " + hitungLuas(4, 6))
    println("Luas persegi: " + hitungLuas(5))
}
