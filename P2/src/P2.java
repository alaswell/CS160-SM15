// P2 Assignment
// Author: alaswell
// Date: Jun 18, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

public class P2 {

	public static void main(String[] args) {
		byte byteInt = 97;
		short shortInt = 24567;
		int intInt = 113355;
		long longInt = 9384876238L;
		float floatInt = 1.57f;
		double dblInt = 23.456;
		
		char charOne = '$';
		char charTwo = 'H';
		char charThree = '3';
		
		String stringOne = "Java";
		String stringTwo = "Programming";
		String stringThree = "Great";
		
		System.out.println( byteInt + "," + shortInt + "," + intInt + "," + longInt );
		System.out.println( floatInt + ":" + dblInt );
		System.out.println( (byteInt + shortInt + intInt + longInt) / 1000);
		System.out.println( Math.sqrt((floatInt + dblInt)));
		System.out.println( dblInt / intInt );
		System.out.println( charOne + ";" + charTwo + ";" + charThree );
		charOne = (char) (charOne + 1);
		charTwo = (char) (charTwo + 1);
		charThree = (char) (charThree + 1);
		System.out.println( charOne + "." + charTwo + "." + charThree );
		System.out.println( stringOne + " " + stringTwo + " is " + stringThree + "!");
		System.out.println(stringOne.length() + "," + stringTwo.length() + "," + stringThree.length());
		System.out.println(stringThree.toUpperCase());
		System.out.println(stringTwo.substring(2,6));
		System.out.println(stringOne.indexOf('v'));
		System.out.println(stringTwo.charAt(3));
	}

}
