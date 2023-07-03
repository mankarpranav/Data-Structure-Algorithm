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

		// if root is null?
		// if NOT then check for duplication
		// if NOT then check whether data is less than data in parent node go to if part
		// if NOT then go to else part

		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return true;
		}

		Node temp = root;

		while (true) {

			// checking duplication

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
		// max will in the right corner as it is BST

		Node temp = root;

		while (temp.getRight() != null) {
			temp = temp.getRight();
		}

		return temp.getData();
	}

	public int getMin() {
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

		if (data < temp.getData()) {
			temp = temp.getLeft();
		} else {
			temp = temp.getRight();
		}
		return false;

	}
}
