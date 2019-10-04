package linkedList;

/**
 * @author Bishwajit.
 *
 */
public class DoublyLinkedListDeletion {

	static Node node;

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int d) {
			this.data = d;
			next = prev = null;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedListDeletion dll = new DoublyLinkedListDeletion();

		// PUSHING INTO THE DOUBLY LINKED LIST.
		dll.push(60);
		dll.push(50);
		dll.push(40);
		dll.push(30);
		dll.push(20);
		dll.push(10);

		// DISPLAY
		System.out.println("-------DISPLAYING DOUBLY LINKED LIST------");
		dll.display(node);

		// DELETING THE HEAD.
		dll.deleteANodeAtAGivenPosition(node, node);
		System.out.println("------DELETING HEAD------");
		dll.display(node);
		
		// DELETING THE MIDDLE.
		dll.deleteANodeAtAGivenPosition(node, node.next.next);
		System.out.println("------DELETING MIDDLE------");
		dll.display(node);
		
		// DELETING THE END.
		dll.deleteANodeAtAGivenPosition(node, node.next.next.next);
		System.out.println("------DELETING END------");
		dll.display(node);
	}

	private void deleteANodeAtAGivenPosition(Node head, Node nodeDelete) {

		// Base case
		if (head == null || nodeDelete == null) {
			return;
		}

		// If node to be deleted is head node.
		if (head == nodeDelete) {
			node = nodeDelete.next;
		}

		// Change next only if node to be deleted is NOT the last node.
		if (nodeDelete.next != null) {
			nodeDelete.next.prev = nodeDelete.prev;
		}

		// Change prev only if node to be deleted is NOT the first node.
		if (nodeDelete.prev != null) {
			nodeDelete.prev.next = nodeDelete.next;
		}
	}

	private void display(Node head) {
		Node root = node;
		if (root == null) {
			System.out.println("EMPTY LINKED LIST");
		}
		System.out.print("LINKED LIST :: ");
		while (root != null) {
			System.out.print(root.data + " ");
			root = root.next;
		}
		System.out.println();
		System.out.println();
	}

	// Pushing into HEAD.
	private void push(int new_data) {

		Node new_Node = new Node(new_data);

		new_Node.next = node;
		new_Node.prev = null;

		if (node != null)
			node.prev = new_Node;

		// 5. move the head to point to the new node
		node = new_Node;
	}

}
