/**
 * 
 */
package controlStatements;

/**
 * @author Ramesh
 *
 */
public class SwitchStatementNested {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1, b = 2;
		switch(a){
		case 1:{
			System.out.println("Entering into Nested Switch statement as the value of a is 1");
			switch(b){
			case 1:
				System.out.println("The value of b is 1");
				break;
			case 2:
				System.out.println("The value of b is 2");
				break;
			}
			break;
		}
		case 2:
			System.out.println("The value of a is 2, hence did not go inside the nested switch statement");
		}
	}
}
