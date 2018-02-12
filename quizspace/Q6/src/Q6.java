// Quiz: Q6
// Author: alaswell
// Date: Jul 2, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.util.Scanner;

// For this program, you do not have worry about illegal inputs 
// and you can assume that option 1 will be run before any other 
// option other than 0 - you do not have to check to see if the name 
// is valid before performing the operation)

public class Q6 {

	public static void main(String [] args){

		// Add your variables here
		String yourName = "";
	
	
		// Opens a variable of type Scanner
		Scanner input = new Scanner(System.in);

		// Prints the menu
		System.out.println("Welcome to the CS160 Quiz!\n");
		System.out.println("Please enter one of the following options:\n"
				+ "0) Exit\n"
				+ "1) Enter your name (first & last, two names only with a space between them)\n"
				+ "2) Print your first name\n"
				+ "3) Print your last name\n"
				+ "4) Print the number of characters in your name\n"
				+ "5) Print your initials");


		// Create a while loop for command processing
		while(true) {

			// After reading the menu prompts for user to enter an option
			System.out.print("\nEnter an option: ");

			// Read in an integer value
			int option = input.nextInt();
			input.nextLine(); // Consume extra line feed
			System.out.println();

			//Put switch statement below this comment
			switch(option)
			{
			case 0: 
				System.out.println("Goodbye!");
				System.exit(0);
				break;
				
			case 1:
				System.out.println("Please enter your name: ");
				yourName = input.nextLine();
				System.out.printf("Hello, %s.", yourName);
				System.out.println();
				break;
				
			case 2:
				System.out.printf("Your first name is: %s", yourName.subSequence(0, yourName.indexOf(' ')));
				System.out.println();
				break;
				
			case 3:
				System.out.printf("Your last name is: %s", yourName.subSequence((yourName.indexOf(' ') + 1), yourName.length()));
				System.out.println();
				break;
			
			case 4:
				System.out.printf("There are %d characters in your name.", yourName.length());
				System.out.println();
				break;
				
			case 5:
				System.out.printf("Your initials are: %S%S", yourName.charAt(0), yourName.charAt(yourName.indexOf(' ')+1));
				System.out.println();
				break;
				
			default:
				System.out.print("(error)");
					
			}
		}
	}
}