package Trees;

/**
 * @author Bishwajit.
 * Density of a Tree = Size of the Tree / Height of the Tree.
 *
 */
public class DensityOfBinaryTree {
	static Node root;
	static int size;

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

		densityOfTree(root);

	}

	private static void densityOfTree(Node node) {
		if (node == null) {
			System.out.println("\nDensity of Tree is = 0");
		}
		int height = heightOfTree(node);
		double density = size / (height * 1.0);
		System.out.println("\nDensity of Tree = " + density);
	}

	private static int heightOfTree(Node node) {
		if (node == null)
			return 0;
		size = size + 1;
		int left = heightOfTree(node.left);
		int right = heightOfTree(node.right);
		return (left > right) ? (left + 1) : (right + 1);
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
