import java.io.File
import java.util.*

// Using Kotlin's built-in Pair type for coordinates (row, col)
typealias Point = Pair<Int, Int>

class Kata {
    fun hello(name: String): String {
        return "Hello $name"
    }
    
    fun loadMap(filename: String): Array<CharArray> {
        val lines = File(filename).readLines()
        return lines.map { it.toCharArray() }.toTypedArray()
    }
    
    fun findShortestPath(cornMaze: Array<CharArray>): List<Point> {
        return emptyList() // No path found
    }
}