// Quiz: Q7
// Author: alaswell
// Date: Jul 7, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.util.Scanner;

/* For this program, you are required to check and make sure that
 * a name has been entered via option 1 and that you have entered
 * both a first and a last name. If not, you should loop and make
 * sure that you have entered a firstName and a lastName
 */

public class Q7 {
	public static void main(String [] args){

		// Declare your variables
		boolean haveTwoNames = false;
		int option = 0;
		String yourName = " ";
		String firstName = "firstName";
		String lastName = "lastName";

		// Open a variable of type Scanner
		Scanner input = new Scanner(System.in);

		// Prints the menu below.
		System.out.println("Welcome to the CS160 Quiz!\n");
		System.out.println("Please enter one of the following options:\n"
				+ "0) Exit\n"
				+ "1) Enter your name\n"
				+ "2) Compare names\n"
				+ "3) Compare names w/o case\n"
				+ "4) Compare length of names");

		// In a do while loop, do the options below
		do{
			System.out.print("\nEnter an option: ");
			// Read in an integer value
			option = input.nextInt();
			input.nextLine();

			//Add your logic here
			switch(option)
			{
			case 0: 
				System.out.println("Goodbye!");
				System.exit(0);
				break;

			case 1:
				do{
					System.out.print("Please enter your name: ");
					yourName = input.nextLine();
					yourName = yourName.trim();
					if((yourName.indexOf(' ') < 0) || (yourName.indexOf(' ') != yourName.lastIndexOf(' ')))
					{
						System.out.println("Sorry, you must enter two names.");
						System.out.println();
					}
					else
					{						
						firstName = yourName.substring(0, yourName.indexOf(' '));
						lastName = yourName.substring(yourName.indexOf(' ')+1);
						System.out.printf("Hello, %s.%n", yourName);
						haveTwoNames = true;
					}
				}while(!haveTwoNames);
				break;

			case 2:
				if(yourName == " ")
					System.out.println("You must enter a name first.");
				else
				{
					if(firstName.equals(lastName))
						System.out.printf("%s and %s are equal.%n", firstName, lastName);
					else
						System.out.printf("%s and %s are not equal.%n", firstName, lastName);
				}
				break;

			case 3:
				if(yourName == " ")
					System.out.println("You must enter a name first.");
				else
				{
					if(firstName.equalsIgnoreCase(lastName))
						System.out.printf("%s and %s are equal.%n", firstName, lastName);
					else
						System.out.printf("%s and %s are not equal.%n", firstName, lastName);
				}
				break;
			
			case 4:
				if(yourName == " ")
					System.out.println("You must enter a name first.");
				else
				{
					if(firstName.length() == lastName.length())
						System.out.printf("%s and %s are both %d characters long.%n", firstName, lastName, firstName.length());
					else
						System.out.printf("%s and %s are not the same length.%n", firstName, lastName);
				}
				break;

			default:
				System.out.print("(error)");

			}
		} while (option != 0);
		input.close();
	}
}