/**
 * 
 */
package controlStatements;

import java.io.IOException;

/**
 * @author Ramesh
 *
 */
public class DoWhileExample {

	/**
	 * @param args
	 * @throws IOException 
	 */
	private static void generalExample() {
		//Efficient way of coding do-while for the timer program
		int n = 10;
		do{
			System.out.println("Tick Tick "+n);
		}while(--n>0);
	}

	private static void efficientExample() {
		// TODO Auto-generated method stub
		int n = 10;
		do{
			System.out.println("Tick Tick "+n);
			n--;
		}while(n>0);
	}

	private static void typicalUseCase() throws IOException {
		//Typical use case is like displaying menu option atleast once before asking for the options
		char choice;
		do{
			String divider = "-------------";
			System.out.println("\nMenu Options:");
			System.out.println(divider);
			System.out.println("1. Indian");
			System.out.println("2. Chinese");
			System.out.println("3. Italian");
			System.out.println("4. Japanese");
			System.out.println("Enter the option number");			
			choice = (char) System.in.read();
		}while(choice < '1' || choice > '9');
		
		System.out.println();
		switch(choice){
		case '1':{
			System.out.println("You selected Indian");
			break;
		}
		case '2':{
			System.out.println("You selected Chinese");
			break;
		}
		case '3':{
			System.out.println("You selected Italian");
			break;
		}
		case '4':{
			System.out.println("You selected Japanese");
			break;
		}
		default:
			System.out.println("You selected an Invalid option");
			break;
		}
	}
	
	public static void main(String[] args) throws IOException {

		generalExample();
		efficientExample();
		typicalUseCase();
	}
}
