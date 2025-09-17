fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    // isi semua parameter
    println(displayAlertMessage(operatingSystem, emailId))

    // isi hanya os, email pakai default
    println(displayAlertMessage(operatingSystem))

    // tanpa parameter, semua pakai default
    println(displayAlertMessage())
}

// Fungsi dengan default parameter
fun displayAlertMessage(
    os: String = "Unknown OS",
    email: String = "Unknown Email"
): String {
    return "There’s a problem with your operating system: $os.\n" +
            "Please send an email to $email for support."
}
