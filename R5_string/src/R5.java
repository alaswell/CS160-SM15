// R5_string Assignment
// Author: alaswell
// Date: Jun 30, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.util.*;

public class R5 {

	public static void main(String[] args) {
		Scanner infile = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter a string: ");
			String s = infile.next();

			switch(s)
			{
			case "open":
				System.out.printf("Processing the %s command.\n", s);
				break;
			case "save":
				System.out.printf("Processing the %s command.\n", s);
				break;
			case "exit":
				System.out.printf("Processing the %s command.\n", s);
				System.exit(0);
				break;
			case "find":
				System.out.printf("Processing the %s command.\n", s);
				break;
			case "help":
				System.out.printf("Processing the %s command.\n", s);
				break;

			default:
				System.out.printf("Unknown command: %s\n", s);
				break;
			}
		}
	}

}
