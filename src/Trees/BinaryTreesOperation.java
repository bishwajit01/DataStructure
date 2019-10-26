package Trees;

/**
 * @author Bishwajit.
 *
 */
public class BinaryTreesOperation {

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
		BinaryTreesOperation tree = new BinaryTreesOperation();

		// Pushing the elements.
		root = tree.push(root, 40);

		// Tree traversal in In-Order.
		System.out.println("-----PUSHING 40-----");
		System.out.print("INORDER :: ");
		tree.displayInorder(root);

		// Pushing the elements.
		root = tree.push(root, 20);
		root = tree.push(root, 10);
		root = tree.push(root, 30);
		root = tree.push(root, 60);
		root = tree.push(root, 50);
		root = tree.push(root, 70);
		root = tree.push(root, 5);
		root = tree.push(root, 13);
		root = tree.push(root, 55);

		// Displaying the tree in In-Order.
		System.out.println("\n\n-----PUSHING ELEMENTS-----");
		System.out.print("INORDER :: ");
		tree.displayInorder(root);

		// Deleting the last leaf.
		root = tree.deletion(root, 13);

		// Displaying the tree after Deleting.
		System.out.println("\n\n-----DELETING 13-----");
		System.out.print("INORDER :: ");
		tree.displayInorder(root);

		// Deleting the last leaf.
		root = tree.deletion(root, 40);

		// Displaying the tree after Deleting.
		System.out.println("\n\n-----DELETING 40-----");
		System.out.print("INORDER :: ");
		tree.displayInorder(root);
		
		//Deletion of A whole Tree
		root = tree.deleteTree(root);
		System.out.println("\n\n-----DELETING TREE-----");
		if (root == null) {
			System.out.println("*******EMPTY TREE******");
		}
	}

	// Insertion in Tree.
	public Node push(Node node, int data) {
		if (null == node) {
			node = new Node(data);
			return node;
		}
		if (data < node.key)
			node.left = push(node.left, data);
		else
			node.right = push(node.right, data);
		return node;
	}

	// Deletion of a key in Binary Tree.
	public Node deletion(Node node, int key) {
		if (node == null) {
			return node;
		}
		if (node.key > key) {
			node.left = deletion(node.left, key);
		} else if (node.key < key) {
			node.right = deletion(node.right, key);
		} else {
			if (node.left != null && node.right != null) {
				Node temp = node;
				Node minNodeRight = minimumElement(temp.right);
				node.key = minNodeRight.key;
				deletion(node.right, minNodeRight.key);
			} else if (node.left != null) {
				node = node.left;
			} else if (node.right != null) {
				node = node.right;
			} else {
				node = null;
			}
		}
		return node;
	}

	// Minimum Element in Binary Tree.
	private Node minimumElement(Node node) {
		if (node.left == null) {
			return node;
		} else {
			return minimumElement(node.left);
		}
	}

	// Deletion of a Binary Tree.
	public Node deleteTree(Node node) {
		node = null;
		return node;
	}

	// Display Binary Tree.
	public void displayInorder(Node node) {
		if (null != node) {
			displayInorder(node.left);
			System.out.print(node.key + " ");
			displayInorder(node.right);
		}
	}
}
