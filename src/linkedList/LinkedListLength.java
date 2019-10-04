package linkedList;

/**
 * @author Bishwajit.
 *
 */
public class LinkedListLength {

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

		// Length of Linked List.
		lengthLinkedList(head);
	}

	// Traversing Linked List.
	private static void display(Node node) {
		Node root = node;
		if (root == null) {
			System.out.println("EMPTY LINKED LIST");
		}
		System.out.print("LINKED LIST :: ");
		while (root != null) {
			System.out.print(root.data + " ");
			root = root.addr;
		}
		System.out.println();
	}

	// Length of Linked List.
	private static void lengthLinkedList(Node node) {
		Node root = node;
		int length = 0;
		if (root == null) {
			System.out.println("Length of Linked List " + length);
			return;
		}
		while (root != null) {
			length++;
			root = root.addr;
		}
		System.out.println("Length of Linked List :: " + length);
	}
}
