package Trees;

/**
 * @author Bishwajit. TREE TRAVERSAL :: 1. BFS. 2. DFS :: PostOrder, PreOrder
 *         and InOrder.
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

		System.out.print("\nLevel Order Traversal or BFS :: ");
		tree.printLevelOrder(tree.root);
	}

	// TREE TRAVERSAL in DFS USING POST-ORDER.
	public void displayPostOrder(Node node) {
		if (node == null)
			return;
		displayPostOrder(node.left);
		displayPostOrder(node.right);
		System.out.print(node.key + " ");
	}

	// TREE TRAVERSAL in DFS USING IN-ORDER.
	public void displayInOrder(Node node) {
		if (node == null)
			return;
		displayPostOrder(node.left);
		System.out.print(node.key + " ");
		displayPostOrder(node.right);
	}

	// TREE TRAVERSAL in DFS USING PRE-ORDER.
	public void displayPreOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.key + " ");
		displayPostOrder(node.left);
		displayPostOrder(node.right);
	}

	// Tree Traversal in BFS.
	public void printLevelOrder(Node node) {
		int h = height(node);
		int i;
		for (i = 1; i <= h; i++) {
			printAtAGivenLevel(node, i);
		}
	}

	private int height(Node node) {
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

	private void printAtAGivenLevel(Node node, int level) {
		if (root == null) {
			return;
		} else if (level == 1) {
			System.out.print(node.key + " ");
		} else {
			printAtAGivenLevel(root.left, level - 1);
			printAtAGivenLevel(root.right, level - 1);
		}
	}
}
