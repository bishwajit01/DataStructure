package stack;

/**
 * @author Bishwajit.
 *
 *         Implementation of Stack 
 *         1.Push 
 *         2.Pop
 */

public class StackOperations {
	static final int MAX = 1000;
	static int top;
	static int[] a = new int[MAX];

	private StackOperations() {
		top = -1;
	}

	public static void main(String[] args) {
		System.out.println("Stack ::");
		System.out.println("Element to be pushed :: 7");
		push(7);
		System.out.println("Element to be pushed :: 8");
		push(8);
		System.out.println("Elements in STACK::");
		for (int i : a)
			if (i != 0)
				System.out.print(i + " ");
		System.out.println("\nElement popped out :: " + pop());
	}

	static boolean isEmpty() {
		return (top < 0);
	}

	static boolean isFull() {
		return (top == MAX);
	}

	static void push(int element) {
		if (!isFull()) {
			top++;
			a[top] = element;
		} else {
			System.out.print("Stack is Full");
		}
	}

	static int pop() {
		int data;
		if (!isEmpty()) {
			data = a[top];
			top--;
			return data;
		} else {
			System.out.print("Stack is Empty");
		}
		return 0;
	}
}
