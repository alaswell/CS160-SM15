// R4 Assignment
// Author: alaswell
// Date: Jun 25, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.util.*;
public class R4 {

	public static void main(String[] args) {
		Scanner infile = new Scanner(System.in);

		int numOne;

		System.out.print( "Please enter a number: " );
		numOne = infile.nextInt();

		if(numOne < 0) {
			System.out.printf("Negative number: %d\n", numOne);
			numOne = numOne*-1;
		}
		else {
			System.out.printf("Positive number: %d\n", numOne);
		}
		System.out.printf("Absolute value: %d\n", numOne);
		infile.close();
	}	
}
