// R12 Assignment
// Author: alaswell
// Date: Jul 23, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu
import java.util.Arrays;

public class R12 implements R12Interface {

	public static void main(String[] args) {
		R12 testClass = new R12();


		int[][] testArray = testClass.identMatrix(5);
		System.out.println(Arrays.deepToString(testArray));
		
		int[][] b = randomMatrix(4);
		int[][] c = randomMatrix(4);
		System.out.println("b = " + Arrays.deepToString(b));
		System.out.println("c = " + Arrays.deepToString(c));
		
		//int[][] matrixAB = testClass.addMatrix(b, c, 4);
		//System.out.println(Arrays.deepToString(matrixAB));
		int[][] matrixAB = R12.transposeMatrix(b, 4);
		System.out.println(Arrays.deepToString(matrixAB));
	}

	@Override
	public int[][] identMatrix(int n) {
		//make an identity matrix
		int[][] table1;
		
		if(n == 0)
			return null;
		else
		{
			table1 = new int[n][n];
			for(int i = 0; i < n; ++i)
			{
				for(int j = 0; j < n; ++j)
				{
					if(i == j)
						table1[i][j] = 1;
				}
			}
			return table1;
		}
		/* Cole's code solution
		 * for(int i = 0; i < n; ++i)
		 *	a[i][i] = 1;
		 */
			
	}

	@Override
	public int[][] addMatrix(int[][] matrixA, int[][] matrixB, int n) {
		//add em together and return new
		
		if(n == 0)
			return null;
		else
		{
			int[][] matrixAB = new int[n][n];
			
			for(int i = 0; i < n; ++i)
			{
				for(int j = 0; j < n; ++j)
				{
					matrixAB[i][j] = matrixA[i][j] + matrixB[i][j];
				}
			}
			return matrixAB;
		}
	}

	public static boolean isSquareMartix(int[][] a, int n) {
		//test method for square matrix
		
		if(a.length != n)
			return false;
		for(int i = 0; i < n; ++i)
			if(a[i].length != n)
				return false;
		return true;
	}
	
	public static int[][] randomMatrix(int n) {
		int[][] a = new int[n][n];
		
		for(int i = 0; i < n; ++i)
			for(int j = 0; j < n; ++j)
				a[i][j] = (int) (Math.random() * 10);
		return a;
	}
	
	public static int[][] transposeMatrix(int[][] a, int n)
	{
		
		if(n == 0)
			return null;
		else
		{
			int[][] matrixAB = new int[n][n];
			
			for(int i = 0; i < n; ++i)
			{
				for(int j = 0; j < n; ++j)
				{
					matrixAB[i][j] = a[j][i];
				}
			}
			return matrixAB;
		}
	}

}
