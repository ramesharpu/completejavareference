/**
 * 
 */
package classRelated;

/**
 * @author Ramesh
 *
 */
public class FinalizeMethodExample {

	public static void main(String[] args) {
		test a = new test();
		test b = new test();
		a = b;
		System.gc();
		System.out.println("I'm from main class");
	}

}

class test {
	@Override
	protected void finalize() throws Throwable {
		// This method will be called by gc, before performing destroying the
		// object
		System.out.println("I'm called from garbage collector");
	}
}
