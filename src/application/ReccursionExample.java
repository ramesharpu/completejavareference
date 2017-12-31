package application;

public class ReccursionExample {

	public static void main(String[] args) {
		factorial f = new factorial();
		int x = 6;
		System.out.println("Factorial of " + x + " is " + f.fact(x));
	}

}

class factorial {
	int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		else {
			result = fact(n-1) * n;
			return result;
		}
	}
}
