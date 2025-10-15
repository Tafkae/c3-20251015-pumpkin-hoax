class Kata {
    hello(name) {
        return `Hello ${name}`;
    }

    loadMap(filename) {
        const fs = require('fs');
        const data = fs.readFileSync(filename, 'utf8');
        return data.split('\n').map((line) => line.split(''));
    }

    findShortestPath(cornMaze) {
        return []; // No path found
    }
}

module.exports = Kata;
