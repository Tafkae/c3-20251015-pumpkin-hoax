import unittest
from app.main import Kata


class TestKata(unittest.TestCase):
    def setUp(self):
        self.kata = Kata()
    
    def test_hello_should_return_message_with_specified_name(self):
        name = "Ingage"
        result = self.kata.hello(name)
        self.assertEqual(f"Hello {name}", result)
    
    def test_small_map_shortest_path_should_be_correct(self):
        small_map = self.kata.load_map("../../cornmaze-small.txt")
        small_path = self.kata.find_shortest_path(small_map)
        
        expected = [
            (1, 0), (1, 1), (1, 2), (1, 3), (1, 4), (1, 5), (1, 6), (1, 7),
            (2, 7), (3, 7), (3, 8), (4, 8), (5, 8), (6, 8), (7, 8), (8, 8), (8, 9)
        ]
        
        self.assertEqual(expected, small_path)
    
    def test_large_map_shortest_path_should_be_correct(self):
        large_map = self.kata.load_map("../../cornmaze-large.txt")
        large_path = self.kata.find_shortest_path(large_map)
        
        expected = [
            (13, 0), (13, 1), (14, 1), (15, 1), (15, 2), (15, 3), (16, 3), (17, 3),
            (17, 2), (17, 1), (18, 1), (19, 1), (20, 1), (21, 1), (22, 1), (23, 1),
            (24, 1), (25, 1), (25, 2), (25, 3), (25, 4), (25, 5), (25, 6), (25, 7),
            (25, 8), (25, 9), (25, 10), (25, 11), (25, 12), (25, 13), (26, 13), (27, 13),
            (28, 13), (29, 13), (29, 12), (29, 11), (28, 11), (27, 11), (27, 10), (27, 9),
            (27, 8), (27, 7), (27, 6), (27, 5), (27, 4), (27, 3), (27, 2), (27, 1),
            (28, 1), (29, 1), (30, 1), (31, 1), (31, 2), (31, 3), (30, 3), (29, 3),
            (29, 4), (29, 5), (29, 6), (29, 7), (29, 8), (29, 9), (30, 9), (31, 9),
            (31, 10), (31, 11), (31, 12), (31, 13), (31, 14), (31, 15), (31, 16), (31, 17),
            (31, 18), (31, 19), (31, 20), (31, 21), (31, 22), (31, 23), (30, 23), (29, 23),
            (29, 24), (29, 25), (29, 26), (29, 27), (29, 28), (29, 29), (30, 29), (31, 29),
            (31, 30), (31, 31), (31, 32)
        ]
        
        self.assertEqual(expected, large_path)


if __name__ == "__main__":
    unittest.main()
