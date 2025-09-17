fun main() {

    val number: Int = 10
    val angka = 20
    println("I have ${number + angka} apple in my house")

    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")

    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")

    var cartTotal = 0
    println("Total: $cartTotal")

    cartTotal = 20
    println("Total: $cartTotal")

    var count = 10
    count++
    println("You have $count unread messages.")

    var buah = 5
    buah++
    buah--
    println("You have $buah fruits here.")

    var panjang = 15
    panjang = panjang + 1
    println("Saya mempunyai buku panjangnya $panjang cm")

    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

}