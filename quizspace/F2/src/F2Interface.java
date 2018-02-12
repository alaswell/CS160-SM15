// Final Programming F2 (Interface File)
// Author: Russ Wakefield
// Date:   8/6/2015 
// Class:  CS160
// Email:  waker@cs.colostate.edu

public interface F2Interface {

	/*
 	 *  Method: readFile
 	 *  Purpose: to read a file into a string array
 	 *  Precondition: filename set to the name of the file to read
 	 *  Precondition: first line of the input file contains the number 
	 *		of lines in the file. (Not counting the line containing
	 *		the number of lines).
 	 *  Postcondition: Each element of the return array is set to a 1 
 	 *  		line in file in the order they were read.
 	 *  Postcondition: The length of the return array is set to the
 	 *  		number of strings in the input file.
 	 *  Postcondition: if the file does not exist, return null
 	 */
	public String[] readFile(String filename);


	/*
  	 * Method: computeStatistics
  	 * Purpose: Compute statistics for the myStrings array
  	 * Precondition: myStrings contains array of strings
  	 * Postcondition: computeStatistics returns an integer array of size 3
  	 * Postcondition: the element at index 0 of the return array is set to the 
  	 * 	number of characters in the array
  	 * PostconditionP: the element at index 1 of the return array is set to the
  	 * 	number of letters in the array
  	 * Postcondition: the element at index 2 of the return array is set to the 
  	 * 	number of digits in the array
  	 * Postcondition: if myStrings is null, return null
  	 */
	public int[] computeStatistics(String[] myStrings);


	/*
 	 * Method: writeFile
 	 * Purpose:  Writes the contents of the myStrings array to a file
 	 * Precondition: the parameter fileName is initialized to the
 	 * 	name of the file to be written
 	 * Precondition: The array myStrings contains strings to be
 	 * 	written to the file, 1 line per string
 	 * Postcondition: The file identified by fileName contains
 	 * 	the array of strings.
 	 * Postcondition: if myStrings is null or zero length, write the
 	 * 	string "Empty file" to the file.
 	 * Postcondition: the catch block does not need to contain code.
  	 */
	public void writeFile(String filename, String[] myStrings);


	/* Method: sumRange
	 * Purpose: to sum a set of values within a range in an array
	 * Precondition: myValues contains from 0 to 1000 values
	 * Precondition: low and high are integers that define the
	 * 	range of values to sum
	 * Postconditon: the return value is set to the sum of all
	 * 	values in the array between low and high inclusive.
	 */
	public int sumRange (int[] myValues, int low, int high);


	/* Method: getLargest
         * Purpose: Find the two largest values in the array myValues
         * Precondition: myValues contains an array of doubles or null
         * Postcondition: if myValues is null or contains less than 
         * 		2 values, return null
         * Postcondition: if myValues contains 2 or more values, return
         * 	an array of size 2 that contains the two largest values
         * 	in the myValues array.  The larger of the two values will
         * 	be in the 0th element,
         */
	public double[] findLargest(double[] myValues);


}

