// R9 Assignment
// Author: Alex Laswell
// Date:   Jul 14, 2015
// Class:  CS160
// Email:  alaswell@cs.colostate.edu

public class R9 {

	/*
	 * Method replicateString
	 * Precondition: The first parameter (s) is a string
	 * Precondition: The second parameter (n) is an int, n >= 0.
	 * Postcondition: The return value is a string that has n
	 * 			occurrences of s in it.
	 */
	public String replicateString(String s, int n) {
		String newString = "";

		for(int i = 0; i < n; i++)
		{
			newString = newString + s;
		}
		return newString;
	}


	/*
	 * Method: concatenateStrings
	 * Precondition: The first parameter (s1) is a valid string.
	 * Precondition: The second parameter (s2) is a valid string.
	 * Postcondition: The return value is a string set to the
	 * 			concatenation of s1 and s2
	 */
	public String concatenateStrings(String s1, String s2) {
		String newString = s1.concat(s2);
		return newString;
	}


	/* Method: removeSpecialCharacters
	 * Pre-conditions: Input a Java string
	 * Post-conditions: Returns a copy of input string without special chars
	 * Note: a special character is define as not a digit, letter, or space.
	 */
	public String removeSpecialCharacters(String string) {
		String newString = "";
		for(int i = 0; i < string.length(); i++)
		{
			char c = string.charAt(i);
			if( Character.isLetterOrDigit(c) 
					|| Character.isWhitespace(c) )
					newString += c;
		}
		return newString;
	}



	/* Method: reverseCase
	 * Precondition: The only parameter is a valid string (s1) containing
	 * only upper and lower case letters.
	 * Postcondition: s1 remains unchanged
	 * Postcondition: The return value is the string with the cases switched
	 */
	public String reverseCase(String s1) {
		String newString = "";

		for(int i = 0; i < s1.length(); i++)
		{
			if(Character.isUpperCase(s1.charAt(i)))
			{
				newString += Character.toLowerCase(s1.charAt(i));
			}
			else
				newString += Character.toUpperCase(s1.charAt(i));
		}
		return newString;
	}


	/* Method: reverseString
	 * Pre-conditions: Input is a Java string
	 * Post-conditions: Returns a copy of input string with chars reversed
	 */
	public String reverseString(String string) {
		String newString = "";

		for(int i = string.length()-1; i >= 0; i--)
		{
			newString += string.charAt(i);
		}
		return newString;
	}



	public static void main(String[] args) {

		String string1 = "Hello ";
		String string2 = "There";
		String string3 = "!@#$%^&*()What's left?";
		String string4 = "HELLO there";
		String string5 = "Can you see me?";

		R9 utils = new R9();

		String string6 = utils.replicateString(string1, 3);
		System.out.println("replicateString: \""+string6+"\"");

		String string7 = utils.concatenateStrings(string1, string2);
		System.out.println("concatenateStrings: \""+string7+"\"");

		String string8 = utils.removeSpecialCharacters(string3);
		System.out.println("removeSpecialCharacters: \""+string8+"\"");

		String string9 = utils.reverseCase(string4);
		System.out.println("reverseCase: \""+string9+"\"");

		String string10 = utils.reverseString(string5);
		System.out.println ("reverseString: \""+string10+"\"");

	}

}

