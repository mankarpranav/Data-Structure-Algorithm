package com.operation;

import java.util.Stack;

public class Tree {

	private Node root;

	public Node getRoot() {
		return root;
	}

	public Tree() {
		this.root = null;
	}

	public boolean insert(int data) {

		// If the root is null, create a new node and assign it as the root
		// Otherwise, traverse the tree to find the appropriate position for the new node

		Node newNode = new Node(data);

		if (root == null) {
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
					temp.setLeft(newNode);
					return true;
				}

				temp = temp.getLeft();

			} else {

				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}

				temp = temp.getRight();

			}
		}

	}

	public int getMax() {
		// Find the maximum value by traversing to the rightmost node

		Node temp = root;

		while (temp.getRight() != null) {
			temp = temp.getRight();
		}

		return temp.getData();
	}

	public int getMin() {
		// Find the minimum value by traversing to the leftmost node

		Node temp = root;

		while (temp.getLeft() != null) {
			temp = temp.getLeft();
		}

		return temp.getData();
	}

	public boolean search(int data) {

		if (root == null) {
			return false;
		}

		Node temp = root;
		if (data == temp.getData()) {
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
