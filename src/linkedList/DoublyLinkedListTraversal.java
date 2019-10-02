package linkedList;

/**
 * @author Bishwajit.
 *
 */
public class DoublyLinkedListTraversal {
	Node head;

	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			this.data = d;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedListTraversal dll = new DoublyLinkedListTraversal();
		dll.head = new Node(10);
		dll.head.next = new Node(20);
		dll.head.next.next = new Node(30);
		
		displayDLL(dll.head);
	}

	private static void displayDLL(Node node) {
		Node root = node;
		while (null != root) {
			System.out.print(root.data + " ");
			root = root.next;
		}
	}

}
