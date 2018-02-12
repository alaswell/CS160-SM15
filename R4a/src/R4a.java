// R4a Assignment
// Author: alaswell
// Date: Jun 25, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.util.Scanner;

public class R4a {

	public static void main(String[] args) {
		boolean loop = true;
		while(loop){
			Scanner infile = new Scanner(System.in);

			double salary, taxes;

			System.out.print("Enter a double: ");
			salary = infile.nextDouble();
			
			if(salary == .0123456789){
				loop = false;
			}
			//Computing tax totals
			if(salary >= 100000) {
				taxes = 200000;
			}
			else if(salary >= 50000) {
				taxes = salary * .28;
			}
			else if(salary >= 10000) {
				taxes = salary * .23;
			}
			else if(salary >= 1000) {
				taxes = salary * .15;
			}
			else taxes = salary * .28;
			System.out.printf("Taxes: $%,.2f\n", taxes);
		}
	}
}
