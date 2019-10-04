package linkedList;

/**
 * @author Bishwajit.
 *
 */
public class DoublyLinkedListOperation {
	static Node node;

	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			this.data = d;
			prev = next = null;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedListOperation dll = new DoublyLinkedListOperation();

		// Displaying When Doubly Linked List.
		dll.display(node);

		// PUSHING INTO HEAD OF DOUBLY LINKED LIST.
		dll.pushHead(10);
		dll.pushHead(20);
		dll.pushHead(30);
		dll.pushHead(40);
		dll.display(node);

		// APPENDING THE NODE
		dll.append(15);
		dll.display(node);

		// Printing in the Reverse Order.
		dll.reverseDisplay();
		dll.display(node);
	}

	private void append(int data) {
		Node new_node = new Node(data);
		Node last = node;
		new_node.next = null;

		if (isEmpty(last)) {
			new_node.prev = null;
			node = new_node;
			return;
		}
		while (last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		new_node.prev = last;
	}

	private void pushHead(int new_data) {
		Node new_node = new Node(new_data);
		new_node.prev = null;
		new_node.next = node;
		
		if (!isEmpty(node)) { 
			node.prev = new_node; 
		}
		node = new_node;
	}

	private void display(Node head) {
		Node root = head;
		if (isEmpty(root)) {
			return;
		}
		System.out.print("DOUBLY LINKED LIST :: ");
		while (root != null) {
			System.out.print(root.data + " ");
			root = root.next;
		}
		System.out.println();

	}

	private boolean isEmpty(Node node) {
		if (node == null) {
			System.out.println("EMPTY DOUBLY LINEKD LIST");
			return true;
		}
		return false;
	}

	private void reverseDisplay() {
		System.out.print("REVERSE ");
		if (isEmpty(node)) {
			return;
		}
		Node temp = null;
		Node current = node;
		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		if (temp != null) {
			node = temp.prev;
		}
	}
}
