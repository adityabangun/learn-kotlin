fun main() {
    print("Masukkan angka pertama: ")
    val a = readLine()!!.toDouble()

    print("Masukkan operator (+, -, *, /): ")
    val op = readLine()!!

    print("Masukkan angka kedua: ")
    val b = readLine()!!.toDouble()

    val hasil = when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if (b != 0.0) a / b else "Error: Bagi 0"
        else -> "Operator tidak valid"
    }

    println("Hasil: $hasil")
}
