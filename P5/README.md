 CS 160, Summer 2015
Programming Assignment P5
Methods and Classes

Programming due Monday, July 20 at noon; late deadline July 20 at 10 p.m.
How to write a class that implements math formulas
This lab has the goal of teaching you how to:

    Add a set of utility methods to the P5 class.
    Instantiate an object of type P5 within the main method.
    Call the methods in the object from the main method.
    Practice implementing math formulas.
    Understand enumerations in Java. 

Description
The purpose of the class is to write a Java class that implements mathematical formulas to:

    Compute the length of a hypotenuse of a triangle, given the lengths of the opposite and adjacent sides
    Solve for the positive root of a quadratic equation
    Convert Celsius temperatures to Fahrenheit and vice versa
    Compute the perimeter and area of a circle. 

Instructions
Create a project and class called P5. Copy the provided P5.java, which is available from here. Note the enumeration definitions in the class that are above the main method, as follows:

// Operation enumeration
public enum eOperation { PERIMETER, AREA }

// Conversion enumeration
public enum eScale { CELSIUSFAHRENHEIT, FAHRENHEITCELSIUS }

Implement the following methods below the main method, exactly as defined below:

public double computeHypotenuse(double adjacent, double opposite);

public double solveQuadratic(double a, double b, double c);

public double convertTemperature(eScale scale, double degrees);

public double geometryCircle(eOperation op, double radius);

Specifications
The following pre-conditions and post-conditions must be followed:

    For computeHypotenuse, the adjacent and opposite lengths must be positive, and the return value must be the length of the hypotenuse computed using Pythagorean's Theorem.
    For solveQuadratic, the coefficients can have any values, and the return value must be the largest of the two roots computed using the Quadratic Formula. Do not worry about the argument to the square root being negative. You may use the Math.sqrt method in the Java Math package to implement this method.
    For convertTemperature, the type of conversion is specified by the eScale enumeration, and the input can have any value. The return value must be the correct number of degrees in the scale specified by eScale.
    For geometryCircle, the radius must be positive, and the type of operation is specified by the eOperation enumeration. The return value is the area or perimeter of the circle, as specified by eOperation. Use the Math.PI constant as the value of PI. 

And please follow the usual rules for submitting Java programs.

    Work on your own.
    The name of the source code file must be exactly P5.java
    Comments at the top with your name, e-Name, date and course.
    Submit the P5.java source file, not the P5.class file.
    We expect programming assignments to be implemented in Eclipse using Java 1.7.
    We will be testing the code on the machines in the CS computer lab, so make sure your code runs on those machines.
    We will be checking programs for plagiarism, so please don't copy from anyone else. 

Testing
You should test your code with (at least) the values given in the main method of P5.java. The expected output is as follows:

Hypotenuse = 5.0000
Quadratic - Larger root = 2.5811
212.0 Fahrenheit = 100.0000 Celsius
0.0 Celsius = 32.0000 Fahrenheit
Perimeter of circle with radius 3.0 = 18.8496
Area of circle with radius 3.0 = 28.2743

Grading Criteria
NOTE: We will test your program with different data than is shown above!

    1st test - compiling.
    2nd test - computes correct hypotenuse.
    3rd test - computes correct quadratic solution.
    4th test - converts Fahrenheit to Celsius correctly.
    5th test - converts Celsius to Fahrenheit correctly.
    6th test - computes perimeter correctly.
    7th test - computes area correctly. 

Submission
Submit your modified source file P5.java to the test server. 
