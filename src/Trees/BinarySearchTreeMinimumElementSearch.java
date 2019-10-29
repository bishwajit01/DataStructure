package Trees;

/**
 * @author Bishwajit.
 *
 */
public class BinarySearchTreeMinimumElementSearch {

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
		
		//Minimum Element
		if (root == null) {
			System.out.println("\nTREE IS EMPTY");
		} else {
			System.out.println("\nMinimum element in Tree is :: " + smallestNumber(root));
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
	
	public static int smallestNumber(Node node) {
		Node minimum = node;
		while (minimum.left != null) {
			minimum = minimum.left;
		}
		return minimum.key;
	}

}
