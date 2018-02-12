// M1 Assignment
// Author: Your name here
// Date:   7/9/2015
// Class:  CS160
// Email:  yourEmail@cs.colostate.edu

import java.util.Scanner;

public class M1 {

	// Declares a named constant called PI set to 3.14159 (double)
	public static final double PI = 3.14159;

	public static void main(String[] args){

		// Variable declarations here
		int option = 0;
		int index = 0;
		int count = 0;
		boolean validIndex = false;
		double radius, diameter;
		String someUserString = "";
		String someChar = "";
		String tempStringA, tempStringB;
		char tempChar;
		
		// Opens a variable of type Scanner
		Scanner input = new Scanner(System.in);

		// Print the menu below. 

		System.out.println("Welcome to the CS160 Quiz!\n");
		System.out.println("Please enter one of the following options:\n"
				+ "0) Exit\n"
				+ "1) Compute the area of a circle (PI*r*r)\n"
				+ "2) Compute the circumference of a circle (PI*d)\n"
				+ "3) Enter a string to be inspected.\n"
				+ "4) Print the letter at a specific index\n"
				+ "5) Print the first occurrence of a letter\n"
				+ "6) Print the string with a letter removed\n"
				+ "7) Count the number of digits in the string");

		// Write a switch statement to handle the options below.
		while(true){

			System.out.print("\nEnter an option: ");
			// Read in an integer value
			option = input.nextInt();
			input.nextLine();

			/* 
			 * Add your logic here
			 */
			switch(option)
			{
			case 0: 
				System.out.print("Goodbye!");
				System.exit(0);
				break;

			case 1:
				System.out.print("Enter the radius of the circle: ");
				radius = input.nextDouble();
				System.out.printf("The area of a circle is: %.2f%n", (PI*radius*radius));
				break;

			case 2:
				System.out.print("Enter the diameter of the circle: ");
				diameter = input.nextDouble();
				System.out.printf("The circumference of a circle is: %.2f%n", (PI*diameter));
				break;

			case 3:
				System.out.println("Enter the string to be inspected.");
				someUserString = input.nextLine();
				System.out.println("You entered:");
				System.out.println(someUserString);
				break;

			case 4:
				if(someUserString == "")
					System.out.println("You must enter a string to be inspected first.");
				else
				{
					do
					{
						System.out.print("Enter an index: ");
						index = input.nextInt();
						input.nextLine();
						if(index < someUserString.length())
						{
							System.out.printf("The character at index %d is: %c%n", index, someUserString.charAt(index));
							validIndex = true;
						}
						else
							System.out.println("Not a valid index.");
					}while(!validIndex);
				}
				break;

			case 5:
				if(someUserString == "")
					System.out.println("You must enter a string to be inspected first.");
				else
				{
					System.out.print("What letter would you like me to search for: ");
					someChar = input.next();
					if(!someUserString.contains(someChar))
					{
						System.out.printf("The letter %s does not occur in the string:%n", someChar);
						System.out.println(someUserString);
					}
					else
					{
						System.out.printf("The index of the first occurrence of the letter %s is %d.%n", someChar, someUserString.indexOf(someChar));
					}
				}
				break;

			case 6:
				if(someUserString == "")
					System.out.println("You must enter a string to be inspected first.");
				else
				{
					System.out.print("What letter would you like to remove: ");
					someChar = input.next();
					for(int i = 0; i < someUserString.length(); i++)
					{
						char x = someUserString.charAt(i);
						char y = someChar.charAt(0);
						if(x == y)
						{
							tempStringA = someUserString.substring(0, i);
							tempStringB = someUserString.substring(i+1);
							tempStringA.concat(tempStringB);
							someUserString = tempStringA + tempStringB;
						}
						/*String newString = "";
						for(int i = 0; i < string.length(); i++)
						{
							char c = string.charAt(i);
							if( Character.isLetterOrDigit(c) 
									|| Character.isWhitespace(c) )
									newString += c;
						}*/
					}
					System.out.println("The new string is:");
					System.out.println(someUserString);
				}
				break;
				
			case 7:
				if(someUserString == "")
					System.out.println("You must enter a string to be inspected first.");
				else
				{
					for(int i = 0; i < someUserString.length(); i++)
					{
						if(Character.isDigit(someUserString.charAt(i)))
						{
							++count;
						}

					}
					System.out.printf("The number of digits in the string is %d.", count);
					System.out.println("");
					count = 0;
				}
				break;



			default:
				System.out.print("This is not a valid option. Enter an integer between 0-7");
				System.out.println();
			}
		}
	}
}
