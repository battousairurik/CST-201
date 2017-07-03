Author: Michael Weaver

Title: Milestone 4

Description: For this Milestone i have added a tertiary functionality to the maze to solve itself using a Queue. The Queue scans available MazeSquares encircling the StartSquare and adds movable squares to the queue. The program then marks the current square as moved in and then moves the current square to the top of the queue and then scans again. This process repeats until the current square is the end square and the maze has been solved.

Because of the way Queue's are utilized, the maze does not scan in a linear manner, instead it hops round from square to square in the manner that it is added to the queue.

Although in theory the method should work to solve the maze, the display of the maze does not update after each iteration and it is impossible to tell if the queue solves the maze or not.