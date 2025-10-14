import java.util.Objects;

public class Point {
    public final int row;
    public final int col;

    public Point(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return row == point.row && col == point.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
}
