/**
 * 
 */
package controlStatements;

/**
 * @author Ramesh
 *
 */
public class SwitchStatementWithoutBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1; i<=13; i++){
			System.out.println("Loop-"+i);
			switch(i){
			case 10:
			case 11:
			case 12:
				System.out.println("Quater ==> 4");
				break;
			case 1:
			case 2:
			case 3:
				System.out.println("Quater ==> 1");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("Quater ==> 2");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("Quater ==> 3");
				break;
			default:
				System.out.println("Invalid month");
			}
		}
	}

}
