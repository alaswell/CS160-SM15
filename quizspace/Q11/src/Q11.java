// Quiz: Q11
// Author: alaswell
// Date: Jul 21, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

public class Q11 implements Q11Interface {

	public static void main(String[] args) {
		

	}

	@Override
	public int factorial(int index) {
		int runningTotal = 1;
		
		if(index >= 0)
		{
			//if non-negative number do factorial!
			while(index > 0)
			{
				runningTotal = runningTotal * index;
				index--;
			};
			return runningTotal;
		}
		else
			//otherwise return -1
			return -1;
	}

}
