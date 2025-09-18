data class Todo(val title: String, var done: Boolean)

fun main() {
    val todos = mutableListOf(
        Todo("Belajar Kotlin", false),
        Todo("Bikin mini project", true)
    )

    println("Daftar Todo:")
    todos.forEachIndexed { i, t ->
        println("${i + 1}. [${if (t.done) "x" else " "}] ${t.title}")
    }

    // Tandai todo selesai
    todos[0].done = true
    println("\nSetelah update:")
    todos.forEachIndexed { i, t ->
        println("${i + 1}. [${if (t.done) "x" else " "}] ${t.title}")
    }
}
