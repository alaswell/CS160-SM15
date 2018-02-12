
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner infile = new Scanner(System.in);
		
		int over100 = 0;
		int under100 = 0;
		int number;
		
		for(int i = 1; i < 5; i++)
		{
			//Get the numbers
			System.out.print( "Please enter a number: " );
			number = infile.nextInt();
			
			//add to appropriate var
			if(number < 100)
				under100 = under100 + number;
			else over100 = over100 + number;
		}
		
		System.out.println();
		System.out.printf("Numbers less than 100 total - %d.\n", under100);
		System.out.printf("Numbers greater than 100 total - %d.\n", over100);
		
	}

}
