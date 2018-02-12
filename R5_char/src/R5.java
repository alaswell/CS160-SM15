// R5_char Assignment
// Author: alaswell
// Date: Jun 30, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.util.*;

public class R5 {

	public static void main(String[] args) {
		Scanner infile = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String s = infile.next();
		char a = (s.charAt(0));

		switch(a)
		{
		case '+': 
			System.out.printf("%c is the addition operator.\n", a);
			break;
		case '-':
			System.out.printf("%c is the subtraction operator.\n", a);
			break;
		case '*':
			System.out.printf("%c is the multiplication operator.\n", a);
			break;
		case '/':
			System.out.printf("%c is the division operator.\n", a);
			break;
		case '%':
			System.out.printf("%c is the modulus operator.\n", a);
			break;
		case '&':
			System.out.printf("%c is the binary AND operator.\n", a);
			break;
		case '|':
			System.out.printf("%c is the binary OR operator.\n", a);
			break;
		
		default: 
			System.out.printf("Not sure if %c is an operator.", a);
		}
	}

}
