package Trees;

/**
 * @author Bishwajit.
 *
 */
public class TreeTraversal {
	Node root;

	static class Node {
		int key;
		Node left, right;

		Node(int data) {
			key = data;
			left = right = null;
		}
	}

	public static void main(String[] args) {

		TreeTraversal tree = new TreeTraversal();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		
		tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(70);

		System.out.print("\nPOST ORDER :: ");
		tree.displayPostOrder(tree.root);
		
		System.out.print("\nIN ORDER :: ");
		tree.displayInOrder(tree.root);
		
		System.out.print("\nPRE ORDER :: ");
		tree.displayPreOrder(tree.root);
	}

	// TREE TRAVERSAL in POST ORDER
	public void displayPostOrder(Node node) {
		if (node == null)
			return;
		displayPostOrder(node.left);
		displayPostOrder(node.right);
		System.out.print(node.key + " ");
	}

	// TREE TRAVERSAL in IN ORDER
	public void displayInOrder(Node node) {
		if (node == null)
			return;
		displayPostOrder(node.left);
		System.out.print(node.key + " ");
		displayPostOrder(node.right);
	}

	// TREE TRAVERSAL in PRE ORDER
	public void displayPreOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.key + " ");
		displayPostOrder(node.left);
		displayPostOrder(node.right);
	}
}
