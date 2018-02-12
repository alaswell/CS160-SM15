// R5 Assignment
// Author: alaswell
// Date: Jun 30, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.util.*;

public class R5 {

	public static void main(String[] args) {
		Scanner infile = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = infile.nextInt();
		
		switch(number)
		{
		case 1: 
			System.out.printf("%d is not a prime number.", number);
			break;
		case 2:
			System.out.printf("%d is  a prime number.", number);
			break;
		case 3:
			System.out.printf("%d is a prime number.", number);
			break;
		case 4:
			System.out.printf("%d is not a prime number.", number);
			break;
		case 5:
			System.out.printf("%d is a prime number.", number);
			break;
		case 6:
			System.out.printf("%d is not a prime number.", number);
			break;
		case 7:
			System.out.printf("%d is a prime number.", number);
			break;
		case 8:
			System.out.printf("%d is not a prime number.", number);
			break;
		case 9:
			System.out.printf("%d is not a prime number.", number);
			break;
		case 10:
			System.out.printf("%d is not a prime number.", number);
			break;
		default: 
			System.out.printf("%d may or may not be prime.", number);
		}

	}

}
