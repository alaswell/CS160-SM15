// Q12 Quiz Interface
// Author: Gareth Halladay
// Date:   Jul 21, 2014
// Class:  CS160
// Email:  gareth@rams.colostate.edu

public interface Q12Interface {

	/*
	 * Method: fillArray
	 *
	 * Precondition: the method accepts a non-null String variable as an argument
	 * Postcondition: Return a char array that has been filled from the string 
	 * 				passed to the method, each element set to the corresponding
	 * 				character in the string. 
	 * 		(i.e. result[0] = the character at index 0 in the string)
	 */
	public char[] fillArray(String var);

	
	/*
	 * Method: printArray
	 * Precondition: the method accepts an array of chars as an argument
	 * Postcondition: if array is null, print "The array has not been created.", 
	 * Postcondition: if the array is not null, print the array with 1 
	 * 		space between each character.
 	 *
	 * Example:  The array {'W','e','l','l',' ','d','o','n','e', '!'} prints:
	 * 
	 *   		W e l l   d o n e !
	 * 
	 */
	public void printArray(char[] array);

}
