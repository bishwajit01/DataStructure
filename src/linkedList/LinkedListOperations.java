/**
 * 
 */
package linkedList;

/**
 * @author Bishwajit.
 *
 */
public class LinkedListOperations {
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
		LinkedListOperations list = new LinkedListOperations();

		// Pushing into Head.
		list.pushHead(1);
		list.pushHead(2);
		list.pushHead(3);
		System.out.println("PUSH HEAD :: ");
		list.display(list.node);

		// Appending into Linked List
		System.out.println("APPENDING ::");
		list.append(12);
		list.display(list.node);

		// Insert After
		System.out.println("INSERT AFTER :: ");
		list.insertAfter(list.node.addr, 5);
		list.display(list.node);

		// Delete At a Position.
		System.out.println("DELETE AA KEY :: ");
		list.deleteAtPosition(2);
		list.display(list.node);

		// Delete at the end.
		System.out.println("DELETE AT END :: ");
		list.deleteEnd();
		list.display(list.node);

		// Delete Linked List
		System.out.println("DELETE LINKED LIST");
		list.deleteLinkedList();
		list.display(list.node);
	}

	// Traversing Linked List.
	void display(Node node) {
		if (node == null)
			System.out.print("EMPTY LINKED LIST");
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.addr;
		}
		System.out.println();
	}

	// Pushing into the head.
	void pushHead(int data) {
		Node root = new Node(data);
		root.addr = node;
		node = root;
	}

	// Appending Linked List
	void append(int data) {
		Node n = new Node(data);
		if (null == node) {
			node = new Node(data);
			return;
		}
		n.addr = null;
		Node last = node;
		while (last.addr != null) {
			last = last.addr;
		}
		last.addr = n;
		return;
	}

	// Insert After.
	void insertAfter(Node previousNode, int data) {
		if (null == previousNode) {
			System.out.println("PreviousNode cannot be null");
			return;
		}
		Node newNode = new Node(data);
		newNode.addr = previousNode.addr;
		previousNode.addr = newNode;
	}

	// Deleting a Linked List.
	void deleteLinkedList() {
		node = null;
	}

	// Deleting Node from Head.
	void pop() {
		Node primary = node;
		if (node == null) {
			System.out.println("LinkedList is Empty.");
			return;
		}
		node = primary.addr;
	}

	// Delete a Node.
	void deleteAtPosition(int key) {
		if (node == null) {
			System.out.println("Linked List is empty");
			return;
		}
		Node nodeTemp = node;
		for (int i = 0; nodeTemp != null && i < key - 1; i++) {
			nodeTemp = nodeTemp.addr;
		}
		Node headNew = nodeTemp.addr.addr;
		nodeTemp.addr = headNew;
	}

	// Delete at End.
	void deleteEnd() {
		Node current = node;
		if (current == null) {
			System.out.println("LIST IS EMPTY");
			return;
		}
		while (current != null) {
			if (current.addr.addr == null) {
				current.addr = null;
				break;
			} else {
				current = current.addr;
			}
		}
	}

}
