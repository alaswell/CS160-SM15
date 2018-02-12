// R2A Assignment
// Author: alaswell
// Date: Jun 18, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

public class R2A {

	public static void main(String[] args) {
		int numOne = 12;
		int numTwo = 7;
		int numThree = 3;
		int numFour = 6;
		int wholeOne = numOne + numTwo;
		int wholeTwo = numOne / numTwo;
		int wholeThree = numThree - numTwo * numFour;
		int wholeFour = (numThree - numTwo) * numFour;
		
		double doubleOne = 12.0;
		double doubleTwo = 7.0;
		double doubleThree = 0.1;
		double doubleFour = 0.2;
		double doubleFive = 0.3;
		double dblAnsOne = doubleOne / doubleTwo;
		double dblAnsTwo = doubleOne / numTwo;
		double dblAnsThree = numOne % numTwo;
		double dblAnsFour = doubleThree + doubleFour - doubleFive;
		
		
		System.out.println( numOne + " + " + numTwo + " = " + wholeOne );
		System.out.println( numOne + " / " + numTwo + " = " + wholeTwo );
		System.out.println( doubleOne + " / " + doubleTwo + " = " + dblAnsOne );
		System.out.println( doubleOne + " / " + numTwo + " = " + dblAnsTwo );
		System.out.println( numOne + " % " + numTwo + " = " + dblAnsThree );
		System.out.println( numThree + " - " + numTwo + " * " + numFour + " = " + wholeThree );
		System.out.println( "(" + numThree + " - " + numTwo + ")" + " * " + numFour + " = " + wholeFour );
		System.out.println( doubleThree + " + " + doubleFour + " - " + doubleFive + " = " + dblAnsFour );
		
		System.out.println("12 + 7 = " + (12 + 7)); //this also works
		System.out.println("12 / 7 = " + (12 / 7));
		System.out.println("12.0 / 7.0 = " + (12.0 / 7.0));
		//....etc
	}
	


}
