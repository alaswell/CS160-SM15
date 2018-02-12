
import java.util.Scanner;	

public class Q4 {

	public static void main(String[] args) {
		Scanner infile = new Scanner(System.in);
		int age;
		double amountOne, amountTwo, total;
		String name;
		
		//Get the vars needed
		System.out.print( "Please enter your name: " );
		name = infile.nextLine();
		
		System.out.print( "Please enter your age: " );
		age = infile.nextInt();
		
		System.out.print( "Please enter the total for amount one: " );
		amountOne = infile.nextDouble();
		
		System.out.print( "Please enter the total for amount two: " );
		amountTwo = infile.nextDouble();
		
		//Add them together and apply tax
		total = (amountOne + amountTwo + ((amountOne + amountTwo)*.03));
		
		//print stuffs
		System.out.println();
		System.out.printf("%s (Age %d) - $%.2f", name, age, total);
		infile.close();
	}
}
