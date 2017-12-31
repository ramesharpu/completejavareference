/**
 * 
 */
package controlStatements;

/**
 * @author Ramesh
 *
 */
public class SwitchExampleWithBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1; i<=4; i++){
			System.out.println("Loop - "+i);
			switch(i){
			case(1):
				System.out.println("number is one");
				break;
			case(2):
				System.out.println("number is two");
				break;
			case(3):
				System.out.println("number is three");
				break;
			default:
				System.out.println("number is four");
				break;
			}
		}
	}

}
