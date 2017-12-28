/**
 * 
 */
package controlStatements;

/**
 * @author Ramesh
 *
 */
public class IfElse {

	/**
	 * @param args
	 */

	static int a = 10;
	static int b = 20;
	static int c = 30;

	public static void onlyIfExample() {
		System.out.println("Below statement will not get printed");
		if (a > b)
			System.out.println("a is greater than b");
	}
	
	private static void IfElseExample() {
		System.out.println("Printing from IfElseExample");
		if (a > b)
			System.out.println("a is greater than b");
		else
			System.out.println("b is greater than a");
	}
	
	private static void nestedIfElseExample() {
		System.out.println("\nThis is getting printed from nestedIfElseExample()");
		if(b>a){
			if(a+b>c){
				System.out.println("sum of a+b is greater than c");
			}
			else{
				System.out.println("The sum of a+b is not greater than c");
			}
			if(a+b>=c)
				System.out.println("The sum of a+b is equal to c");
		}
		else{
			System.out.println("a is greater than b");
		}
	}
	
	private static void elseIfExample() {
		System.out.println("\nThis is from elseIfExample()");
		if(a>b) System.out.println("a>b");
		else if (a==b) System.out.println("a=b");
		else System.out.println("b>a");
	}
	
	public static void main(String[] args) {
		onlyIfExample();
		IfElseExample();
		nestedIfElseExample();
		elseIfExample();
	}










}
