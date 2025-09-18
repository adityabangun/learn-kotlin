import java.util.Scanner
import kotlin.random.Random

fun main() {
    val width = 10
    val height = 10
    val grid = Array(height) { CharArray(width) { '.' } } // '.' = empty
    val snake = mutableListOf<Pair<Int, Int>>() // posisi tubuh ular
    var snakeX = width / 2
    var snakeY = height / 2
    snake.add(Pair(snakeX, snakeY))

    var score = 0

    // Generate initial food
    var foodX = Random.nextInt(width)
    var foodY = Random.nextInt(height)
    while (foodX == snakeX && foodY == snakeY) {
        foodX = Random.nextInt(width)
        foodY = Random.nextInt(height)
    }

    val scanner = Scanner(System.`in`)

    while (true) {
        // Clear screen
        repeat(50) { println() }

        // Update grid
        for (y in 0 until height) {
            for (x in 0 until width) {
                when {
                    x == foodX && y == foodY -> print("F ") // food
                    snake.any { it.first == x && it.second == y } -> print("S ") // snake body
                    else -> print("${grid[y][x]} ")
                }
            }
            println()
        }

        println("Score: $score")

        // Input
        print("Gerakkan Snake (W/A/S/D): ")
        val input = scanner.nextLine().uppercase()
        var nextX = snakeX
        var nextY = snakeY
        when (input) {
            "W" -> if (snakeY > 0) nextY--
            "S" -> if (snakeY < height - 1) nextY++
            "A" -> if (snakeX > 0) nextX--
            "D" -> if (snakeX < width - 1) nextX++
            else -> println("Input salah!")
        }

        // Update snake position
        snakeX = nextX
        snakeY = nextY

        // Check if snake eats food
        if (snakeX == foodX && snakeY == foodY) {
            score++
            snake.add(Pair(snakeX, snakeY)) // tambah panjang
            // generate new food
            do {
                foodX = Random.nextInt(width)
                foodY = Random.nextInt(height)
            } while (snake.any { it.first == foodX && it.second == foodY })
        } else {
            // geser tubuh ular
            snake.add(Pair(snakeX, snakeY))
            snake.removeAt(0) // hapus ekor
        }

        // Check collision dengan diri sendiri
        if (snake.dropLast(1).any { it.first == snakeX && it.second == snakeY }) {
            println("Game Over! Score: $score")
            break
        }
    }
}
