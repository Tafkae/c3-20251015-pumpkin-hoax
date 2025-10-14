using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace Project
{
    // Simple Point record to hold x and y coordinates
    public record Point(int Row, int Col);

    public class Kata
    {
        public string Hello(string name)
        {
            return $"Hello {name}";
        }

        public char[][] LoadMap(string filename)
        {
            var lines = File.ReadAllLines(filename);
            return lines.Select(line => line.ToCharArray()).ToArray();
        }

        // ########################################################
        // Implement the shortest path finding algorithm here
        public List<Point> FindShortestPath(char[][] cornMaze)
        {
            return new List<Point>(); // No path found
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            var kata = new Kata();
            Console.WriteLine(kata.Hello("World"));
        }
    }
}
