// P6 Assignment
// Author: Russ Wakefield
// Date:   Jul 20, 2015
// Class:  CS160
// Email:  waker@cs.colostate.edu
public interface P6Interface {

	/*
	 * Method: computeFibon
	 * precondition: 0 <= n <= 100
	 * postcondition: if n is zero, returns null
	 * postcondition: if n > 0, creates an array of size n and
	 * 			fills and returns an array with the first n numbers of the
	 * 			fibonacci sequence starting with 0. 
	 * 			(i.e. 0, 1, 1, 2, 3, 5, 8, ...)
	 */
	public int[] computeFibon(int n);

	/*
	 * Method: computeSquares
	 * precondition: 0 <= n <= 100
	 * postcondition: if n is zero, returns null
	 * postcondition: if n > 0, creates an array of size n and fills 
	 * and returns an array with the first n squares starting with 1.
	 * 			(i.e. 1, 4, 9, 16, ...)
	 */
	public int[] computeSquares(int n);

	/*
	 * Method: computeSumOfOdds
	 * precondition: 0 <= n <= 100
	 * postcondition: if n is zero, returns null
	 * postcondition: if n > 0, creates an array of size n and fills 
	 * 			and returns an array with the sum of the first n odd numbers 
	 * 			(i.e. a[0] = 1, a[1] = 3 + 1, a[2] = 5 + 3 + 1,..)
	 */
	public int[] computeSumOfOdds(int n);

	/*
	 * Method: compareArrays
	 * precondition: 2 integer arrays
	 * postcondition: if either array is null, return false
	 * postcondition: returns true if the arrays are equal (same values), 
	 * 			otherwise false
	 * 			
	 */
	public boolean compareArrays(int[] a, int[] b);

	/*
	 * Method: computeArraySum
	 * precondition: two arrays declared as ints
	 * postcondition: if either array reference is null, return null
	 * postcondition: if arrays are different sizes, return null
	 * postcondition: creates and returns an array that is the sum  of the
	 * 	two arguments
	 */
	public int[] computeArraySum(int[] a, int[] b);

}
