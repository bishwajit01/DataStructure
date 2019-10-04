package linkedList;

/**
 * @author Bishwajit.
 *
 */
public class LinkedListReverse {

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

		// Reverse a Linked List.
		reverseLinkedList(head);
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

	// Reverse a LinkedList.
	private static void reverseLinkedList(Node node) {
		Node prev = null;
		Node next = null;
		Node current = node;
		while (current != null) {
			next = current.addr;
			current.addr = prev;
			prev = current;
			current = next;
		}
		node = prev;
		System.out.print("Reverse Linked List :: ");
		display(node);
	}
}
