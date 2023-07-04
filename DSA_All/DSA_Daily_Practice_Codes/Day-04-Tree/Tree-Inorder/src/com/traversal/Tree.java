package com.traversal;

import java.util.Stack;

public class Tree {

	private Node root;

	public Tree() {
		this.root = null;
	}

	public boolean insert(int data) {
		// Inserts a new node with the given data into the tree.
		// Returns true if insertion is successful, false if data is already present.

		Node newNode = new Node(data);

		if (root == null) {
			// If the tree is empty, make the new node the root
			root = newNode;
			return true;
		}

		Node temp = root;

		while (true) {

			// Check for duplication
			if (temp.getData() == data) {
				return false;
			}

			if (data < temp.getData()) {

				if (temp.getLeft() == null) {
					// If the left child is null, insert the new node
					temp.setLeft(newNode);
					return true;
				}

				temp = temp.getLeft();

			} else {

				if (temp.getRight() == null) {
					// If the right child is null, insert the new node
					temp.setRight(newNode);
					return true;
				}

				temp = temp.getRight();

			}
		}
	}

	public void inorderNormal() {
		// Performs a normal inorder traversal of the tree (iterative approach).
		// Prints the node values in inorder traversal order.

		Node temp = root;
		Stack<Node> stack = new Stack<>();

		while (temp != null || !stack.empty()) {

			while (temp != null) {
				stack.push(temp);
				temp = temp.getLeft();
				// Go to the left child until it's null
			}

			temp = stack.pop();
			System.out.print(temp.getData() + " "); // Print the node value
			temp = temp.getRight();

		}
		System.out.println(); // Add a newline character after traversal
	}

	public void inorderRec(Node node) {
		// Performs a recursive inorder traversal of the tree.
		// Prints the node values in inorder traversal order.

		if (node == null)
			return;

		inorderRec(node.getLeft());
		System.out.print(node.getData() + " "); // Print the node value
		inorderRec(node.getRight());

	}

	public Node getRoot() {
		// Returns the root node of the tree.
		return root;
	}

}
