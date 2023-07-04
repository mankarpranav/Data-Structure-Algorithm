package com.traversal;

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

	public void postorder() {

		class Pair {
			Node node;
			char flag;

			Pair(Node node, char flag) {
				this.node = node;
				this.flag = flag;
			}
		}

		Node temp = root;
		Stack<Pair> stack = new Stack<>();

		while (temp != null || !stack.empty()) {
			while (temp != null) {
				stack.push(new Pair(temp, 'L'));
				temp = temp.getLeft();
			}

			Pair pair = stack.pop();
			if (pair.flag == 'L') {
				temp = pair.node.getRight();
				pair.flag = 'R';
				stack.push(pair);

			} else {
				System.out.println(pair.node.getData() + " ");
			}
		}

	}

}
