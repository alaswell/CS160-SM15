// Quiz: Q10
// Author: alaswell
// Date: Jul 16, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

public class Q10 {

	private String name;
	private double gpa;

	/* Method: getName
	 * Precondition: none
	 * Postcondition: returns current value of name
	 */
	public String getName() {
		return name;
	}

	/*Method: setName
	 * Precondition: argument passed is the new value of name
	 * Postcondition: name set to argument passed
	 */
	public void setName(String newName) {
		name = newName;
	}

	/* Method: getGPA
	 * Precondition: none
	 * Postcondition: returns current value of gpa
	 */
	public double getGPA () {
		return gpa;
	}

	/*Method: setGPA
	 * Precondition: argument passed is the new value of gpa
	 * Postcondition: gpa set to argument passed if (0 < newGPA <= 4.0)
	 */
	public void setGPA(double newGPA) {
		if((0 < newGPA) && (newGPA <= 4.0))
		{
			gpa = newGPA;
		}
	}
	public static void main(String[] args) {

		Q10 q = new Q10();
		q.setName("Elmer Fudd");
		System.out.println ("Value stored in setName was: " + q.getName());

		q.setGPA(3.45);
		System.out.println ("Value stored in setGPA was: " + q.getGPA());
	}

}

