/**
 * 
 */
package operators;

/**
 * @author Ramesh
 *
 */
public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		
		c = a++;
		System.out.println("c = "+c+" a = "+a);
		
		c = ++b;
		System.out.println("c = "+c+" b = "+b);
		
		//reverting a to 10
		a = 10;
		
		//performing operation on a
		a += 10;
		System.out.println("a = "+a);
	}

}
