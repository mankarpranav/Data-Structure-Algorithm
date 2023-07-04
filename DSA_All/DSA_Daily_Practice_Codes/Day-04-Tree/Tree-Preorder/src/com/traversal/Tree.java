package com.traversal;

import java.util.Stack;

public class Tree {

	private Node root;

	public Tree() {
		this.root = null;
	}

	public void insert(int data) {
		// Inserts a new node with the given data into the tree.

		Node newNode = new Node(data);

		if (root == null) {
			// If the tree is empty, make the new node the root
			root = newNode;
			return;
		}

		Node temp = root;

		while (true) {

			// Check for duplication
			if (data == temp.getData()) {
				return;
			}

			if (data < temp.getData()) {
				// If the data is less than the current node's data, go to the left child
				if (temp.getLeft() == null) {
					// If the left child is null, insert the new node
					temp.setLeft(newNode);
					return;
				}

				temp = temp.getLeft();
			} else {
				// If the data is greater than the current node's data, go to the right child
				if (temp.getRight() == null) {
					// If the right child is null, insert the new node
					temp.setRight(newNode);
					return;
				}

				temp = temp.getRight();
			}
		}
	}

	public void preorderNormal() {
		// Performs a normal preorder traversal of the tree (iterative approach).
		// Prints the node values in preorder traversal order.

		Node temp = root;
		Stack<Node> stack = new Stack<>();

		while (temp != null || !stack.empty()) {
			while (temp != null) {
				System.out.print(temp.getData() + " "); // Print the node value
				stack.push(temp);
				temp = temp.getLeft();
				// Go to the left child until it's null
			}
			temp = stack.pop().getRight();
			// After reaching the leftmost node, go to the right child
		}
		System.out.println(); // Add a newline character after traversal
	}

	public void preorderRec(Node node) {
		// Performs a recursive preorder traversal of the tree.
		// Prints the node values in preorder traversal order.

		if (node == null) {
			return;
		}

		System.out.print(node.getData() + " "); // Print the node value
		preorderRec(node.getLeft());
		preorderRec(node.getRight());
	}

	public Node getRoot() {
		// Returns the root node of the tree.
		return root;
	}

}
