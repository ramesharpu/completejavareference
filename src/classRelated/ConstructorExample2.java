/**
 * 
 */
package classRelated;

/**
 * @author Ramesh
 *
 */
public class ConstructorExample2 {

	double length, width, breadth;

	public ConstructorExample2(double lenght, double width, double breadth) {
		this.length = lenght;
		this.breadth = breadth;
		this.width = width;
	}

	double vol() {
		return length * breadth * width;
	}

	public static void main(String[] args) {
		ConstructorExample2 test = new ConstructorExample2(10, 20, 30);
		System.out.println("Volume = " + test.vol());
	}

}
