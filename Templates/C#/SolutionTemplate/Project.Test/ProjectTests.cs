using System.Collections.Generic;
using NUnit.Framework;

namespace Project.Test
{
    public class KataTests
    {
        private Kata _fixture;

        [SetUp]
        public void Setup()
        {
            _fixture = new Kata();
        }

        [Test]
        public void HelloShouldReturnMessageWithSpecifiedName()
        {
            string name = "Ingage";
            string result = _fixture.Hello(name);
            Assert.That(result, Is.EqualTo($"Hello {name}"));
        }

        [Test]
        public void SmallMapShortestPathShouldBeCorrect()
        {
            char[][] smallMap = _fixture.LoadMap("../../../../../../../cornmaze-small.txt");
            List<Point> smallPath = _fixture.FindShortestPath(smallMap);

            var expected = new List<Point>
            {
                new(1, 0), new(1, 1), new(1, 2), new(1, 3),
                new(1, 4), new(1, 5), new(1, 6), new(1, 7),
                new(2, 7), new(3, 7), new(3, 8), new(4, 8),
                new(5, 8), new(6, 8), new(7, 8), new(8, 8),
                new(8, 9)
            };

            Assert.That(smallPath, Is.EqualTo(expected));
        }

        [Test]
        public void LargeMapShortestPathShouldBeCorrect()
        {
            char[][] largeMap = _fixture.LoadMap("../../../../../../../cornmaze-large.txt");
            List<Point> largePath = _fixture.FindShortestPath(largeMap);

            var expected = new List<Point>
            {
                new(13, 0), new(13, 1), new(14, 1), new(15, 1),
                new(15, 2), new(15, 3), new(16, 3), new(17, 3),
                new(17, 2), new(17, 1), new(18, 1), new(19, 1),
                new(20, 1), new(21, 1), new(22, 1), new(23, 1),
                new(24, 1), new(25, 1), new(25, 2), new(25, 3),
                new(25, 4), new(25, 5), new(25, 6), new(25, 7),
                new(25, 8), new(25, 9), new(25, 10), new(25, 11),
                new(25, 12), new(25, 13), new(26, 13), new(27, 13),
                new(28, 13), new(29, 13), new(29, 12), new(29, 11),
                new(28, 11), new(27, 11), new(27, 10), new(27, 9),
                new(27, 8), new(27, 7), new(27, 6), new(27, 5),
                new(27, 4), new(27, 3), new(27, 2), new(27, 1),
                new(28, 1), new(29, 1), new(30, 1), new(31, 1),
                new(31, 2), new(31, 3), new(30, 3), new(29, 3),
                new(29, 4), new(29, 5), new(29, 6), new(29, 7),
                new(29, 8), new(29, 9), new(30, 9), new(31, 9),
                new(31, 10), new(31, 11), new(31, 12), new(31, 13),
                new(31, 14), new(31, 15), new(31, 16), new(31, 17),
                new(31, 18), new(31, 19), new(31, 20), new(31, 21),
                new(31, 22), new(31, 23), new(30, 23), new(29, 23),
                new(29, 24), new(29, 25), new(29, 26), new(29, 27),
                new(29, 28), new(29, 29), new(30, 29), new(31, 29),
                new(31, 30), new(31, 31), new(31, 32)
            };

            Assert.That(largePath, Is.EqualTo(expected));
        }
    }
}