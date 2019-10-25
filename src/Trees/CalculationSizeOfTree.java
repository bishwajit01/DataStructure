package Trees;

/**
 * @author Bishwajit.
 *
 */
public class CalculationSizeOfTree {

	public static void main(String[] args) {
//		CalculationSizeOfTree tree = new CalculationSizeOfTree();
		Node root;
		root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);

		root.left.left = new Node(40);
		root.left.right = new Node(50);

		root.right.left = new Node(60);
		root.right.right = new Node(70);
		
		System.out.println("Size of Tree :: " + size(root));
	}

	public static int size(Node node) {
		if (node == null)
			return 0;
	return size(node.left) + 1 + size(node.right);
	}

}

class Node {
	int data;
	Node left, right;

	Node(int d) {
		data = d;
		left = right = null;
	}
}
