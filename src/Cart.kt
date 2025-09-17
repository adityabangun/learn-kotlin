data class Item(val name: String, val price: Int)

fun main() {
    val items = listOf(
        Item("Buku", 20000),
        Item("Pensil", 5000),
        Item("Penghapus", 3000)
    )

    println("Daftar Barang:")
    items.forEach { println("${it.name}: Rp${it.price}") }

    val total = items.sumOf { it.price }
    println("Total Harga: Rp$total")
}
