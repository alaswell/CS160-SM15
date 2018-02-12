 CS 160, Summer 2015
Programming Assignment P3
Tax Computation

Programming due Monday, June 29 at noon; late deadline June 29 at 10 p.m.
A Program for Computing Taxes
This programming assignment has five objectives:

    to teach you to read input from the keyboard,
    to use Java expressions involving integers and real numbers,
    to use conditional (if/else) statements in Java,
    to print formatted output,
    to see if you can follow a specification exactly! 

Description
The program allows the user to input some of the information that normally appears on a tax form, then it calculates a tax bill according to the formulas described below. WARNING: Be aware that the tax computation shown here is greatly simplified and should not be used for calculation of your real taxes!

Instructions
For this assignment, you must follow directions exactly. Create a P3 project in Eclipse then write a class P3 with a main method, and put all of the following code into the main method:

    Instantiate a single Scanner object to read console input.
    Print the prompt shown below and ask the user for their gross salary.
    The gross salary represents dollars, which can be entered with or without decimal points.
    Print the prompt shown below and ask the user for the number of exemptions.
    The number of exemptions is an integer.
    Print the prompt shown below and ask the user for their interest income.
    The interest income represents dollars, which can be entered with or without decimal points.
    Print the prompt shown below and ask the user for their capital gains income.
    The capital gains represents dollars, which can be entered with or without decimal points.
    Perform the calculation of federal total income, as shown in the Formula section.
    Perform the calculation of the federal adjusted income, as shown in the Formula section.
    Perform the calculation of the federal total tax, as shown in the Formula section.
    Perform the calculation of the state income tax, as shown in the Formula section.
    Print out the total income, adjusted income, total tax, and state tax, with the commas shown.
    The example below shows five lines of user input, with prompts, followed by four lines of program output: 

Gross Salary: 65324.65
Number of Exemptions: 3
Interest Income: 987.34
Capital Gains: 729.73
Total Income: $67,041.72
Adjusted Income: $62,541.72
Total Tax: $11,591.68
State Tax: $3,127.09

Formulas
Total Income = Gross Salary + Interest Income + Capital Gains
Adjusted Income = Total Income - (Number of Exemptions * 1500.00)
Total Tax computation:

    0% on Adjusted Income above $0 and up to $10,000 +
    15% on Adjusted Income above $10,000 and up to $28,000 +
    25% on Adjusted Income above $28,000 and up to $54,000 +
    28% of Adjusted Income above $54,000

For the example above, we compute the Total Tax in the example above as follows:

15% * (28,000.00-10,000.00) = 2,700.00
25% * (54,000.00-28,000.00) = 6,500.00
28% * (62,541.72-54,000.00) = 2,391.68

Adding up the above we get a Total Tax of $11,591.68 that's a a chunk of change! You can see the results of our other computations in output shown above.

State Tax = Adjusted Income * 0.05
Specifications
Your program must meet the following specifications:

    You may use integer or floating point for the computations.
    The output should always report exactly 2 digits after the decimal.
    Your program should be accurate to within $0.01.
    Use variables to store everything, don't try to do all the calculation in a print statement!
    Do not hard code values, we will test your program with different values.
    You do not need to handle a negative adjusted income!
    Work on your own, as always.
    The name of the source code file must be exactly P3.java.
    Name the file exactly - upper and lower case matters!
    Don't forget the comment block at the top of the program.
    Assignments should be implemented using Eclipse.
    Assignments should be implemented using Java 1.7.
    Make sure your code runs on machines in the COMCS 120 lab.
    Submit your program to the Checkin tab as you were shown in the recitation.
    Read the syllabus for the late policy.
    We will be checking programs for plagiarism, so please don't copy from anyone else. 

Grading Criteria

    100 points for perfect submission.
    0 points for no submission, will not compile, submitted class file, etc.
    Preliminary Tests
        compileTest: checks that program compiles. (20 points)
        test1: checks prompt for gross salary. (5 points)
        test2: checks prompt for number of exemptions. (5 points)
        test3: checks prompt for interest income. (5 points)
        test4: checks prompt for capital gains. (5 points)
        test5: checks output of total income, including label. (10 points)
        test6: checks output of adjusted income, including label. (10 points) 
    Final Tests
        test7: checks label on output of total tax. (4 points)
        test8: checks output of total tax, using the income shown. (8 points)
        test9: checks output of total tax, using another income. (8 points)
        test10: checks label on output of state tax. (4 points)
        test11: checks output of state tax, using the income shown. (8 points)
        test12: checks output of state tax, using another income. (8 points) 
    Preliminary testing does not check total or state tax, but you should do this manually!
    Final grading includes the preliminary tests. 

Submit your program to the Checkin tab on the course website, as you were shown in the recitation, and read the syllabus for the late policy (if necessary).

