// R6a Assignment
// Author: alaswell
// Date: Jul 2, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.util.*;

public class R6 {

	public static void main(String[] args) {

		Scanner infile = new Scanner(System.in);

		int option;
		double numberOne, balance = 1000;

		System.out.println("Welcome to the CS160 Simple ATM!");
		System.out.println("--------------------");
		System.out.println("0) Exit program");
		System.out.println("1) Check balance");
		System.out.println("2) Make a deposit or a set of deposits");
		System.out.println("3) Withdraw money");
		System.out.println("4) Compute interest");
		System.out.println("--------------------");

		do {
			System.out.println("Command? ");
			option = infile.nextInt();

			switch(option){

			case 0:
				System.out.println("Thanks for using the CS160 Simple ATM, goodbye!");
				System.exit(0);
				break;

			case 1:
				System.out.printf("Your current balance is $%.2f.%n", balance);
				System.out.println();
				break;

			case 2:
				while(true) {

					System.out.print("How much are you depositing? ");
					double deposit = infile.nextDouble();
					if(deposit < 0)
						System.out.println("Invalid deposit amount!");
					else
						balance += deposit;
					System.out.print("Another depost (y/n) ? ");
					String yesOrNo = infile.next();
					if(yesOrNo.charAt(0) == 'n')
						break;
				}
				System.out.printf("Your new balance is $%.2f.%n", balance);
				System.out.println();
				break;
				
			case 3:
				while(true) {

					System.out.print("How much are you withdrawing? ");
					double withdrawl = infile.nextDouble();
					if(withdrawl < 0)
						System.out.println("Invalid withdrawl amount!");
					else if(withdrawl > balance)
						System.out.println("You cannot withdrawl more than your bank balance, sorry!");
					else
						balance -= withdrawl;
					System.out.print("Another withdrawl (y/n) ? ");
					String yesOrNo = infile.next();
					if(yesOrNo.charAt(0) == 'n')
						break;
				}
				System.out.printf("Your new balance is $%.2f.%n", balance);
				System.out.println();
				break;

			case 4:
				System.out.printf("What interest rate would you like to use?", balance);
				System.out.println();
				break;

			default:
				System.out.println("Invalid command!");
			} 
		}while(true);

	}

}
