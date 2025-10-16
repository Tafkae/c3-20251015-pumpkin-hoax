class Kata {

  hello(name) {
    return `Hello ${name}`;
  }

  loadMap(filename) {
    const fs = require("fs");
    const data = fs.readFileSync(filename, "utf8");
    return data.split("\n").map((line) => line.split(""));
  }

  setStartCoords() {   // expect coords as [row, col]
    // this.startCoords = ;
    // this.currentCoords = ;
  }

  tryStep() {
    const up = this.getUp();
    const down = this.getDown();
    const left = this.getLeft();
    const right = this.getRight();
  }

  getUp(currentCoords) { return [ currentCoords[0]-1, currentCoords[1] ]; }
  getDown(currentCoords) { return [ currentCoords[0]+1, currentCoords[1] ]; }
  getLeft(currentCoords) { return [ currentCoords[0], currentCoords[1]-1 ]; }
  getRight(currentCoords) { return [ currentCoords[0], currentCoords[1]+1 ]; }

  charAt(cornMaze, coords) { return cornMaze[coords[0]][coords[1]]; }
  isNavigable(cornMaze, coords) {
    if (coords[0] < 0 || coords[0] >= cornMaze.length) {
      return false;
    }

    if (coords[1] < 0 || coords[1] >= cornMaze[0].length) {
      return false;
    }

    let charAtCoords = this.charAt(cornMaze,coords);
    if (charAtCoords === '.' || charAtCoords === 'E') {
      return true;
    }

    return false;
  }

  findShortestPath(cornMaze) {
    const path = [[],[]];
    const startingPoint = this.findStartingPoint(cornMaze);
    const endPoint = this.findEndPoint(cornMaze);

    return []; // No path found
  }

  findStartingPoint(cornMaze) { return this.findPoint(cornMaze, "S"); }
  findEndPoint(cornMaze) { return this.findPoint(cornMaze, "E"); }

  findPoint(cornMaze, char) {
    for (let row = 0; row < cornMaze.length; row++) {
      for (let column = 0; column < cornMaze[row].length; column++) {
        if (cornMaze[row][column] === char) {
          return [row, column];
        }
      }
    }
  }
}


module.exports = Kata;
