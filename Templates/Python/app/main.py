from collections import deque
from typing import List, Tuple, Optional

# Type alias for coordinates (row, col)
Point = Tuple[int, int]

class Kata:
    def hello(self, name: str) -> str:
        return f"Hello {name}"
    
    def load_map(self, filename: str) -> List[List[str]]:
        """Load maze from file and return as 2D array of characters."""
        with open(filename, 'r') as file:
            lines = file.readlines()
        return [list(line.strip()) for line in lines if line.strip()]
    
    def find_shortest_path(self, corn_maze: List[List[str]]) -> List[Point]:
        """Find the shortest path through the corn maze using BFS."""
        return []  # No path found


def main():
    kata = Kata()
    print(kata.hello("World"))


if __name__ == "__main__":
    main()