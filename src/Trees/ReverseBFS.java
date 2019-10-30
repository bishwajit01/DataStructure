package Trees;

/**
 * @author Bishwajit.
 *
 */
public class ReverseBFS {
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

		System.out.print("\nReverse Level Order Traversal or Reverse BFS :: ");
		printLevelOrder(root);
	}

	// Tree Traversal in BFS.
	public static void printLevelOrder(Node node) {
		int h = height(node);
		int i;
		for (i = h; i >= 1; i--) {
			printAtAGivenLevel(node, i);
		}
	}

	private static int height(Node node) {
		if (node == null) {
			return 0;
		} else {
			int lheight = height(node.left);
			int rheight = height(node.right);
			if (lheight > rheight) {
				return lheight + 1;
			} else {
				return rheight + 1;
			}
		}
	}

	private static void printAtAGivenLevel(Node node, int level) {
		if (node == null) {
			return;
		} else if (level == 1) {
			System.out.print(node.key + " ");
		} else if (level > 1){
			printAtAGivenLevel(node.left, level - 1);
			printAtAGivenLevel(node.right, level - 1);
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
