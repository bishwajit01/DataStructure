/**
 * 
 */
package linkedList;

/**
 * @author Bishwajit.
 *
 */
public class LinkedListTraversing {
	Node node;

	static class Node {
		int data;
		Node addr;

		Node(int d) {
			data = d;
			addr = null;
		}
	}

	public static void main(String[] args) {
		LinkedListTraversing list = new LinkedListTraversing();
		
		// Adding nodes to a Linked List.
		list.node = new Node(1);
		list.node.addr = new Node(2);
		list.node.addr.addr = new Node(3);
		list.node.addr.addr.addr = new Node(4);

		System.out.print("Linked List :: ");
		list.traversing(list.node);
	}

	public void traversing(Node head) {
		Node root = head;
		while (null != root) {
			System.out.print(root.data + " ");
			root = root.addr;
		}
		System.out.println();
	}

}
