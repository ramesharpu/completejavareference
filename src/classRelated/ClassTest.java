/**
 * 
 */
package classRelated;

/**
 * @author Ramesh
 *
 */
public class ClassTest {

	/**
	 * @param args
	 */
	String name = "Ramesh";

	public static void main(String[] args) {
		ClassTest a = new ClassTest();
		ClassTest b = new ClassTest();
		ClassTest c = a;
		ClassTest d = a;
		ClassTest e = b;

		// Object Reference
		System.out.println(a + ", " + b);
		System.out.println(c + " ," + d + " ," + e + " ,");

		// Hash code
		System.out.println("Hashcode - " + a.hashCode() + " ," + b.hashCode() + " ," + c.hashCode());

		a.name = "name changed from a object";
		System.out.println(b.name);
		System.out.println(c.name);

		a = null;
		d.name = "modified name from d object";
		System.out.println(c.name);

		a = c;
		System.out.println(a.name);

		a = c = b;
		System.out.println(a.name);
		System.out.println(c.name);

		System.out.println(a + " ," + b + " ," + c + " ," + d);
	}

}
