package com.traversal;

import java.util.Stack;

public class Tree {

	private Node root;

	public Tree() {
		this.root = null;
	}

	public boolean insert(int data) {

		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
		}

		Node temp = root;

		while (true) {

			if (data == temp.getData()) {
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

	public void postorder() {

		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();

		s1.push(root);

		while (!s1.isEmpty()) {
			Node t = s1.pop();
			s2.push(t);

			if (t.getLeft() != null)
				s1.push(t.getLeft());
			if (t.getRight() != null)
				s1.push(t.getRight());

		}

		while (!s2.isEmpty()) {
			Node t = s2.pop();
			System.out.println(t.getData() + " ");
		}
	}

}
