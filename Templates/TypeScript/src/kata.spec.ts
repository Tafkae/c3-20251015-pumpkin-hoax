import { beforeEach, expect, test } from '@jest/globals';
import { Kata } from "./kata";

let fixture: Kata;

beforeEach(() => {
    fixture = new Kata();
});

test('hello should return message with specified name', () => {
    const name = 'Ingage';
    expect(fixture.hello(name)).toEqual(`Hello ${name}`);
});

test('small map shortest path should be correct', () => {
    const smallMap = fixture.loadMap('../../cornmaze-small.txt');
    const smallPath = fixture.findShortestPath(smallMap);
    expect(smallPath).toEqual([
        [1, 0],[1, 1],[1, 2],[1, 3],[1, 4],[1, 5],[1, 6],[1, 7],[2, 7],[3, 7],[3, 8],[4, 8],[5, 8],[6, 8],[7, 8],[8, 8],[8, 9]
    ]);
});

test('large map shortest path should be correct', () => {
    const largeMap = fixture.loadMap('../../cornmaze-large.txt');
    const largePath = fixture.findShortestPath(largeMap);
    expect(largePath).toEqual(
        [
            [13, 0], [13, 1], [14, 1], [15, 1], [15, 2], [15, 3], [16, 3], [17, 3],
            [17, 2], [17, 1], [18, 1], [19, 1], [20, 1], [21, 1], [22, 1], [23, 1],
            [24, 1], [25, 1], [25, 2], [25, 3], [25, 4], [25, 5], [25, 6], [25, 7],
            [25, 8], [25, 9], [25, 10], [25, 11], [25, 12], [25, 13], [26, 13], [27, 13],
            [28, 13], [29, 13], [29, 12], [29, 11], [28, 11], [27, 11], [27, 10], [27, 9],
            [27, 8], [27, 7], [27, 6], [27, 5], [27, 4], [27, 3], [27, 2], [27, 1],
            [28, 1], [29, 1], [30, 1], [31, 1], [31, 2], [31, 3], [30, 3], [29, 3],
            [29, 4], [29, 5], [29, 6], [29, 7], [29, 8], [29, 9], [30, 9], [31, 9],
            [31, 10], [31, 11], [31, 12], [31, 13], [31, 14], [31, 15], [31, 16], [31, 17],
            [31, 18], [31, 19], [31, 20], [31, 21], [31, 22], [31, 23], [30, 23], [29, 23],
            [29, 24], [29, 25], [29, 26], [29, 27], [29, 28], [29, 29], [30, 29], [31, 29],
            [31, 30], [31, 31], [31, 32]
        ]
    );   
});

