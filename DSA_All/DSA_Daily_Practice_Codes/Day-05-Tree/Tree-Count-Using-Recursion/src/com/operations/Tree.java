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

		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return;
		}

		Node temp = root;

		while (true) {
			if (data < temp.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return;
				}
				temp = temp.getRight();
			}
		}

	}

	public int count(Node root) {

		if (root == null) {
			return 0;
		}

		return 1 + count(root.getLeft()) + count(root.getRight());

	}
}
