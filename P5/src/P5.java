// P5 Assignment
// Author: alaswell
// Date: Jul 17, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

public class P5 {

	// Operation enumeration
	public enum eOperation { PERIMETER, AREA }

	// Conversion enumeration
	public enum eScale { CELSIUSFAHRENHEIT, FAHRENHEITCELSIUS }    


	//
	//Insert your methods here.
	//


	public static void main(String[] args) {

		// Instantiate class
		P5 p5 = new P5();

		// Test functionality
		double hypotenuse = p5.computeHypotenuse(3.0, 4.0);
		System.out.printf("Adjacent = 3.0, Opposite = 4.0, Hypotenuse = %.4f%n",
				hypotenuse);

		double root = p5.solveQuadratic(2.0, -4.0, -3.0);
		System.out.printf("2x**2 - 4x - 3 = 0, positive root = %.4f%n",root);

		double celsius = p5.convertTemperature(eScale.FAHRENHEITCELSIUS, 212.0);
		System.out.printf("212.0 Fahrenheit = %.4f Celsius%n", celsius);

		double fahrenheit = p5.convertTemperature(eScale.CELSIUSFAHRENHEIT, 0.0);
		System.out.printf("0.0 Celsius = %.4f Fahrenheit%n", fahrenheit);

		double perimeter = p5.geometryCircle(eOperation.PERIMETER, 3.0);
		System.out.printf("Perimeter of circle with radius 3.0 is %.4f%n", 
				perimeter);

		double area = p5.geometryCircle(eOperation.AREA, 3.0);
		System.out.printf("Area of circle with radius 3.0 is %.4f%n", area);
	}


	public double geometryCircle(eOperation perimeter, double d) {
		double solution = 0;
		
		switch(perimeter)
		{
		case PERIMETER:
			solution = (Math.PI*d)*2;
			break;
			
		case AREA:
			solution = Math.PI*(d*d);
			break;
			
		default:
			System.out.println("Not a valid option");
		}
		return solution;
	}


	public double convertTemperature(eScale fahrenheitcelsius, double d) {
		double solution = 0;
		
		//(°C  x  9/5) + 32 = °F
		//(°F  -  32)  x  5/9 = °C
		switch(fahrenheitcelsius)
		{
		case CELSIUSFAHRENHEIT:
			solution = ((d * 9)/5) + 32;
			break;
			
		case FAHRENHEITCELSIUS:
			solution = ((d - 32) * 5)/9;
			break;
		
		default:
			System.out.println("Not a valid option");
			
		}
		return solution;
	}


	public double solveQuadratic(double d, double e, double f) {
		double solution1 = (-e + Math.sqrt((e*e) - (4*d*f)))/(2*d);
		double solution2 = (-e - Math.sqrt((e*e) - (4*d*f)))/(2*d);
		if(solution1 > solution2)
			return solution1;
		else
			return solution2;
	}


	public double computeHypotenuse(double d, double e) {
		double hypotenuse = 0;

		if(d > 0 && e > 0)
		{
			hypotenuse = Math.hypot(d, e);
		}
		return hypotenuse;
	}


}

