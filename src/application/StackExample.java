package application;

public class StackExample {

	public static void main(String[] args) {
		Stack test = new Stack();
		System.out.println("Trying to call the empty stack");
		test.pop();
		
		// Inserting the value to the stack
		for (int i = 0; i < 10; i++) {
			test.push(i);
		}

		System.out.println("Printing the stack values");
		for (int x = 0; x < 10; x++) {
			System.out.println(test.pop());
		}

	}

}

class Stack {
	// Implementing a stack of size 5
	private int[] st = new int[10];
	private int pos;

	// Initializing the stack
	Stack() {
		pos = -1;
	}

	void push(int item) {
		if (pos == 9)
			System.out.println("Stack is full");
		else
			st[++pos] = item;
	}

	int pop() {
		if (pos < 0) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			return st[pos--];
		}

	}
}