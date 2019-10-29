package Trees;

/**
 * @author Bishwajit.
 *
 */
public class SearchANodeInBinaryTree {

	static class Node {
		int key;
		Node left, right;

		Node(int data) {
			key = data;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node root = null;

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
		displayInorder(root);

		int keyElement = 52;
		boolean nodeExist = nodePresent(root, keyElement);
		if (nodeExist)
			System.out.println("\n" + keyElement + " Node is Present.");
		else
			System.out.println("\n" + keyElement + " Node is not Present.");
	}

	private static boolean nodePresent(Node node, int keyElement) {
		if (node == null)
			return false;
		if (node.key == keyElement)
			return true;
		boolean lPresent = nodePresent(node.left, keyElement);
		boolean rPresent = nodePresent(node.right, keyElement);
		return lPresent || rPresent;
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
