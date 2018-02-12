CS160: Foundations in Programming

The goals of this lab are as follows:

    Login to department systems
    Present the Linux File System
    Show some Linux commands in a terminal window
    Manipulate text files in Linux
    Discover the class website
    Learn to run Linux applications
    Get Eclipse up and running
    Start on a simple Java program
    Learn to submit programs
    Interpret information about today's lab 

Logging In

    Login to the machine using your electronic ID (same username that you use for RamWeb).
    The initial password should be your student ID (same as nine digit number on your RamCard).
    Troubleshooting:
        Raise your hand if you cannot login! 

You will change you password later in the recitation.
Linux File System

Your GTA will describe the hierarchical file system used in Linux. Make sure you know what each of the following identify:
~
.
..
/
current directory
home directory
file extensions
Useful Terminal Commands
Your TA will show you how to use the "man" command. For each of the following, write down what action is performed.

man
pwd, ls, cd
cp, mv, rm
mkdir, rmdir
cat, diff, less
Launching programs from a terminal: &

Your TA will show you how to look at the history of commands, how to recall previous commands, and how to search the history buffer, and how to edit recalled commands. In addition, you will learn how auto completion works.

Text Files
Perform the following actions:

    Use gedit to create the Name.txt: gedit Name.txt &
    The file should contain one line which has your first and last name.
    Save the file.
    Copy Name.txt to another file called Name.bak.
    Compare the contents of the two files using the diff command. Are they the same?
    Open Name.bak as a second tab in gedit.
    Add a second line to Name.bak with your student ID.
    Compare the two files again. Are they the same?
    Remove Name.txt.
    Move Name.bak to Name.txt.
    Cat the contents of Name.txt. Is your student ID present? 

Class WebSite

    Start your preferred internet browser and type in the url www.cs.colostate.edu/~cs160.
    Look at the syllabus and progress pages.
    Find the lab instructions for today.
    Open another tab and type in the url ramct.colostate.edu.
    Login on Canvas using your EID and password and make sure you can see CS160. 

Launching Applications

    Your TA will show you how to launch applications and add them to the task bar.
    Click on "Activities" in the upper left corner of the screen
    Click on "Applications"
    Run firefox, gedit, file manager, and a terminal.
    The terminal command brings up a window where you can type in Linux commands, similar to using DOS command prompt on Windows.
    Use the passwd command to change your password. It is recommended that you change it to your RamWeb/Canvas password. 

Using Eclipse
Eclipse makes programming easier by compiling and running your programs in a single step. Your TA will go over setting up Eclipse and your workspace.

    To start Eclipse, open a terminal window and type "eclipse.sh".
    You must do this every time you launch Eclipse.
    Close the window that welcomes you to Eclipse.
    Select the Window→ Open Perspective→ Java.
    You can change perspectives as need be to fit your workflow.
    If your perspective ever gets messed up, you can reset your perspective by going to Window→ Reset Perspective.
    Close the "Welcome" window if it doesn't disappear automatically.
    Create a default comment header by going to Window→ Preferences→ Java→ Code Style→ Code Templates→ Code→ New Java files and putting a line for file name, your name, the class, and your email. 

Your TA will guide you in creating a project called R1 and class for starting the R1.

    Creating a new project:
        Create a new project using the File→ New→ Project, and name it R1.
        Right click on R1 in the Package Explorer tab and choose New→ Class.
        Name it "R1" (Eclipse will add ".java" automatically) and type the following code between the brackets under "main":

        System.out.println( "Hello World" );

    Your code should look like this:

    // R1 Assignment
    // Author: Your name here
    // Date:   6/17/2014
    // Class:  CS160
    // Email:  your_email@colostate.edu

    public class R1
    {
        public static void main( String[ ] args )
        {
            System.out.println( "Hello World!" ); 
        }
    }

    You can now run your program by clicking the green "Play" shaped button on the toolbar.
    Note that the output will appear in the Console window at the bottom.
    You should see the program print "Hello World!" on the first line of the console.
    For detailed tutoring on using Eclipse, check out the website: Eclipse. 

Program Submission via Checkin
Your TA will now walk through logging in to the course website, submitting your code, and viewing preliminary test results.

Setting up Eclipse for P1

Your TA will now have you set up your P1 project that you will use for your first program. You should start with the same code you used for R1 - you will modify it to do the assignment. You will also set up your workspace you will use for quizzes and tests - called quizspace.
Interpretation section
You will be given a sheet of paper with today's interpretation assignment covering the material in today's lab. You should fill out the sheet to the best of your abilities without the use of your textbook or your recitation members. Once you have filled it out, log into Canvas and provide your answers to the questions for gradeing by clicking on the Interpretation Ex. menu item on the left and selecting R1. 
