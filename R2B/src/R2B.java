// R2B Assignment
// Author: alaswell
// Date: Jun 18, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.util.Scanner;
import java.text.DecimalFormat;

public class R2B {

	public static void main(String[] args) {
		Scanner infile = new Scanner(System.in);
		String name = "Laswell, Alex";
		int x, y = 0;
		double d = 0.0;
		byte b = 0;
		
		
		System.out.println( "The length of name is " + name.length());
		System.out.println( "The comma is at index " + name.indexOf(','));
		System.out.println( "The first letter is " + name.charAt(0));
		System.out.println( "The last letter is " + name.charAt(name.length()-1));
		System.out.println( "Sub-string 3-6 is " + name.substring(3,7));
		System.out.println( "TOUPPER: " + name.toUpperCase());
		System.out.println( "tolower: " + name.toLowerCase());

		System.out.println( "Please enter an INTEGER: ");
		x = infile.nextInt();
		System.out.println( "x is equal to " + x);
		
		System.out.println( "Please enter an DOUBLE: ");
		d = infile.nextDouble();
		System.out.println( "d is equal to " + d);
		
		b = (byte)x;
		System.out.println( "b is equal to " + b);
		
		y = (int)d;
		System.out.println( "y is equal to " + y);
		
		//Cole:
		//int i = infile.nextInt();
		//double d = infile.nextDouble();
		
		//int works = (int)d;
		
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("Formatted version of d: " + df.format(d));
		
		
	}

}
