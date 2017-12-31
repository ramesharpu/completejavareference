/**
 * 
 */
package exploring;

/**
 * @author Ramesh
 *
 */
public class PrintFExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//printf is used to format the desired output

		//to print i as 002
		int i = 2;
		System.out.printf("i value is %03d \n", i);

		//to print i as '  2'
		System.out.printf("i value is '%3d' \n", i);

		//to print the value of x as float
		float x = 5;
		System.out.printf("value of i in float (default six decimal points) is %f \n", x);
		System.out.printf("value of i changed to 2 decimal points is '%.2f' \n", x);
		
		//to print the value of x as float with fixed digits (say 6 characters including decimals)
		System.out.printf("value of i changed to 6 characters including 2 decimal points is '%06.2f' \n", x);
		
		//string formating
		String name = "Ramesh";
		System.out.printf("Normal formatting '%s' \n", name);
		System.out.printf("left formatting '%10s' \n", name);
		System.out.printf("Right formatting '%-10s' \n", name);
		
		//To construct a table view
		System.out.println();
		String divider = "-----";
		System.out.printf("Name \t Age \n");
		System.out.println(divider+"\t"+divider);
		System.out.println("Ramesh \t 33");
		System.out.println("John \t 35");
	}

}
