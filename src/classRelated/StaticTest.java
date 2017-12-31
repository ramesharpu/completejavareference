package classRelated;

public class StaticTest {
	static int var1 = 10;
	int var2 = 20;

	//Static method will run when initializing the variables and methods
	static {
		System.out.println("From Static Test - I'm being called when initializing the static variables and methods");
	}

	public static void main(String[] args) {

	}

	static void method1(int variable1) {
		//this.var1 = variable1; /*this cannot be used for static modifiers*/
		
		System.out.println("From Method1");
		System.out.println("var1 = " + var1);
		//System.out.println("var1 = " + var2); /* Cannot access var2 directly inside the static method
	}
}

class test1 {
	StaticTest t1 = new StaticTest();
	static int var3 = 30;
	
	//this will not get executed
	static {
		System.out.println("From test1 - I'm being called when initializing the static variables and methods");
	}

	void method2() {
		System.out.println("var1 = " + t1.var2); /*var2 can be accessed directly by creating a new object */
	}

}