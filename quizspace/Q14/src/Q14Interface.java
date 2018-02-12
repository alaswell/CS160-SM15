// Q14 Assignment
// Author: Russ Wakefield
// Date:   Jul 27, 2014
// Class:  CS160
// Email:  waker@cs.colostate.edu
public interface Q14Interface {

	/*
	 * Method: productMatrix
	 * precondition: 0 <= n <= 100
	 * postcondition: if n is less than 1, return null
	 * postcondition: if n is greater than zero, return a n x n matrix
	 * 			with each element of the matrix set to 
	 * 			row index * column index.
	 */
	public int[][] productMatrix(int n);

}
