package linkedList;

/**
 * @author Bishwajit.
 *
 */
public class LinkedListValueOfANode {

	static Node node;

	static class Node {
		int data;
		Node addr;

		public Node(int d) {
			data = d;
			addr = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.addr = new Node(2);
		head.addr.addr = new Node(3);
		head.addr.addr.addr = new Node(4);
		head.addr.addr.addr.addr = new Node(5);

		// Display Linked List
		display(head);

		valueOfNodeAtPosition(head, 3);
	}

	// Traversing Linked List.
	private static void display(Node node) {
		Node root = node;
		if (root == null) {
			System.out.println("EMPTY LINKED LIST");
		}
		while (root != null) {
			System.out.print(root.data + " ");
			root = root.addr;
		}
		System.out.println();
	}

	// Value of Nth Node
	private static void valueOfNodeAtPosition(Node head, int index) {
		Node root = head;
		int counter = 1;
		while (root != null) {
			root = root.addr;
			counter++;
			if (counter == index) {
				System.out.println("Element at Node present at " + index + " = " + root.data);
				break;
			}
		}
	}
}
