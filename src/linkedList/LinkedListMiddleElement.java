package linkedList;

/**
 * @author Bishwajit.
 *
 */
public class LinkedListMiddleElement {

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

		// Middle Element of Linked List.
		middleElement(head);
	}

	// Middle Element of LinkedList
	private static void middleElement(Node node) {
		Node slow = node;
		Node fast = node;
		if (node == null) {
			System.out.println("Empty LinkedList");
			return;
		}
		while (fast != null && fast.addr != null) {
			slow = slow.addr;
			fast = fast.addr.addr;
		}
		System.out.println("Middle Element of Linekd List :: " + slow.data);
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
}
