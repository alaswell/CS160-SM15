import java.util.Arrays;

// P6 Assignment
// Author: alaswell
// Date: Jul 21, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

public class P6 implements P6Interface {

	public static void main(String[] args) {
		P6 testObject = new P6();

		int[] testArray = testObject.computeFibon(99);
		System.out.println(Arrays.toString(testArray));

		int[] testArray1 = testObject.computeSquares(99);
		System.out.println(Arrays.toString(testArray1));

		int[] testArray2 = testObject.computeSumOfOdds(99);
		System.out.println(Arrays.toString(testArray2));
		
		int[] nullArray;
		nullArray = null;
		
		boolean testResultBool = testObject.compareArrays(nullArray, testArray2);
		boolean testResultBool1 = testObject.compareArrays(testArray1, testArray2);
		boolean testResultBool2 = testObject.compareArrays(testArray, testArray);
		System.out.println(testResultBool1);
		
		int[] testArray3 = testObject.computeArraySum(testArray1, testArray2);
		System.out.println(Arrays.toString(testArray3));
	}

	@Override
	public int[] computeFibon(int n) {
		// if n > 0, creates an array of size n 
		// filled with fibonacci nums
		// otherwise return null

		if(n <= 0 || n > 100)
			return null;
		else if (n == 1)
		{
			int[] fiboNums = new int[n];
			fiboNums[0] = 0;
			return fiboNums;
		}
		else if (n == 2)
		{
			int[] fiboNums = new int[n];
			fiboNums[0] = 0;
			fiboNums[1] = 1;
			return fiboNums;
		}
		else//n > 0
		{			
			int[] fiboNums = new int[n];
			fiboNums[0] = 0;
			fiboNums[1]	= 1;
			fiboNums[2]	= 1;

			for(int i = 3; i < n; ++i)
			{
				fiboNums[i] = fiboNums[i-1] + fiboNums[i-2];
			}
			return fiboNums;
		}		
	}

	@Override
	public int[] computeSquares(int n) {
		//return array of squares (i*i)

		if(n <= 0 || n > 100)
			return null;
		else//n > 0
		{			
			int[] squaresArray = new int[n];
			int counter = 1;
			
			for(int i = 0; i < n; ++i)
			{
				squaresArray[i] = counter*counter;
				counter++;
			}
			return squaresArray;
		}
	}

	@Override
	public int[] computeSumOfOdds(int n) {
		// if n is zero, returns null
		// if n > 0, creates an array of size n and fills 
		//	and returns an array with the sum of the first n odd numbers

		if(n <= 0 || n > 100)
			return null;
		else//n > 0
		{			
			int[] oddArray = new int[n];
			int odds = 3;
			oddArray[0] = 1;

			for(int i = 1; i < n; ++i)
			{
				oddArray[i] = odds + (int) oddArray[i-1];
				odds += 2;
			}
			return oddArray;
		}
	}

	@Override
	public boolean compareArrays(int[] a, int[] b) {
		// returns true if the arrays are equal (same values), 
		// else false
		
		if(a == null || b == null)
			return false;
		else if(Arrays.equals(a,  b))
			return true;
		else	
			return false;
	}

	@Override
	public int[] computeArraySum(int[] a, int[] b) {
		// creates and returns an array that is the sum
		// of the two arguments
		
		if(a == null || b == null)
			return null;
		else if (a.length != b.length)
			return null;
		else
		{			
			int[] sumArray = new int[a.length];

			for(int i = 0; i < a.length; ++i)
			{
				sumArray[i] = a[i] + b[i];
			}
			return sumArray;
		}
	}

}
