CS160: Foundations in Programming

The purpose of this lab is to:

    Learn the basics of file input/output (I/O)
    Learn how to read a file using Scanner
    Learn how to write a file using PrintWriter 

Today's quiz
You should create a new Java Project called Q14 and make a class named Q14.

Please go to the location identified by the TA for today's quiz.

Java Programming
Phase 1
Make a new project and class in Eclipse called R14, with a main method. Download the data file from here. Set up the Run Configuration so that R14 has the program arguments:

input.txt output.txt

This is the same as reading command line arguments from the terminal. Create two methods with the following signatures:

public void readFile( String inputFile ){ }

public void writeFile( String outputFile ){ }

Within the main method, call the readFile method with the first command line argument (args[0]), then call the writeFile method with the second command line argument (args[1]).

Phase 2
Implement the readFile method to open the input file, print the type of the next token (string separated by white space or punctuation) and the token itself, as shown below. Your code should read tokens until the end of the file is reached, and it should close the file when finished. Handle the data types integer, double, and string. Exceptions should be handled as shown in class and in the recitation. Make sure your program successfully reads the input values and prints them. Remember that some types can be upgraded from a lower type to higher type. The output from the provided file (input.txt) should exactly match the following:

String: And
String: you
String: feel
String: that
String: you
String: have
String: exerted
String: your
String: very
String: best
String: efforts
String: in
String: the
String: matter,
String: do
String: you?
String: That
String: you
String: have
String: exercised
String: all
String: of
String: your
String: considerable
String: ingenuity?
String: Albus
String: Dumbledore
String: to
String: Harry
String: Potter
Integer: 1
Double: 0.1
String: @
Integer: 12
Double: 0.123
String: $
Integer: 123
Double: 0.1234
String: %
Integer: 1234
Double: 0.12345
String: ^
Integer: 12345
String: &
String: FALSE
String: TRUE
String: Computer
String: Science
Integer: 13579
String: ~
Double: 999.98
String: Whatever
String: A
String: B
String: C

Phase 3
Implement the writeFile method to open the output file, prompt the user with "Enter text:", then read input from the user via the keyboard, print the input to the file, and close the output file. When the user types stop (uppercase or lowercase) by itself on its own line, the method should terminate.

Given this input from the console:

Enter text:
Hello! Here are some words.
stop can be written here, but it still makes it in.
so will this stop.
stop!
stop

The output file should exactly match the following:

Hello! Here are some words.
stop can be written here, but it still makes it in.
so will this stop.
stop!

