// R14 Assignment
// Author: alaswell
// Date: Jul 30, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu
import java.util.*;
import java.io.*;

public class R14 {

	public static void main(String[] args) {
		R14 r = new R14();
		
		r.readFile(args[0]);
		r.writeFile(args[1]);
	}
	
	public void readFile( String inputFile ){ 
		try {
			Scanner infile = new Scanner(new File(inputFile));
			
			while(infile.hasNext())
			{
				if(infile.hasNextInt())
					System.out.printf("Integer: %s%n", infile.nextInt());
				else if(infile.hasNextDouble())
					System.out.println("Double: " + infile.nextDouble());
				else
					System.out.println("String: " + infile.next());
			}
			infile.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("Could not find the input file: " + inputFile);
		}
	}

	public void writeFile( String outputFile ){ 
		try {
			PrintWriter outfile = new PrintWriter(new File(outputFile));
			Scanner keyboard = new Scanner(System.in);
			Boolean stop = false;
			
			System.out.println("Enter something to write to the file, when you are finished write stop");
			
			do{
				String nextString = keyboard.nextLine();
				
				if(nextString.toLowerCase().compareTo("stop") != 0)
					outfile.println(nextString);
				else
					stop = true;
				
			}while(!stop);
			outfile.close();
			keyboard.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("Could not open " + outputFile + " for writing.");
		}
	}


}
