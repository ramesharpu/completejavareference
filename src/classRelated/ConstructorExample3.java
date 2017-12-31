/**
 * 
 */
package classRelated;

/**
 * @author Ramesh
 *
 */
class testClass {

	double length, width, breadth;

	testClass(testClass obj) {
		this.length = obj.length;
		this.breadth = obj.breadth;
		this.width = obj.width;
	}

	public testClass(double lenght, double width, double breadth) {
		this.length = lenght;
		this.breadth = breadth;
		this.width = width;
	}

	double vol() {
		return length * breadth * width;
	}
}

class ConstructorExample3 {
	public static void main(String[] args) {
		testClass test1 = new testClass(10, 20, 30);
		System.out.println("Volume = " + test1.vol());

		// Overloading a constructor based on another constructor
		testClass test2 = new testClass(test1);
		System.out.println("Volume by passing the object = " + test2.vol());
	}
}
