package dsaPractice;

public class BinarySearchTree {

	class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}
	}

	Node root;

	public void insertNode(int val) {
		root = insertNode(root, val);
	}

	public Node insertNode(Node root, int val) {

		if (root == null) {
			root = new Node(val);
			return root;
		}
		if (val < root.val)
			root.left = insertNode(root.left, val);

		else if (val > root.val)
			root.right = insertNode(root.right, val);

		return root;
	}

	public void inorderTraverse() {
		inorderTraversal(root);
	}

	public void inorderTraversal(Node root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.println(root.val);
			inorderTraversal(root.right);
		}
	}

	public int minElement() {
		return getMinElement(root);
	}

	private int getMinElement(Node root) {
		Node curr = root;
		while (curr.left != null) {
			curr = curr.left;
		}
		return curr.val;
	}

	public int maxElement() {
		return getMaxElement(root);
	}

	private int getMaxElement(Node root) {
		Node curr = root;
		while (curr.right != null) {
			curr = curr.right;
		}
		return curr.val;
	}

	public int height() {
		return getHeight(root);
	}

	private int getHeight(Node root) {
		if (root == null) {
			return -1;
		}
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}

	public boolean search(int val) {
		return valueSearch(root, val);
	}

	private boolean valueSearch(Node root, int val) {
		if (root == null)
			return false;

		if (val == root.val)
			return true;

		if (val > root.val)
			return valueSearch(root.right, val);
		else
			return valueSearch(root.left, val);
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insertNode(4);
		tree.insertNode(6);
		tree.insertNode(12);
		tree.insertNode(3);
		tree.insertNode(9);
		tree.insertNode(7);
		tree.insertNode(14);
		tree.insertNode(2);
		tree.insertNode(0);

		tree.inorderTraverse();
		System.out.println(tree.minElement());
		System.out.println(tree.maxElement());
		System.out.println(tree.height());
		System.out.println(tree.search(78));

	}

}
