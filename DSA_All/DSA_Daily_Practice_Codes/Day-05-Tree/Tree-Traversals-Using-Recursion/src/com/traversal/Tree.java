package com.traversal;

public class Tree {

	private Node root;

	public Tree() {
		this.root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void insert(int data) {
		// Create a new node with the given data
		Node newNode = new Node(data);

		if (root == null) {
			// If the tree is empty, make the new node the root
			root = newNode;
			return;
		}

		Node temp = root;

		while (true) {
			if (data < temp.getData()) {
				// If the data is less than the current node's data, go to the left child
				if (temp.getLeft() == null) {
					// If the left child is null, insert the new node
					temp.setLeft(newNode);
					return;
				}
				temp = temp.getLeft();
			} else {
				// If the data is greater than or equal to the current node's data, go to the right child
				if (temp.getRight() == null) {
					// If the right child is null, insert the new node
					temp.setRight(newNode);
					return;
				}
				temp = temp.getRight();
			}
		}
	}

	public void inorder(Node node) {
		// Perform an inorder traversal of the tree

		if (node == null)
			return;

		// Visit the left subtree
		inorder(node.getLeft());

		// Visit the current node
		System.out.println(node.getData() + " ");

		// Visit the right subtree
		inorder(node.getRight());
	}

	public void postorder(Node node) {
		// Perform a postorder traversal of the tree

		if (node == null)
			return;

		// Visit the left subtree
		postorder(node.getLeft());

		// Visit the right subtree
		postorder(node.getRight());

		// Visit the current node
		System.out.println(node.getData() + " ");
	}

	public void preorder(Node node) {
		// Perform a preorder traversal of the tree

		if (node == null)
			return;

		// Visit the current node
		System.out.println(node.getData() + " ");

		// Visit the left subtree
		preorder(node.getLeft());

		// Visit the right subtree
		preorder(node.getRight());
	}

}
