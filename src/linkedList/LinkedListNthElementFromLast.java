package linkedList;

/**
 * @author Bishwajit.
 *
 */
public class LinkedListNthElementFromLast {

	public static void main(String[] args) {
		int last = 60;
		Node head = new Node(4);
		head = push(head, 6);
		head = push(head, 8);
		head = push(head, 10);
		head = push(head, 12);
		head = push(head, 14);
		head = push(head, 16);
		head = push(head, 18);
		head = push(head, 20);

		display(head);

		int data = nthLastElement(head, last);
		if (data == -100) {
			System.out
					.println("Searching for last element, but nth element is more than the length of the Linked List");
		} else {
			System.out.println("Nth(" + last + ") Element from last :: " + data);
		}
	}

	static int nthLastElement(Node node, int last) {
		int length = 0;
		Node temp = node;
		while (temp != null) {
			length++;
			temp = temp.addr;
		}
		if (last <= length) {
			for (int i = 1; i < length - last + 1; i++) {
				node = node.addr;
			}
		} else {
			return -100;
		}
		return node.data;
	}

	static Node push(Node node, int data) {
		Node newNode = new Node(data);
		newNode.addr = node;
		return newNode;

	}

	static void display(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.addr;
		}
		System.out.println();
	}
}

class Node {
	int data;
	Node addr;

	public Node(int d) {
		this.data = d;
		addr = null;
	}
}