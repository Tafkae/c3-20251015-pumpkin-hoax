import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class KataTest {
    private lateinit var fixture: Kata

    @BeforeEach
    fun setUp() {
        fixture = Kata()
    }

    @Test
    fun `hello should return message with specified name`() {
        val name = "Ingage"
        assertEquals("Hello $name", fixture.hello(name))
    }
    
    @Test
    fun `small map shortest path should be correct`() {
        val smallMap = fixture.loadMap("../../cornmaze-small.txt")
        val smallPath = fixture.findShortestPath(smallMap)
        
        val expected = listOf(
            Point(1, 0), Point(1, 1), Point(1, 2), Point(1, 3),
            Point(1, 4), Point(1, 5), Point(1, 6), Point(1, 7),
            Point(2, 7), Point(3, 7), Point(3, 8), Point(4, 8),
            Point(5, 8), Point(6, 8), Point(7, 8), Point(8, 8),
            Point(8, 9)
        )
        
        assertEquals(expected, smallPath)
    }
    
    @Test
    fun `large map shortest path should be correct`() {
        val largeMap = fixture.loadMap("../../cornmaze-large.txt")
        val largePath = fixture.findShortestPath(largeMap)
        
        val expected = listOf(
            Point(13, 0), Point(13, 1), Point(14, 1), Point(15, 1),
            Point(15, 2), Point(15, 3), Point(16, 3), Point(17, 3),
            Point(17, 2), Point(17, 1), Point(18, 1), Point(19, 1),
            Point(20, 1), Point(21, 1), Point(22, 1), Point(23, 1),
            Point(24, 1), Point(25, 1), Point(25, 2), Point(25, 3),
            Point(25, 4), Point(25, 5), Point(25, 6), Point(25, 7),
            Point(25, 8), Point(25, 9), Point(25, 10), Point(25, 11),
            Point(25, 12), Point(25, 13), Point(26, 13), Point(27, 13),
            Point(28, 13), Point(29, 13), Point(29, 12), Point(29, 11),
            Point(28, 11), Point(27, 11), Point(27, 10), Point(27, 9),
            Point(27, 8), Point(27, 7), Point(27, 6), Point(27, 5),
            Point(27, 4), Point(27, 3), Point(27, 2), Point(27, 1),
            Point(28, 1), Point(29, 1), Point(30, 1), Point(31, 1),
            Point(31, 2), Point(31, 3), Point(30, 3), Point(29, 3),
            Point(29, 4), Point(29, 5), Point(29, 6), Point(29, 7),
            Point(29, 8), Point(29, 9), Point(30, 9), Point(31, 9),
            Point(31, 10), Point(31, 11), Point(31, 12), Point(31, 13),
            Point(31, 14), Point(31, 15), Point(31, 16), Point(31, 17),
            Point(31, 18), Point(31, 19), Point(31, 20), Point(31, 21),
            Point(31, 22), Point(31, 23), Point(30, 23), Point(29, 23),
            Point(29, 24), Point(29, 25), Point(29, 26), Point(29, 27),
            Point(29, 28), Point(29, 29), Point(30, 29), Point(31, 29),
            Point(31, 30), Point(31, 31), Point(31, 32)
        )
        
        assertEquals(expected, largePath)
    }
}
