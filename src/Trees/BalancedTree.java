package Trees;

/**
 * @author Bishwajit.
 * 
 *         A Tree is balanced, if :: 
 *         1. Left subtree of T is balanced.
 *         2. Right subtree of T is balanced. 
 *         3. The difference between heights of left subtree and right subtree is not more than 1.
 *
 */
public class BalancedTree {
	Node root;
	Height height;

	static class Node {
		int data;
		Node right, left;

		public Node(int d) {
			data = d;
			right = left = null;
		}
	}

	static class Height {
		int treeHeight = 0;
	}

	public static void main(String[] args) {

		Node root = new Node(1);
		Height h = new Height();

		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		// Add this node to make take unbalanced.
		// root.left.left.left = new Node(8);

		// Check if balanced tree.
		// Complexities :: O(n^2)
		if (isBalanced(root)) {
			System.out.println("Balanced Tree");
		} else {
			System.out.println("Not a Balanced Tree");
		}

		// Complexities :: O(n)
		if (isBalancedTree(root, h)) {
			System.out.println("Balanced Tree");
		} else {
			System.out.println("Not a Balanced Tree");
		}
	}

	private static boolean isBalanced(Node node) {
		int lh = 0, rh = 0;
		if (node == null)
			return true;
		lh = height(node.left);
		rh = height(node.right);
		if ((Math.abs(lh - rh) <= 1) && (isBalanced(node.left)) && (isBalanced(node.right))) {
			return true;
		}
		return false;
	}

	private static int height(Node node) {
		if (node == null)
			return 0;
		return 1 + Math.max(height(node.left), height(node.right));
	}

	private static boolean isBalancedTree(Node node, Height h) {
		if (node == null) {
			h.treeHeight = 0;
			return true;
		}
		Height lheight = new Height();
		Height rheight = new Height();

		boolean l = isBalancedTree(node.left, lheight);
		boolean r = isBalancedTree(node.right, rheight);

		int left = lheight.treeHeight;
		int right = rheight.treeHeight;

		h.treeHeight = (left > right ? left : right) + 1;

		if (Math.abs(left - right) >= 2) {
			return false;
		} else {
			return l && r;
		}
	}
}
