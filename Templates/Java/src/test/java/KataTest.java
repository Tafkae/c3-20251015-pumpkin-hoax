import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KataTest {
    private Kata fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Kata();
    }

    @Test
    public void helloShouldReturnMessageWithSpecifiedName() {
        String name = "Ingage";
        assertEquals(String.format("Hello %s", name), fixture.hello(name));
    }
    
    @Test
    public void smallMapShortestPathShouldBeCorrect() throws IOException {
        char[][] smallMap = fixture.loadMap("../../cornmaze-small.txt");
        List<Point> smallPath = fixture.findShortestPath(smallMap);
        
        List<Point> expected = Arrays.asList(
            new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3), 
            new Point(1, 4), new Point(1, 5), new Point(1, 6), new Point(1, 7), 
            new Point(2, 7), new Point(3, 7), new Point(3, 8), new Point(4, 8), 
            new Point(5, 8), new Point(6, 8), new Point(7, 8), new Point(8, 8), 
            new Point(8, 9)
        );
        
        assertEquals(expected, smallPath);
    }
    
    @Test
    public void largeMapShortestPathShouldBeCorrect() throws IOException {
        char[][] largeMap = fixture.loadMap("../../cornmaze-large.txt");
        List<Point> largePath = fixture.findShortestPath(largeMap);
        
        List<Point> expected = Arrays.asList(
            new Point(13, 0), new Point(13, 1), new Point(14, 1), new Point(15, 1), 
            new Point(15, 2), new Point(15, 3), new Point(16, 3), new Point(17, 3),
            new Point(17, 2), new Point(17, 1), new Point(18, 1), new Point(19, 1), 
            new Point(20, 1), new Point(21, 1), new Point(22, 1), new Point(23, 1),
            new Point(24, 1), new Point(25, 1), new Point(25, 2), new Point(25, 3), 
            new Point(25, 4), new Point(25, 5), new Point(25, 6), new Point(25, 7),
            new Point(25, 8), new Point(25, 9), new Point(25, 10), new Point(25, 11), 
            new Point(25, 12), new Point(25, 13), new Point(26, 13), new Point(27, 13),
            new Point(28, 13), new Point(29, 13), new Point(29, 12), new Point(29, 11), 
            new Point(28, 11), new Point(27, 11), new Point(27, 10), new Point(27, 9),
            new Point(27, 8), new Point(27, 7), new Point(27, 6), new Point(27, 5), 
            new Point(27, 4), new Point(27, 3), new Point(27, 2), new Point(27, 1),
            new Point(28, 1), new Point(29, 1), new Point(30, 1), new Point(31, 1), 
            new Point(31, 2), new Point(31, 3), new Point(30, 3), new Point(29, 3),
            new Point(29, 4), new Point(29, 5), new Point(29, 6), new Point(29, 7), 
            new Point(29, 8), new Point(29, 9), new Point(30, 9), new Point(31, 9),
            new Point(31, 10), new Point(31, 11), new Point(31, 12), new Point(31, 13), 
            new Point(31, 14), new Point(31, 15), new Point(31, 16), new Point(31, 17),
            new Point(31, 18), new Point(31, 19), new Point(31, 20), new Point(31, 21), 
            new Point(31, 22), new Point(31, 23), new Point(30, 23), new Point(29, 23),
            new Point(29, 24), new Point(29, 25), new Point(29, 26), new Point(29, 27), 
            new Point(29, 28), new Point(29, 29), new Point(30, 29), new Point(31, 29),
            new Point(31, 30), new Point(31, 31), new Point(31, 32)
        );
        
        assertEquals(expected, largePath);
    }
}
