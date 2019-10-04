package linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Bishwajit.
 *
 */
public class LinkedListDetectALoop {
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

		// Detect a Loop in Linked List.
		detectLoop(head);

		// Creating a loop for testing
		// head.addr.addr.addr = head;
		// detectLoop(head);
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

	// Detect a Loop in Linked List.
	private static void detectLoop(Node node) {
		Set<Node> root = new HashSet<Node>();
		boolean found = false;
		while (node != null) {
			if (root.contains(node)) {
				found = true;
				break;
			}
			root.add(node);
			node = node.addr;
		}
		if (found) {
			System.out.println("Loop Found");
		} else {

			System.out.println("Loop Not Found");
		}
	}
}
