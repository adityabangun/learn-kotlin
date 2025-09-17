fun main() {
    val correctUser = "admin"
    val correctPass = "1234"

    print("Username: ")
    val user = readLine() ?: ""
    print("Password: ")
    val pass = readLine() ?: ""

    if (user == correctUser && pass == correctPass) {
        println("Login berhasil!")
    } else {
        println("Username atau password salah")
    }
}
