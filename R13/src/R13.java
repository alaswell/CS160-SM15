import java.lang.reflect.Array;
import java.util.Arrays;

// R13 Assignment
// Author: alaswell
// Date: Jul 28, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

public class R13 implements R13Interface {

	public static void main(String[] args) {
		System.out.println("** Test method for implementing the reverseArray **");
		System.out.println();
		testReverseArray();

		System.out.println();
		System.out.println("** Test method for implementing the shortestDistance **");
		System.out.println();
		testShortestDistance();
		
		System.out.println();
		System.out.println("** Test method for implementing the diagonalTotal **");
		System.out.println();
		testdiagonalTotal();
	}

	private static void testdiagonalTotal() {
		R13 r = new R13();
	
		int[][] matC = new int[4][4];
		for(int i = 0; i < matC.length; ++i)
			for(int j = 0; j < matC.length; ++j)
				matC[i][j] = 5;
		
		int returnInt = r.averageDiagonal(matC);
		System.out.println(returnInt);		
	}

	private static void testReverseArray() {
		//Test method for implementing the reverseArray

		R13 r = new R13();

		char[] array = {'W', 'e', 'l', 'c', 'o', 'm', 'e', ' ', 'f', 'r', 'i', 'e', 'n', 'd', 's'}; 
		char[] revArray = {'s', 'd', 'n', 'e', 'i', 'r', 'f', ' ', 'e', 'm', 'o', 'c', 'l', 'e', 'W'};

		//Testing null 
		System.out.println("Testing null case....");
		r.reverseArray(null);
		System.out.println("is there a blank line above?");

		//Testing 1
		System.out.println("Testing one");

		//Testing actual array
		r.reverseArray(array);
		if(Arrays.equals(array, revArray));
		{
			System.out.println("They are equal!");
			System.out.println(array);
			System.out.println(revArray);
		}
	}

	private static void testShortestDistance() {
		//Test method for implementing the shortestDistance

		R13 r = new R13();
		int[] numbers = { 5, -1, -102, 4, 99, 1, 9999};
		int[] zero = new int[0];
		int[] one = new int[1];

		System.out.println("Testing Null - expect a -1");
		int testNull = r.shortestDistance(null);
		System.out.println(testNull);
		System.out.println();

		System.out.println("Testing Zero - expect a -1");
		int test0 = r.shortestDistance(zero);
		System.out.println(test0);
		System.out.println();

		System.out.println("Testing One - expect a -1");
		int test1 = r.shortestDistance(one);
		System.out.println(test1);
		System.out.println();

		System.out.println("Testing real arrray - expect an index");
		int index = r.shortestDistance(numbers);
		System.out.println(index + " - the index returned");
	}

	@Override
	public void reverseArray(char[] array) {
		//Will change the array sent to be reversed

		if(array == null)
		{
			System.out.println();
			return;
		}
		else
		{
			char[] reverseArray = new char[array.length];
			int count = array.length - 1;

			//Get a reverse array of the original
			for(int i = 0; i < array.length; ++i)
			{
				reverseArray[i] = array[count];
				--count;
			}
			
			//Clone
			for(int i = 0; i < array.length; ++i)
				array[i] = reverseArray[i];
		}
	}

	@Override
	public int shortestDistance(int[] numbers) {
		//Get the index of the shortest abs value of 2 nums in the array

		if(numbers == null || numbers.length == 0 || numbers.length == 1)
		{
			return -1;
		}
		else
		{
			int index = 0;
			int tempIndex = 0;
			int tempTotal = 0;

			for(int i = 1; i < numbers.length; ++i, ++tempIndex)
			{
				int tempNum = Math.abs(Math.abs(numbers[tempIndex]) - Math.abs(numbers[i]));

				if(tempNum > tempTotal)
				{
					tempTotal = tempNum;
					index = tempIndex;
				}
			}
			return index;
		}
	}

	@Override
	public int averageDiagonal(int[][] myMatrix) {
		// Return the average of the values on the diagonal
		
		int runningTotal = 0;
		
		if(myMatrix == null)
			return -1;
		else
		{
			int tempMatrix[] = new int[myMatrix.length];
			int count = 0;
			
			//put in a temp matrix the diagonals
			for(int i = 0; i < myMatrix.length; ++i)
				tempMatrix[i] = myMatrix[i][i];
			
			//Now add them up
			for(int i = 0; i < myMatrix.length; ++i, ++count)
			{
				runningTotal += tempMatrix[i];
			}
			
			//average them
			runningTotal = runningTotal / count;
			return runningTotal;
		}
	}
}
