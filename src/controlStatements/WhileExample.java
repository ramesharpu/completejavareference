/**
 * 
 */
package controlStatements;

/**
 * @author Ramesh
 *
 */
public class WhileExample {

	/**
	 * @param args
	 */

	private static void generalWhileExample() {
		//Ticker Example
		int tick = 10;
		while(tick>=0){
			System.out.println("Tick Tick - "+tick);
			tick--;
		}
		System.out.println();

	}

	private static void typicalWhileExample() {
		//While loop without a body and ending with a semicolon
		int i = 100, j = 200;
		while(++i < j--);
		System.out.println("Midpoint of 100-200 is "+i);

	}

	public static void main(String[] args) {
		generalWhileExample();
		typicalWhileExample();
	}

}
