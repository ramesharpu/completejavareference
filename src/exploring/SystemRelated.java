/**
 * 
 */
package exploring;

import java.io.Console;
import java.io.IOException;

/**
 * @author Ramesh
 *
 */
public class SystemRelated {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//This class will give the details of the System class

		//Get the class name
		System.out.println(System.class.getName());
		
		//prints new line as windows it is \r\n
		System.out.println(System.lineSeparator());
		
		//Get the environment value
		System.out.println("USERNAME on the system - "+System.getenv("USERNAME"));
		System.out.println();

		//Get single property
		System.out.println("OS Name - "+System.getProperty("os.name"));
		System.out.println();

		//Get all the properties
		System.out.println("Printing all the system properties: \n"+System.getProperties());
		System.out.println();

		//Print the identity hash code
		int a = 20;
		System.out.println("Hash Code - "+System.identityHashCode(a));
		System.out.println();

		//map library
		System.out.println(System.mapLibraryName("os.ramesh"));
		System.lineSeparator();

		//Print the nano time
		System.out.println("Nano time - "+System.nanoTime());
		System.out.println();

		//Setting and getting the value of a property
		System.out.println("Setting the value for prop1");
		System.setProperty("prop1", "property1value");
		System.out.println("Printing the value of prop1 - "+System.getProperty("prop1"));
		System.out.println("Removing the prop1 value");
		System.clearProperty("prop1");
		System.out.println("Printing the value of prop1 after clearing it- "+System.getProperty("prop1"));
		System.out.println();


		//To read the input in bytes
		/*System.out.println("enter any character");
		int test = System.in.read();
		System.out.println("ASCII value of the entered charater is - "+test);
		System.out.println();*/

		//Console ==> Run this program in command prompt as the IDE does not use console
		/*System.out.println("Enter your username");
		Console c = System.console();
		String un = c.readLine();
		System.out.println("Enter your password");
		char[] password = c.readPassword();
		String passwd = String.valueOf(password);
		System.out.println("Username = '"+un+"', password = '"+passwd+"'");
		System.out.println();*/

		//Setting the security Manager
		/*		if(System.getSecurityManager() == null){
			System.out.println("Setting new Security Manager");
			System.setSecurityManager(new SecurityManager());
		}
		System.out.println("Security Manger"+System.getSecurityManager());
		System.out.println();
		 */

		/*
		 * Copy some part of data from source array to destination array
		 * Eg:
			source array = {10, 20, 30, 40, 50, 60}
			destination array = {1, 2, 3, 4, 5}
			modified destination array = {1, 2, 30, 40, 50, 6}
		 */
		int[] sourceArray = {10, 20, 30, 40, 50, 60};
		int[] destinationArray = {1, 2, 3, 4, 5, 6};
		System.arraycopy(sourceArray, 2, destinationArray, 2, 4);
		System.out.print("Modified destinationArray Values: ");
		for(int x:destinationArray){
			System.out.print(" "+x+",");
		}
		System.out.println();
		
		
		//Once Exit is called, the jvm is terminated
		System.exit(0);
		System.out.println("this will not be printed");
	}

}
