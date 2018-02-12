// R12 Assignment
// Author: Russ Wakefield
// Date:   Jul 26, 2014
// Class:  CS160
// Email:  waker@cs.colostate.edu
public interface R12Interface {

	/*
	 * Method: identMatrix
	 * Precondition: 0 < n <= 10
	 * Postcondition: returns null when n = 0
	 * Postcondition: returns an array of size N x N when 1 <= n <=10
	 * Postcondition: the values in the returned array are set to zero when row != column
	 * 			and set to 1 when row = column.
	 */
	public int[][] identMatrix(int n);

	/*
	 * Method: addMatrix
	 * Precondition: 2 integer matrices (2-dimensional arrays) of size n x n
	 * Precondition: 0 <= n <= 10
	 * Precondition: when n > 0, the two input arrays are of size n x n
	 * Postcondition: returns null when n = 0
	 * Postcondition: returns a n x n matrix when 1 <= n <= 10.  The matrix is the
	 * 			sum of the two input matrices.
	 * 			(ex. matrixC[row][col] = matrixA[row][col] + matrix B[row][col]
	 * 				for all rows and columns)
	 */
	public int[][] addMatrix(int[][] matrixA, int[][] matrixB, int n);

}
