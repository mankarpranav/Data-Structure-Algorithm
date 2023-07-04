package com.operations;

import java.util.Stack;

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

		// If the tree is empty, make the new node the root
		if (root == null) {
			root = newNode;
			return;
		}

		Node temp = root;

		// Traverse the tree to find the appropriate position for insertion
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

	public int count(Node root) {
		// Count the number of nodes in the tree rooted at 'root'

		// Base case: if the root is null, return 0
		if (root == null) {
			return 0;
		}

		// Recursively count the nodes in the left and right subtrees
		// and add 1 for the current node
		return 1 + count(root.getLeft()) + count(root.getRight());
	}
}
