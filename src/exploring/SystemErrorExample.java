/**
 * 
 */
package exploring;

/**
 * @author Ramesh
 *
 */
public class SystemErrorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * To print the error using System.err.println()
		 * To run this program save it in a new file, compile it and java SystemErrorExample 2> test.txt
		 * if you execute this program, the err message will be printed in red font, this is for the ease of debugging
		*/
		
		System.err.println("This output will be printed in the redirected file");
		System.out.println("This will be printed in the console");
		
		//System messes up with the output
		for(int i = 0; i < 10; i++) {
            System.out.println("out");
            System.err.println("err");
        }
	}

}
