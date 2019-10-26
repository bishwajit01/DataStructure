package Trees;

/**
 * @author Bishwajit.
 *
 */
public class DepthOfTree {

	static class Node {
		int key;
		Node left, right;

		Node(int data) {
			key = data;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node root;
		root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);

		root.left.left = new Node(40);
		root.left.right = new Node(50);

		root.right.left = new Node(60);
		root.right.right = new Node(70);

		int maxDepth = maximumDepth(root);
		System.out.println("Max Depth of a tree ::" + maxDepth);

	}

	private static int maximumDepth(Node node) {
		if (node == null) {
			return 0;
		}
		int leftDepth = maximumDepth(node.left);
		int rightDepth = maximumDepth(node.right);
		if (leftDepth > rightDepth)
			return leftDepth + 1;
		else
			return rightDepth + 1;
	}
}
