// R3 Assignment
// Author: alaswell
// Date: Jun 23, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.util.Scanner;

public class R3 {

	public static void main(String[] args) {
		Scanner infile = new Scanner(System.in);
		
		String first, last, month, dateToday, dayOfMonth;
		int year, day = 0;
		double bankBalance = 0;
		
		System.out.print("Enter your First and Last name: ");
		first = infile.next();
		last = infile.next();
		
		System.out.print("Enter the MONTH of your birth: ");
		month = infile.next();
		
		System.out.print("Enter the DAY of your birth: ");
		day = infile.nextInt();
		
		System.out.print("Enter the YEAR of your birth: ");
		year = infile.nextInt();
		
		System.out.printf("%s %s was born on %s %d, %d.\n", first, last, month, day, year);
		System.out.printf("%s's first name has %s characters in it.\n", first, first.length());
		System.out.printf("%s's last name has %s characters in it.\n", first, last.length());
		System.out.printf("His initials are %c%c\n", first.charAt(0), last.charAt(0));
		
		System.out.println();
		System.out.print("Enter your bank balance: ");
		bankBalance = infile.nextDouble();
		System.out.print("Enter the date mm/dd/yyyy ");
		dateToday = infile.next();
		dayOfMonth = dateToday.substring((dateToday.indexOf('/') + 1), dateToday.lastIndexOf('/'));
		System.out.printf("The bank balance for %s %s on %sth of this month is $%,8.2f.\n", first, last, dayOfMonth, bankBalance);
		
		
		/*
		int i = infile.nextInt();
		System.out.println("i = " + i);
		
		Sample for loop
		int j = 0;
		while(j<i) {
			System.out.printf("Hello World! %d\n", j);
			++j; //this is necessary or the loop would go forever
		}*/
		
		/* Sample counter from input
		int sum = 0;
		while(infile.hasNextInt()){
			sum = sum + infile.nextInt();
			System.out.printf("Sum = %d\n", sum);
		}
		System.out.print("done");*/

	}

}
