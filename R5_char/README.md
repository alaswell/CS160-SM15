 CS160: Foundations in Programming

The purpose of this lab is to write Java code over the following topics:

    Take today's quiz over the material in the last recitation
    Setup the workspace for the P4 assignment.
    Learn how to write Java switch statements
    Interpret simple Java programs 

Today's quiz
You should create a new Java Project called Q5 and make a class named Q5.

Please see the screen for today's quiz over the material presented and worked on in the last presentation.
Java Programming
Phase 1: Getting Started on P4
The setup for P4 is complex enough that you won't want to do it on your own, so the TA will help you to get started. P4 requires an additional Java file for the graphical user interface, in addition to several image and maze files. As usual, use Eclipse to create a P4 project and associated P4 class in P4.java. Copy the image files and maze files into ../P4, and the Maze.java source file to ../P4/src/. You can optionally replace Student.jpg with a file of the same name containing your photo in .jpg format, if you would like to see yourself navigating the maze!

    Java.jpg
    Student.jpg
    Success.jpg
    DoNotPass.jpg
    Maze1.txt
    Maze2.txt
    Maze3.txt
    Maze4.txt
    Maze5.txt
    Maze.java 

	A tree view of the P4 directory should look like this:
 P4/
├── Java.jpg
├── Student.jpg
├── Success.jpg
├── DoNotPass.jpg
├── Maze1.txt
├── Maze2.txt
├── Maze3.txt
├── Maze4.txt
├── Maze5.txt
├── bin/
└── src/
         └── Maze.java

Copy the following code to the main method in P4.java:

   		// Create maze
		String fileName = args[0];
		Maze maze = new Maze(fileName);
		System.out.println("Maze name: " + fileName);

		// Get dimensions
		int mazeWidth = maze.getWidth();
		int mazeHeight = maze.getHeight();
		System.out.println("Maze width: " + mazeWidth);
		System.out.println("Maze height: " + mazeHeight);

Once all files are in place, follow these steps:

    Modify the run configuration to pass Maze1.txt to the program.
    Test your program by calling maze.moveRight() to make the student move right one square.
    The maze object has similar methods to move down, left, and up, try calling each of them.
    The boolean returned from the move methods reports if the move was successful or not.
    Add code to print "Success" or "Failure" based on the return value from each move.
    The maze object also has a method called maze.isDone() that returns a boolean.
    The boolean is true when the student has found the Java icon, otherwise it is false.
    Add enough calls to maze.moveRight() to make the student find the Java icon.
    Add a call maze.isDone() before and after the last move, and print the result. 

Note: The initial version of P4.java you wrote in this lab is just enough to get you started, you will need to do more work to complete the assignment.
Phase 2: Switch Statement on Integer

    Create a project and class named R5 in Eclipse, and put the following into main:
    Declare and initialize an integer and scanner to read from the console.
    Print the prompt "Enter an integer: ", and read the integer from the user.
    Write a switch statement that handles all values from 1 to 10 of the integer.
    For each case in which the integer is prime, print a message such as the following:

    7 is a prime number.

    For each case in which the integer is not prime, print a message such as the following:

    6 is not a prime number.

    For all other values of the integer, print a message such as the following:

    11 may or may not be prime.

Phase 3: Switch Statement on Character

    Declare and initialize a String variable and scanner to read from the console.
    Print the prompt "Enter an character: ", and read the String from the user.
    Declare a character variable and make it equal to the first character of the string.
    Write a switch statement that handles the characters '+', '-', '*', '/', '%', '&', and '|'.
    For each case, print the character and its meaning in Java, for example:

    * is the multiplication operator.

    For all other values of the character, print a message such as the following:

    Not sure if ? is an operator.

Phase 4: Switch Statement on String

    Declare and initialize a String variable and scanner to read from the console.
    Print the prompt "Enter a string: ", and read the String from the user.
    Write a switch statement that handles the string "open", "save", "exit", "find", and "help".
    For each case where the string is not equal to "exit", print a message such as the following:

    Processing the open command.

    For the case where the string equals "exit", call System.exit(0).
    For all other values of the string, print a message such as the following:

    Unknown command: whatever

    Now put the prompting and switch statement into a while (true) loop.
    This code is now a command processing loop, accepting commands until the user types "exit". 

Interpret Java
You will be given a sheet of paper with Java code on it and asked to interpret what that code does. Answer the questions, log into RamCT, and take the Interpretation exercise for R5. 
