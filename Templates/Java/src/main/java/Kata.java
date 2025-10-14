import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Kata {
    public String hello(String name) {
        return String.format("Hello %s", name);
    }
    
    public char[][] loadMap(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        char[][] map = new char[lines.size()][];
        
        for (int i = 0; i < lines.size(); i++) {
            map[i] = lines.get(i).toCharArray();
        }
        
        return map;
    }
    
    public List<Point> findShortestPath(char[][] cornMaze) {
        return new ArrayList<>(); // No path found
    }
}
