// R7 Assignment
// Author: alaswell
// Date: Jul 7, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.util.Scanner;

public class R7 {
	public static final int MAXCOUNT = 20;

	public static void main(String[] args) {
		boolean goodString = false;
		int option;
		int upperChars = 0;
		int digits = 0;
		int whitespace = 0;
		String userString = "";
		Scanner infile = new Scanner(System.in);

		// Prints the menu below.
		System.out.println("0) Exit program\n" + "1) Enter your string\n"
				+ "2) Count the number of uppercase letters\n"
				+ "3) Count the number of lowercase letters\n"
				+ "4) Count the number of digits\n"
				+ "5) Count the whitespace characyters encountered");
		while (true) {
			System.out.print("\nEnter an option: ");
			// Read in an integer value
			option = infile.nextInt();
			infile.nextLine();

			// Add your logic here
			switch (option) {
			case 0:
				System.out.println("Goodbye!");
				System.exit(0);
				break;

			case 1:
				System.out.println("Enter a string: ");
				userString = infile.nextLine();
				if (userString.length() > MAXCOUNT) {
					System.out.println("Too many characters in string.");
				} else {
					goodString = true;
					System.out.println("String entered: ");
					System.out.println(userString);
				}
				break;

			case 2:
				if (goodString == false)
					System.out.println("String not entered yet.");
				else {
					System.out.print("Uppercase letters entered: ");
					for (int i = 0; i < userString.length(); i++) {
						if (Character.isUpperCase(userString.charAt(i))) {
							upperChars++;
							System.out.print(userString.charAt(i));
						}
					}
					System.out.print("\n");
					System.out.printf("Number of uppercase characters - %d\n",
							upperChars);
				}
				break;

			case 3:
				if (goodString == false)
					System.out.println("String not entered yet.");
				else {
					System.out.print("Lowercase letters entered: ");
					for (int i = 0; i < userString.length(); i++) {
						if (Character.isLowerCase(userString.charAt(i))) {
							upperChars++;
							System.out.print(userString.charAt(i));
						}
					}
					System.out.print("\n");
					System.out.printf("Number of lowercase characters - %d\n",
							upperChars);
				}
				break;

			case 4:
				if (goodString == false)
					System.out.println("String not entered yet.");
				else {
					System.out.print("Digits entered: ");
					for (int i = 0; i < userString.length(); i++) {
						if (Character.isDigit(userString.charAt(i))) {
							digits++;
							System.out.print(userString.charAt(i));
						}
					}
					System.out.print("\n");
					System.out.printf("Number of digits - %d\n", digits);
				}
				break;

			case 5:
				if (goodString == false)
					System.out.println("String not entered yet.");
				else {
					for (int i = 0; i < userString.length(); i++) {
						if (Character.isWhitespace(userString.charAt(i))) {
							whitespace++;
						}
					}
					System.out.printf("Number of whitespace characters - %d\n",
							whitespace);
				}
				break;

			default:
				System.out
						.print("I do not understand that option, please try again.\n");
			}
		}
	}
}
