CS160: Foundations in Programming

The purpose of this lab is to write Java code over the following topics:

    Take today's quiz over the material in the last recitation
    To continue to use switch statements for data input.
    To define a constant in Java
    To understand how to use the Character class.
    To understand iterative development.
    Interpret simple Java programs 

Today's quiz
You should create a new Java Project called Q7 and make a class named Q7.

Please see the screen for today's quiz over the material presented and worked on in the last presentation.
Java Programming
Create a new Java Project named R7 and make a class named R7.
Print a menu

    Define a constant MAXCOUNT of type int and set it to 20.
    Define a boolean goodString and initialize it to false.
    Instantiate a scanner.
    Print the following menu:

    0) Exit program
    1) Enter a string
    2) Count the number of uppercase letters
    3) Count the number of lowercase letters
    4) Count the number of digits
    5) Count the whitespace characters encountered

    Inside a while loop:
        Print "Enter an option: " leaving the cursor on the same line.
        Read in an option
        Using a switch statement, implement Options 2-5 with a print statement saying "Not implemented".
        Implement Option 0 
    Test your program. 

Implement entering a string.

    Replace the "Not implemented" statement with the following:
    Print "Enter a string: " putting the cursor on the next line.
    Read in the line of data into a single string.
    If the string is greater than MAXCOUNT, print an error.
    If the string is valid, set goodString to true.
    Test your program. 

Enter an option: 1
Enter a string:
There are 12 foxes that have taken up residence in the henhouse.
Two many characters in string.

Enter an option: 1
Enter a string:
There are 12 foxes.
String entered:
There are 12 foxes.

Enter an option: 0
Goodbye!

Implement a count of uppercase letters

    If goodString is still false, print an error.
    Replace the "Not implemented" statement with the following:
    Using a for loop, count the number of uppercase letters in the string.
    In the same for loop, print the uppercase letters encountered.
    Print the number of uppercase letters.
    Test your program. 

Enter an option: 2
String not entered yet.

Enter an option: 1
Enter a string:
There are 12 foxes.
String entered:
There are 12 foxes.

Enter an option: 2
Uppercase letters entered: T
Number of uppercase characters - 1

Enter an option: 0
Goodbye!

Implement a count of lowercase letters

    If goodString is still false, print an error.
    Replace the "Not implemented" statement with the following:
    Using a for loop, count the number of lowercase letters in the string.
    In the same for loop, print the lowercase letters encountered.
    Print the number of lowercase letters.
    Test your program. 

Enter an option: 3
String not entered yet.

Enter an option: 1
Enter a string:
There are 12 foxes.
String entered:
There are 12 foxes.

Enter an option: 3
Lowercase letters entered: herearefoxes
Number of lowercase characters - 12

Enter an option: 0
Goodbye!

Implement a count of digits

    If goodString is still false, print an error.
    Replace the "Not implemented" statement with the following:
    Using a for loop, count the number of digits in the string.
    In the same for loop, print the digits encountered.
    Print the number of lowercase letters.
    Test your program. 

Enter an option: 4
String not entered yet.

Enter an option: 1
Enter a string:
There are 12 foxes.
String entered:
There are 12 foxes.

Enter an option: 4
Digits entered: 12
Number of digits - 2

Enter an option: 0
Goodbye!

Implement a count of whitespace

    If goodString is still false, print an error.
    Replace the "Not implemented" statement with the following:
    Using a for loop, count the number of whitespace characters in the string.
    Print the number of lowercase letters.
    Test your program. 

Enter an option: 5
String not entered yet.

Enter an option: 1
Enter a string:
There are 12 foxes.
String entered:
There are 12 foxes.

Enter an option: 5
Number of whitespace characters - 3

Enter an option: 0
Goodbye!

Interpret Java
You will be given a sheet of paper with Java code on it and asked to interpret what that code does. Answer the questions, log into RamCT, and take the Interpretation exercise for R7. 
