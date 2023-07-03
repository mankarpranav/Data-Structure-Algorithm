package com.traversal;

import java.util.Stack;

public class Tree {

	private Node root;

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

	public void inorderNormal() {

		Node temp = root;
		Stack<Node> stack = new Stack<>();

		while (temp != null || !stack.empty()) {

			while (temp != null) {
				stack.push(temp);
				temp = temp.getLeft();
			}

			temp = stack.pop();
			System.out.print(temp.getData() + " ");
			temp = temp.getRight();

		}
	}

	public void inorderRec(Node node) {
		if (node == null)
			return;

		inorderRec(node.getLeft());
		System.out.print(node.getData() + " ");
		inorderRec(node.getRight());

	}

	public Node getRoot() {
		return root;
	}

}
