package com.operation;

import java.util.Stack;

public class Tree {

	private Node root;

	public Tree() {
		this.root = null;
	}

	public Node getRoot() {
		// Returns the root node of the tree.
		return root;
	}

	public boolean insert(int data) {
		// Inserts a new node with the given data into the tree.
		// Returns true if insertion is successful, false if data is already present.

		Node newNode = new Node(data);

		if (root == null) {
			// If the root is null, create a new node and assign it as the root
			root = newNode;
			return true;
		}

		Node temp = root;

		while (true) {

			// Check for duplication, if found, return false
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

	public int getMax() {
		// Finds the maximum value in the tree by traversing to the rightmost node.

		Node temp = root;

		while (temp.getRight() != null) {
			temp = temp.getRight();
		}

		return temp.getData();
	}

	public int getMin() {
		// Finds the minimum value in the tree by traversing to the leftmost node.

		Node temp = root;

		while (temp.getLeft() != null) {
			temp = temp.getLeft();
		}

		return temp.getData();
	}

	public boolean search(int data) {
		// Searches for the given data in the tree.
		// Returns true if the data is found, false otherwise.

		if (root == null) {
			// If the tree is empty, return false
			return false;
		}

		Node temp = root;
		if (data == temp.getData()) {
			// If the data is found at the root, return true
			return true;
		}

		// Traverse the tree to search for the given data
		if (data < temp.getData()) {
			temp = temp.getLeft();
		} else {
			temp = temp.getRight();
		}
		return false;
	}
}
