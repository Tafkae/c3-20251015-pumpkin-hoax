// This is just a simple type to hold x and y coordinates
export type Point = [number, number];

export class Kata {
    public hello(name: string): string {
        return `Hello ${name}`;
    }

    public loadMap(filename: string): Array<Array<string>> {
        const fs = require('fs');
        const data = fs.readFileSync(filename, 'utf8');
        return data.split('\n').map((line: string) => line.split(''));
    }

    public findShortestPath(cornMaze: Array<Array<string>>): Array<Point> {
        return []; // No path found
    }
}
