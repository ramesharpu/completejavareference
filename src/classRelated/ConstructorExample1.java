/**
 * 
 */
package classRelated;

/**
 * @author Ramesh
 *
 */
public class ConstructorExample1 {
	double length, breadth, width;

	public ConstructorExample1() {
		// This initilizes all the used variables
		length = 10;
		breadth = 20;
		width = 30;
	}

	double vol() {
		return length * breadth * width;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConstructorExample1 test = new ConstructorExample1();
		System.out.println("Volume = "+test.vol());

	}

}
