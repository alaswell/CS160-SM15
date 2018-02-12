// Additional methods to learn to test your own code.
// Author: Russ Wakefield
// Date:   Jul 28, 2015
// Class:  CS160
// Email:  waker@cs.colostate.edu

public interface R13Interface {


	/*  Method: reverseArray
	 *  Precondition: none
	 *  Postcondition: If array is null, print a blank line and return
	 *  Postcondition: Reverse the characters in the input array 
	 *  Example: "W e l c o m e   f r i e n d" => "d n e i r f   e m o c l e W "	*/
	public void reverseArray(char[] array);


	/*  Method: shortestDistance
	 *  Precondition: none
	 *  Postcondition: If array is null or array size is 0 or 1, return -1
	 *  Postcondition: Return value is index of the first of the two indices whose values contain 
	 *  				the minimum absolute distance to its neighbor.
	 *  Postcondition: If there is more than one set of numbers return the index of the first 
	 *  				number in the first pair.
	 *  Example: For the array: { 32 67 21 5 18 83 61 12 25 100 }
	 *			The index for the pair of numbers with the shortest distance is: 3				
	 */
	public int shortestDistance(int[] numbers);
	
	/*  Method: 	   averageDiagonal
	 *  Precondition:  If not null, the number of rows is equal to the number of columns
	 *  Precondition:  Any values in myMatrix are positive integers.
	 *  Postcondition: Return the average of the values on the 
	 *				   diagonal from the upper left hand corner
	 *			       to the lower right hand corner.		
	 *					(Ex. numbers[0][0] + numbers[1][1]... /numbers.length)
	 *  Postcondition if myMatrix is null, return -1.
	 */
	public int averageDiagonal(int[][] myMatrix);

}
