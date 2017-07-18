Author: Michael Weaver

Title: Milestone 5

Description: With this portion of the project i was tasked with establishing a priority queue, or heap, based upon the manhattan distance from the start to end. Using this priority to determien which nodes in the maze were addressed.

I managed to code a version of the project that i believe would work, but wound up getting an error about duplicate children.

For my attempt i have created a queue, that is controlled by the distance calculation, which is applied to every square as it is evaluated. Addiitonally i have added safeguards to prevent array index exceptions from being thrown by checking the current row and column index and changing it only if the new value will not go out of bounds. 

Additionaly, i have created a standalone GUI for the milestone in an attempt to create cleaner methods. There are also numerous comments in the program which assist the reader in determinign what each method is meant to accomplish.

