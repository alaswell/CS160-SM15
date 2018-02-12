CS160: Foundations in Programming

The purpose of this lab is to write Java code over the following topics:

    Take today's quiz over the material in the last recitation
    Understand Java expressions
    Understand Java String methods
    Understand Java data input using a Java Scanner
    Practice Java data types and casting
    Interpret simple Java programs 

Today's quiz
You should create a new Java Project called Q2 and make a class named Q2.

Please see the screen for today's quiz over the material presented and worked on in the last presentation.
Java Programming
Create a new Java Project named R2A, and make a class named R2A. Your TA will help you to print out the values of the following mathematical expressions:

    12 + 7
    12 / 7
    12.0 / 7.0
    12.0 / 7
    12 % 7
    3 - 7 * 6
    (3 - 7) * 6
    0.1 + 0.2 - 0.3 

NOTE: Remember to use System.out.println( ) to print out the values of the expressions.

Initially you can use numeric constants in the print statements, but before you complete the program add the integer and double variables and use them in the computation. For example:

int var1 = 12;
int var2 = 7;
double var3 = 7.0;
double var4 = 12.0;

In a comment block at the bottom of your program, answer the following questions:

    Explain the difference (or lack of it) in the result of 12 / 7, 12.0 / 7.0 and 12.0 / 7.
    Explain the difference (or lack of it) in the result of 3 - 7 * 6 and (3 - 7) * 6.
    Explain the result of 0.1 + 0.2 - 0.3 

Simple String functions
Create a R2B project and class in Eclipse, and put the following code into the main method in R2B.java:

    Declare a new String variable and set it to your last name, followed by a comma and space, followed by your first name.
    The names should be capitalized and separated by a space.
    Call the following methods on the string, each in a separate print line:
        length() of the string
        indexOf() the comma character
        charAt() the first letter in the string
        charAt() the last letter in the string
        substring() containing the third up to (not including) the seventh characters
        toUpperCase() of the string
        toLowerCase() of the string 

Scanner, Types, and Casting
Your TA will help you add to R2B.java to do the following:

    Use a Scanner object to read an integer int x;.
    Use a Scanner object to read a floating-point value double d;.
    Type cast x to a byte value and store the result in byte b;.
    Type cast d to an int value and store the result in int y;.
    Display x, b, d, and y, clearly labeled.
    The floating-point value d should be formatted to two decimal places with a DecimalFormat object. 

Interpret Java
You will be given a sheet of paper with Java code on it and asked to interpret what that code does. Answer the questions, log into Canvas, and take the Interpretation exercise for R2. 
