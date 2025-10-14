# 2025-10-15 - The Great Pumpkin Hoax

## The Story
It's Halloween night, and we all know that means that The Great Pumpkin is going to pay a visit to the most sincere pumpkin patch and deliver toys and candy to all the deserving children. As usual, Linus has convinced Sally that his pumpkin patch is the most sincere, and that she should wait for the arrival of The Great Pumpkin with him.

Sally is skeptical, and she has been burned by this scam for many many years. But she really adores Linus, so she is willing to give up trick-or-treating, and skip the going to the Halloween party with the rest of the Peanuts gang, so she can spend time with her sweet babboo. But as the night wears on and there is no sign of The Great Pumpkin arriving, she finally decides she has had enough, and leaves Linus alone in the pumpkin patch, with the hopes of at least enjoying the Halloween party with her friends. But as she leaves the pumpkin patch, she comes across a corn maze that she must navigate through, in order to make her way to the party. Where did this maze come from? We may never know, and she has never seen it before now, but she knows that she will need to quickly find her way through the maze to get to the party before it is over.

Your mission tonight is to help Sally find the shortest route through the corn maze so that she can get to the party with her friends. There may be more than one route through the maze, so be sure to guide her on the shortest route so she can enjoy as much of the party as possible - there is dancing to be done, apples to be bobbed for, and candy to be eaten!

## The Technical Stuff

### Maps
In the root of this repository (where this README is), you'll find some corn maze maps - isn't that handy that someone just happened to leave a map of the maze for us to use! There are two map files, [cornmaze-small.txt](./cornmaze-small.txt) and [cornmaze-large.txt](./cornmaze-large.txt). As you might guess, the "small" one is relatively small, and can be used while you are developing, unit testing, and debugging. The "large" one is, well, larger... It has more possible paths, and more dead-ends. If you get a solution working properly for the small map, that same solution should work for the larger one.

These maps are just grids, like this small example:
```
#S########
#.#......#
#.#.####.#
#.#....#.#
#.#.##.#.#
#...#....E
##########
```

In the map, you'll find the following symbols:
- `S` - the starting point where Sally will enter the corn maze
- `E` - the exit of the corn maze - Sally will see the party once she exits the maze!
- `.` - an open path - Sally can walk anywhere you see these 
- `#` - a "wall" of corn - Sally can't go through this

In the example map above, you can easily see that Sally can make these moves to exit:
- Down 5
- Right 2
- Up 2
- Right 3
- Down 2
- Right 3

After those moves, Sally will be on the exit (`E`) and will see the party up ahead, and it took her 17 total moves.

There are other paths she could have taken, but they are longer, and since she wants to get to the party as quickly as possible, she only wants to know the shortest route.

### Hints
We don't want to give too much away here, so we will just say that this kind of problem has many well-known and well-documented solutions in computer science. Before searching for a solution, you can probably start out just looking at the map, and think about how you might navigate these yourself, how you would determine what direction you could move from a given point, what you might do if you come to a dead-end, how you might keep track of intersections and coordinates you have already visited, and so on. These are the kinds of things that have well-known solutions, so once you have a basic idea how you might approach the problem, you are free to either start implementing that, or do a google search or chat and see the well-known algorithms that pop up, and then move forward with one of those implementations. 

### Template Implementations
There are a number of starter projects under the [Templates](./Templates) directory. These templates include the basic setup of a project in each of the implemented languages, and a `loadMap` function/method to load up a map file into a 2D array, and a function/method called `findShortestPath` that you will need to implement, to return a list of the xy coordinates of the shortest path for a given maze (represented by the 2D array). There are also 2 unit tests, one for the "small" maze, and one for the "large" maze, that will be failing until you implement the `findShortestPath` function/method.
