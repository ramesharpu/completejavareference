/**
 * 
 */
package controlStatements;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author Ramesh
 *
 */
public class ForLoopExample {

	/**
	 * @param args
	 */

	private static void generalForLoopExample() {
		System.out.println("\nFrom generalForLoopExample method");
		for(int i =0; i<2; i++){
			System.out.println("Value of i - "+i);
		}
	}

	private static void generalDecrementExample() {
		System.out.println("\nFrom generalDecrementExample method");
		for(int i=10; i>0; i--){
			System.out.println("Tick Tick - "+i);
		}
	}

	private static void multipleVariableDeclarationExample() {
		System.out.println("\nFrom multipleVariableDeclarationExample method");
		for(int a=10, b =20; a <=b; ++a, b--){
			System.out.println("a = "+a+", b= "+b);
		}
	}

	private static void iterateOverDynamicArray(){
		System.out.println("\nFrom iterateOverDynamicArray method");
		int[] a = {1, 2, 3, 4, 5};
		for (int i = 0; i < a.length; i++) {
			System.out.println("Value at index "+i+" is "+a[i]);
		}
	}
	
	private static void forEachExample1(){
		System.out.println("\nFrom forEachExample1 method");
		char[] arr = {'a', 'b', 'c', 'd'};
		int counter = 0;
		for (char x : arr) {
			System.out.println("Value at index "+counter+" is "+x);
			counter++;
		}
	}
	
	private static void forEachExample2(){
		System.out.println("\nFrom forEachExample2 method");
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int sum = 0;
		for (int x : a) {
			sum += x;			
		}
		System.out.println("Sum of the array is "+sum);
	}
	
	private static void readOnlyExample(){
		System.out.println("\nFrom readOnlyExample method");
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		for (int x : a) {
			System.out.print(x+" ");
			x = x * 10; //this statement will not have any effect
		}
		System.out.println();
		for (int x : a) {
			System.out.print(x+" ");
		}
	}
	
	private static void booleanCondition(){
		System.out.println("\nFrom booleanCondition method");
		System.out.println("From Boolean condition");
		boolean done = true;
		for (int i=1; done; i++) {
			System.out.println("Value of i = "+i);
			if(i==5){
				done = false;
				System.out.println("Terminating the for loop");
			}
		}
	}

	//Special case where you can omit initialization or iteration
	private static void ForLoopWithMissingStatement(){
		System.out.println("\nFrom ForLoopWithMissingStatement method");
		boolean done = true;
		for ( ; done; ) {
			for (int j=1; done; j++) {
				System.out.println("Value of j = "+j);
				if(j==2){
					done = false;
					System.out.println("Terminating the for loop");
				}
			}
		}
	}
	
	private static void infiniteForLoop() {
		//Donot use this variation as it will run for ever
		System.out.println("\nFrom infiniteForLoop method");
		for( ; ; ){
			System.out.println("This loop will break after printing this statement only one time");
			break;
		}
		
	}


	public static void main(String[] args) {
		generalForLoopExample();
		generalDecrementExample();
		multipleVariableDeclarationExample();
		iterateOverDynamicArray();
		forEachExample1();
		forEachExample2();
		readOnlyExample();
		booleanCondition();
		ForLoopWithMissingStatement();
		infiniteForLoop();
	}




}
