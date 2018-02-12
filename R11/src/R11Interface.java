// R12 Assignment
// Author: Russ Wakefield
// Date:   Jul 21, 2015
// Class:  CS160
// Email:  waker@cs.colostate.edu
public interface R11Interface {

	/*
	 * Method: computeFact
	 * Precondition: 0 <= n <= 20
	 * Postcondition: if n is equal to zero, return null
	 * Postcondition: return an array with n values, each set to the factorial
	 * 			for the index of the array element.
	 * 			(i.e. array[0] = 1, [1] = 1, [2] = 2, [3] = 6, [4] = 24, ....)
	 */
	public long[] computeFact(int n);

	/*
	 * Method: copyArray
	 * precondition: a is defined as an array of ints
	 * postcondition: if a is null, return null
	 * Postcondition: returns a copy of a
	 */
	public int[] copyArray(int[] a);

	/*
	 * Method: incArray
	 * Precondition: a is defined as an int array
	 * Postcondition: if a is equal to null, return
	 * Postcondition: each element of the array is incremented by 1.
	 */
	public void incArray(int[] a);

}
