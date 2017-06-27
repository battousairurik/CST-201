Author: Michael Weaver

Title: Milestone 3

Description: Utilizing Eclipse and Java i have updated the project from the previous milestone, adding a GUI interface which is used as the main maze interaction.

First the maze is read into the GUI from the CSV file and then populated in a GridPane. After which the player icon is placed on the start position. By using the W/S/A/D keys they can traverse the maze to the finish.

As the player moves the maze is updated showing the path taken and the list is updated showing the series of movements they use while trying to get to the finish. Each movement is tested against the maze squares isMovable data type and movement is only allowed if the corrisonding maze square is a viable square.

Currently i have not yet added the exit on finish or utilized  stack properly. When trying to add stck functionality the observable list did not wish to comply. This may be because the type was cast incorrectly, which i will attempt to fix before the next milestone update.

Update (6/27): I added a stack and code to use the stack to traverse the maze, though i still cannot get it to compile properly. I believe i need to address array out of bounds exceptions in order to get it to compile correctly, though do not have time to at current.