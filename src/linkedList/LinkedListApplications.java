/**
 * 
 */
package linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Bishwajit.
 *
 */
public class LinkedListApplications {

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

		// Length of Linked List.
		lengthLinkedList(head);
		
		// Detect a Loop in Linked List.
		detectLoop(head);
		// Creating a loop for testing
		head.addr.addr.addr = head;
		detectLoop(head);
	}

	// Traversing Linked List.
	public static void display(Node node) {
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

	// Middle Element of LinkedList
	public static void middleElement(Node node) {
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

	// Length of Linked List.
	public static void lengthLinkedList(Node node) {
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

	// Detect a Loop in Linked List.
	public static void detectLoop(Node node) {
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
