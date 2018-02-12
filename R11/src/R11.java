// R11 Assignment
// Author: alaswell
// Date: Jul 21, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

public class R11 implements R11Interface {

	@Override
	public long[] computeFact(int n) {
		//fill the array with factorials!
		
		long[] coolArray = new long[n];
		long runningTotal = 1;
		
		if(n <= 0 || n > 20)
			return null;
		else //n > 0 && n < 20
		{		
			for(int i = 0; i < n; i++)
			{
				if(i > 0)
					runningTotal = i * coolArray[(i-1)];
				coolArray[i] = runningTotal;
			}
			/*COLE
			 * long[] a = new long[n]
			 * a[0] = 1;
			 * 
			 * for(int i = 1; i < a.length; ++i)
			 * 		a[i] = a[i - 1] * i;
			 * return a;
			 */
		}
		return coolArray;
	}

	@Override
	public int[] copyArray(int[] a) {
		//return a copy of the array
		
		if(a == null)
			return null;
		else
		{
			int[] b = new int[a.length];
			for(int i = 1; i < a.length; i++)
				b[i] = a[i];
			return b;
		}
	}

	@Override
	public void incArray(int[] a) {
		//increment each item in the array by 1

		if(a == null)
			return;
		else
		{
			for(int i = 0; i < a.length; i++)
				++a[i];
			/* BACKWARDS
			*  for(int i = a.length - 1; i >= 0; --i)
			*  		--a[i];
			*/
		}
	}

}
