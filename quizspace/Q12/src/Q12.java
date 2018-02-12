// Quiz: Q12
// Author: alaswell
// Date: Jul 23, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

public class Q12 implements Q12Interface {

	public static void main(String[] args) {
		Q12 testClass = new Q12();

		//test fillArray
		char[] resultArray = testClass.fillArray("Betty Boop!"); 
		System.out.println(resultArray);
		
		//test printArray
		char[] nArray = null;
		testClass.printArray(resultArray);
		testClass.printArray(nArray);
	}

	@Override
	public char[] fillArray(String var) {
		//return a char array filled with String var
		char[] stringAsArray = new char[var.length()];
		
		for(int i = 0; i < var.length(); ++i)
		{
			stringAsArray[i] = var.charAt(i);
		}
		return stringAsArray;
	}

	@Override
	public void printArray(char[] array) {
		//print the array with spaces
		boolean wibble = true;
		
		if(array == null)
			System.out.println("The array has not been created.");
		else
		{
			char[] spacesArray = new char[array.length * 2];
			int j = 0;
			
			for(int i = 0; i < array.length * 2; ++i)
			{
				if(wibble)
				{
					spacesArray[i] = array[j];
					++j;
					wibble = !wibble;
				}
				else
				{
					spacesArray[i] = ' ';
					wibble = !wibble;
				}
			}
			System.out.println(spacesArray);
		}
		
	}

}
