package Trees;

/**
 * @author Bishwajit.
 *
 */
public class BoundaryTraversalOfBinaryTree {
	static Node root;

	static class Node {
		int key;
		Node left, right;

		Node(int data) {
			key = data;
			left = right = null;
		}
	}

	public static void main(String[] args) {

		// Pushing the elements.
		root = push(root, 40);
		root = push(root, 20);
		root = push(root, 10);
		root = push(root, 30);
		root = push(root, 60);
		root = push(root, 50);
		root = push(root, 70);
		root = push(root, 5);
		root = push(root, 13);
		root = push(root, 55);

		// Displaying the Tree.
		System.out.print("NODES IN A TREE :: ");
		displayInorder(root);

		printBoundaryNodes(root);
	}

	private static void printBoundaryNodes(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.key + " ");
		printBoundaryLeft(node.left);
		printLeaves(node.left);
		printLeaves(node.right);
		printBoundaryRight(node.right);
	}

	private static void printBoundaryLeft(Node node) {
		if (node == null) {
			return;
		}
		if (node.left != null) {
			System.out.print(node.key + " ");
			printBoundaryLeft(node.left);
		}

	}

	private static void printLeaves(Node node) {
		if (node == null) {
			return;
		}
		printLeaves(node.left);
		if (node.left == null && node.right == null) {
			System.out.print(node.key + " ");
		}
		printLeaves(node.right);
	}

	private static void printBoundaryRight(Node node) {
		if (node == null) {
			return;
		}
		if (node.right != null) {
			System.out.print(node.key + " ");
			printBoundaryLeft(node.right);
		}
	}

	public static Node push(Node node, int data) {
		if (node == null) {
			return new Node(data);
		} else {
			if (data < node.key) {
				node.left = push(node.left, data);
			} else {
				node.right = push(node.right, data);
			}
		}
		return node;
	}

	public static void displayInorder(Node node) {
		if (null != node) {
			displayInorder(node.left);
			System.out.print(node.key + " ");
			displayInorder(node.right);
		}
	}
}
