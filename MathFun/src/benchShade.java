//MathFun Assignment
//Author: alaswell
//Date: Jun 16, 2015
//Class: CS160
//Email: alaswell@cs.colostate.edu

import java.util.*;

public class benchShade {
	public static void main(String[] args) {
		boolean loop = true;
		while(true){
			Scanner infile2 = new Scanner(System.in);
			String yesOrNo;
			doMath();
			
			System.out.println("Would you like to compute another distance? (y/n)");
			yesOrNo = infile2.next();
			
			if(yesOrNo.equalsIgnoreCase("n"))
				System.exit(0);	
		}
	}

	public static void doMath() {
		Scanner infile = new Scanner(System.in);
		double height, theta, solution;

		System.out.print("Enter a height in meters: ");
		height = infile.nextDouble();

		System.out.print("Enter an angle in degress: ");
		theta = infile.nextDouble();

		solution = (height / Math.tan(theta));
		if(solution < 0){
			solution = solution*-1;
		}
		System.out.println( "Put the bench out " + solution + " meters.");
	}

}