// P3 Assignment
// Author: alaswell
// Date: Jun 23, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		
		double grossSalary, interestIncome, capitalGains, totalIncome, 
			adjustedIncome, totalTax, stateTax, fifteenthPercentile, twentyfifthPercentile, twentyeighthPercentile;
		int numExemptions = 0;
		
		Scanner infile = new Scanner(System.in);
		
		System.out.print("Gross Salary: ");
		grossSalary = infile.nextDouble();
		
		System.out.print("Number of Exemptions: ");
		numExemptions = infile.nextInt();
		
		System.out.print("Interest Income: ");
		interestIncome = infile.nextDouble();
		
		System.out.print("Capital Gains: ");
		capitalGains = infile.nextDouble();
		
		totalIncome = grossSalary + interestIncome + capitalGains;
		System.out.printf("Total Income: $%,.2f\n", totalIncome);
		
		adjustedIncome = totalIncome - (numExemptions * 1500.00); 
		System.out.printf("Adjusted Income: $%,.2f\n", adjustedIncome);
		
		//Computing tax totals
		if(totalIncome > 54000) {
			twentyeighthPercentile = .28 * (adjustedIncome - 54000);
			twentyfifthPercentile = .25 * 26000;
			fifteenthPercentile = .15 * 18000;
			totalTax = twentyeighthPercentile + twentyfifthPercentile + fifteenthPercentile;
		}
		else if(totalIncome > 28000) {
			twentyeighthPercentile = 0;
			twentyfifthPercentile = .25 * (adjustedIncome - 26000);
			fifteenthPercentile = .15 * 18000;
			totalTax = twentyfifthPercentile + fifteenthPercentile;
		}
		else if(totalIncome > 10000) {
			twentyeighthPercentile = 0;
			twentyfifthPercentile = 0;
			fifteenthPercentile = .15 * (adjustedIncome - 18000);
			totalTax = fifteenthPercentile;
		}
		else {
			twentyeighthPercentile = 0;
			twentyfifthPercentile = 0;
			fifteenthPercentile = 0;
			totalTax = 0;
		}
		stateTax = adjustedIncome * 0.05;
		
		System.out.printf("Total tax: $%,.2f\n", totalTax);
		System.out.printf("State tax: $%,.2f\n", stateTax);
	}

}
