/**
 * 
 */
package operators;

/**
 * @author Ramesh
 *
 */
public class TernaryOperatorExample {

	/**
	 * @param args
	 * @return 
	 */
	public static int printAbsoluteValue(int number){
		number = (number<0)? -number : number;
		return number;
	}
	public static void main(String[] args) {
		System.out.println("Absolute value of -25 is "+printAbsoluteValue(-25));
		System.out.println("Absolute value of 25 is "+printAbsoluteValue(25));
	}
}