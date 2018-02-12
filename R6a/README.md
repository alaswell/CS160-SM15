CS160: Foundations in Programming

The purpose of this lab is to write Java code over the following topics:

    Take today's quiz over the material in the last recitation
    Understand for loops.
    Write a do while loop for a simple ATM.
    Read user input and error check.
    Manage flow of control with loops, switches, and conditionals.
    Interpret simple Java programs 

Today's quiz
You should create a new Java Project called Q6 and make a class named Q6.

Please see the screen for today's quiz over the material presented and worked on in the last presentation.
Java Programming
Create a new Java Project named R6 and make a class named R6. Write the following program from scratch by decomposing the problem into in the following phases, testing after each step:
Phase 1: Create the command menu and key variables:

    Create a new project and class called R6, and put all code in the main method.
    Declare and initialize a scanner to read input from the user.
    Declare a variable to keep track of the user's account balance, initialized to 1000.0.
    Print the welcome message and command menu shown below, you can copy and paste!
    Now test your program as shown in the sample output: 

	Welcome to the CS160 Simple ATM!
	--------------------
	0) Exit program
	1) Check balance
	2) Make a deposit or a set of deposits
	3) Withdraw money
        4) Compute interest
	--------------------
	

Phase 2: Implement a simple command processing loop:

    Prompt the user to enter a command by printing "Command? " with System.out.print().
    Read the command number from the console and store it in an integer.
    Implement a switch on the command number, for each user input as follows:

    When input is 0, print "Thanks for using the CS160 Simple ATM, goodbye!" and call System.exit(0).
    When input is 1, print "Your current balance is " and the current balance.
    When input is 2, print "How much are you depositing? ".
    When input is 3, print "How much are you withdrawing? ".
    When input is 4, print "What interest rate would you like to use?".

    For any other command number, print "Invalid command!".
    Put the entire command processing loop in a do { ... } while (boolean_expression) loop.
    NOTE: Why is the loop from the previous step not infinite?
    There should be a blank line printed after each command is executed.
    Now test your program as shown in the sample output: 

	Welcome to the CS160 Simple ATM!
	--------------------
	0) Exit program
	1) Check balance
	2) Make a deposit or a set of deposits
	3) Withdraw money
        4) Compute interest
	--------------------
	Command? 1 
	Your current balance is $1000.0.

	Command? 2 
	How much are you depositing?

	Command? 3 
	How much are you withdrawing? 

	Command? 4 
	What interest rate would you like to use?

	Command? 5 
	Invalid command!

	Command? 0
	Thanks for using the CS160 Simple ATM, goodbye!
	

Phase 3: Implement the deposit command:

    If command number is 2, use a while loop to collect a set of deposits.
    Use the scanner to read the deposit amount.
    If the deposit is less than zero, print "Invalid deposit amount!".
    Otherwise add the deposit amount to the current balance.
    Ask the user if they have another deposit.
    If the answer is yes, perform the loop again.
    If the answer is no, print the new balance.
    Now test your program as shown in the sample output. 

	Welcome to the CS160 Simple ATM!
	--------------------
	0) Exit program
	1) Check balance
	2) Make a deposit or a set of deposits
	3) Withdraw money
        4) Compute interest
	--------------------
	Command? 2
	How much are you depositing? 100
	Another deposit (y/n) ? y
	How much are you depositing? 200
	Another deposit (y/n) ? y
	How much are you depositing? 300
	Another deposit (y/n) ? n
	Your new balance is: $1600.00

	Command? 2
	How much are you depositing? -100
	Invalid deposit amount!
	Another deposit (y/n) ? y
	How much are you depositing? 100
	Another deposit (y/n) ? n
	Your new balance is: $1700.00

	Command? 0
	Thanks for using the CS160 Simple ATM, goodbye!
	

Phase 4: Implement the withdrawal command:

    If the command number is 3, use the scanner to read the withdrawal amount.
    If the withdrawal is less than zero, print "Invalid withdrawal amount!".
    If the withdrawal exceeds the balance, print "You cannot withdraw more than your bank balance, sorry!".
    Otherwise subtract the withdrawal amount from the current balance and print the balance.
    All dollar values should be formatted to 2 decimal places.
    Now test your program as shown in the sample output. 

	Welcome to the CS160 Simple ATM!
	--------------------
	0) Exit program
	1) Check balance
	2) Make a deposit or a set of deposits
	3) Withdraw money
        4) Compute interest
	--------------------
	Command? 3
	How much are you withdrawing? 500.01
	Your new balance is: $499.99

	Command? 3
	How much are you withdrawing? -100
	Invalid withdrawal amount!

	Command? 3
	How much are you withdrawing? 9999.99
	You cannot withdraw more than your bank balance, sorry!

	Command? 0
	Thanks for using the CS160 Simple ATM, goodbye!
	

Phase 5: Implement the compute interest command:

    If the command number is 4, use the scanner to read the interest rate as an integer.
    If the interest rate is less than 0 or greater than 100 print "Invalid interest rate!"
    Otherwise, using a for loop, compute the projected year's interest on the current balance compounded monthly.
    This is done by computing the monthly interest and adding it to the current balance each month for 12 months.
    The formula to compute monthly interest is: (balance * (RATE/100.))/12
    Print the projected balance after 12 months of interest is added.
    All dollar values should be formatted using printf to 2 decimal places.
    Now test your program as shown in the sample output. 

	Welcome to the CS160 Simple ATM!
	--------------------
	0) Exit program
	1) Check balance
	2) Make a deposit or a set of deposits
	3) Withdraw money
        4) Compute interest
	--------------------
	Command? 4
	What interest rate would you like to use? 0
	Projected balance is: $1000.00

	Command? 4
	What interest rate would you like to use? 1
	Projected balance is: $1010.05

	Command? 4
	What interest rate would you like to use? 4
	Projected balance is: $1040.74

	Command? 4
	What interest rate would you like to use? 101
	Invalid interest rate!

	Command? 0
	Thanks for using the CS160 Simple ATM, goodbye!
	

Interpret Java
You will be given a sheet of paper with Java code on it and asked to interpret what that code does. Answer the questions, log into RamCT, and take the Interpretation exercise for R6. 
