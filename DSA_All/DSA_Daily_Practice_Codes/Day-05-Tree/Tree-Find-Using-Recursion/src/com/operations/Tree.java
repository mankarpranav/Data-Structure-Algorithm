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

	public boolean find(int key, Node root) {
		// Recursively search for a key in the tree starting from the given root

		if (root == null)
			return false;

		if (key == root.getData()) {
			// If the key is found at the current node, return true
			return true;
		}

		if (key < root.getData()) {
			// If the key is less than the current node's data, go to the left subtree
			return find(key, root.getLeft());
		} else {
			// If the key is greater than the current node's data, go to the right subtree
			return find(key, root.getRight());
		}
	}
}
