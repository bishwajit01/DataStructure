package Trees;

/**
 * @author Bishwajit.
 *
 */
public class MirrorTreeOfABinaryTree {

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

		root = mirrorTree(root);
		// Displaying the Mirror Tree.
		System.out.print("\nNODES IN A TREE :: ");
		displayInorder(root);
	}

	private static Node mirrorTree(Node node) {
		if (node == null)
			return node;
		Node lNode = mirrorTree(node.left);
		Node rNode = mirrorTree(node.right);
		node.left = rNode;
		node.right = lNode;
		return node;
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
