// Quiz: Q14
// Author: alaswell
// Date: Jul 30, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu
import java.util.*;

public class Q14 implements Q14Interface {

	public static void main(String[] args) {

		//expect a null
		testProductMatrix(-1);

		//expect a null
		testProductMatrix(0);

		//expect a null
		testProductMatrix(101);
		
		testProductMatrix(1);

		testProductMatrix(49);
		
		testProductMatrix(100);
	}

	public static void testProductMatrix(int n) {
		Q14 t = new Q14();
		int[][] m; 

		m = t.productMatrix(n);
		System.out.printf("n = %d%n", n);
		System.out.println(Arrays.deepToString(m));
		System.out.println();

	}

	@Override
	public int[][] productMatrix(int n) {
		//return a product matrix of [n][n]
		if(n <= 0 || n > 100)
			return null;
		else
		{
			int[][] pMatrix = new int[n][n];

			for(int i = 0; i < pMatrix.length; ++i)
			{
				for(int j = 0; j < pMatrix.length; ++j)
				{
					pMatrix[i][j] = i * j; 
				}
			}
			return pMatrix;
		}
	}
}
