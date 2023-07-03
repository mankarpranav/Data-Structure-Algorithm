package com.traversal;

import java.util.Stack;

public class Tree {

	private Node root;

	public Tree() {
		this.root = null;
	}

	public void insert(int data) {

		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return;
		}

		Node temp = root;

		while (true) {

			// duplication
			if (data == temp.getData()) {
				return;
			}

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

	public void preorderNormal() {

		Node temp = root;
		Stack<Node> stack = new Stack<>();

		while (temp != null || !stack.empty()) {
			while (temp != null) {
				System.out.println(temp.getData() + " ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop().getRight();
		}

	}

	public void preorderRec(Node node) {

		if (node == null) {
			return;
		}

		System.out.print(node.getData() + " ");
		preorderRec(node.getLeft());
		preorderRec(node.getRight());
	}

	public Node getRoot() {
		return root;
	}

}
