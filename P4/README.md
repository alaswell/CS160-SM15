 CS 160, Summer 2015
Programming Assignment P4
Searching for Java

Programming due Monday, July 6 at noon; late deadline July 6 at 10 p.m.
Moving in a Maze
This lab has the goal of teaching you how to:

    Read input from the user and perform error checking.
    Instantiate a Maze object and call its methods.
    See your code control user interface.
    Use control loops to manage movement in the Maze. 

Description
This assignment features you, the student, as the star of the show. The goal of this program is to move yourself around the maze according to a precise set of rules. If you follow the rules, you will find the Java logo . Note: You must follow the exact path we specify to receive full credit on this program, finding the Java logo is not enough!
Instructions
In Recitation 5 you should have started on P4.java. If not, follow the directions here. Leave in the code you wrote that instantiates the Maze object and retrieves the dimensions. Remove any code from the recitation that moves the student around in the maze. Then add code to implement the algorithm shown below. This will require multiple control loops, which can be either while or for statements. Here is a complete specification of the Maze methods you can call:

// Constructor, parameter is name of maze file
public Maze(String fileName)

// Get height of maze, in rows
public int getHeight()

// Get width of maze, in columns
public int getWidth()

// Move commands, returns true if move successful, false is blocked
public boolean moveRight()
public boolean moveLeft()
public boolean moveUp()
public boolean moveDown()

// Returns true when the student finds the java logo, false otherwise
public boolean isDone()

Algorithm

    The student always starts at the top left corner, that is row and column zero.
    The Java logo can be anywhere in the maze, which also contains obstacles shown as "Wrong Way" signs.
    You must traverse every row in the maze from top to bottom according to the rules below, until you find the Java logo.
    Row and column numbers are zero based, so the first row and column is index 0. the second row and column is index 1, and so on. The number zero is even.
    On even rows, you must move left to right using maze.moveRight(), on odd rows, you must move right to left using maze.moveLeft().
    After completing each row, use maze.moveDown() to proceed to the next row, until you reach the last row or find the Java logo.
    You can detect that you have encountered an obstacle by checking the return value from move methods in the Maze object, true means no obstacle, false means obstacle.
    If you run into an obstacle when moving left to right:
        Move down, right, right, and up.
        Adjustment the loop counter for the extra move right! 
    If you run into an obstacle when moving right to left:
        Move down, left, left, and up.
        Adjustment the loop counter for the extra move left! 
    You must know where the column and row boundaries are without trying to move past them.
    Every time you move left or right, not including when avoiding an obstacle, you must call maze.isDone() to see if you have found the Java logo.
    When you find the Java logo, you must immediately break out of all loops, and exit the program.
    There are mazes that cannot be solved using the algorithm, but we will not test your program with any of them. 

The Maze is programmed to wait 0.5 seconds each time you move the student, so you can issue move calls back to back, and the student will move at a reasonable speed that allows you to see the moves. In addition to checking visually, the move methods will print the row and column of the student, and you can use this to debug your code. For example, here is the output of moving the student from the top left corner right three spaces.

Maze name: Maze1.txt
Maze width: 10
Maze height: 5
Moved to row 0, column 1
Moved to row 0, column 2
Moved to row 0, column 3

Testing
You should test your code with the five Mazes provided, and you can also make your own mazes. The format of a maze file is shown below. The first line is an integer specifying the height (number of rows), the second line is an integer specifying the width (number of columns), followed by one line for each row of the maze, with one character per column. The value 'S' is the student, 'J' is the Java logo, 'D' is a wrong way sign, and '-' is empty.

5
10
S--------J
--D---D---
--D----D--
----D-----
--D----D--

Specifications
Your program must meet the following specifications:

    The student must follow the exact route specified.
    The student can only move to a square adjacent to the current position.
    The student cannot move diagonally or outside the maze.
    Work on your own, as always.
    The name of the source code file must be exactly P4.java.
    Name the file exactly - upper and lower case matters!
    Assignments should be implemented using Eclipse.
    Assignments should be implemented using Java 1.7 or better.
    Make sure your code runs on machines in the COMCS 120 lab.
    Submit your program to the Checkin tab as you were shown in the recitation.
    Read the syllabus for the late policy.
    We will be checking programs for plagiarism, so please don't copy from anyone else. 

Grading Criteria

    100 points for perfect submission.
    0 points for no submission, will not compile, submitted class file, etc.
    Preliminary Tests
        compileTest: checks that program compiles. (10 points)
        test1: The student correctly solves Maze1.txt (10 points)
        test2: The student correctly solves Maze2.txt (10 points)
        test3: The student correctly solves Maze3.txt (10 points)
        test4: The student correctly solves Maze4.txt (10 points)
        test5: The student correctly solves Maze5.txt (10 points) 
    Final Tests
        test6: We will test with a straightforward maze, not provided to you. (5 points)
        test7: We will test with a more complex maze, not provided to you. (5 points)
        test8: We will test with a small but devious maze, not provided to you. (10 points)
        test9: We will test with a large and devious maze, not provided to you. (10 points)
        test10: Another test using Maze5.txt, but checks both successful and failed moves! (10 points) 
    Preliminary tests use a maze with 5 rows and 10 columns, final tests using different size mazes.
    Final grading includes the preliminary tests. 

Submit your program to the Checkin tab on the course website, as you were shown in the recitation, and read the syllabus for the late policy (if necessary). 
