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

	public void postorder() {

		class Pair {
			Node node;
			char flag;

			public Pair(Node node, char flag) {
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

	public boolean delete(int data) {
		// if root is null
		if (root == null) {
			return false;
		}

		// set parent, del for tree
		Node p = root, del = root;

		// locate the node
		while (data != del.getData()) {

			if (data < del.getData()) {
				p = del;
				del = del.getLeft();
			} else {
				p = del;
				del = del.getRight();
			}

			// if data not exist
			if (del == null) {
				return false;
			}

		}

		while (true) {

			// if data is in terminal node
			if (del.getLeft() == null && del.getRight() == null) {

				// if root is only node in tree
				if (root == del) {
					root = null;
					return true;
				}

				// if tree has more than one nodes
				if (p.getLeft() == del) {
					p.setLeft(null);
				} else {
					p.setRight(null);
				}

				return true;

			}

			// if data is in non-terminal node
			if (del.getLeft() != null) {
				// set parent(p),max
				// get max from left subtree
				// swap before deletion
				// delete

				p = del;
				Node max = del.getLeft();

				while (max.getRight() != null) {
					p = max;
					max = max.getRight();
				}

				// now, del, p, max are settled
				// swap data from del and max

				int temp = del.getData();
				del.setData(max.getData());
				max.setData(temp);

				// set del to max; as we moved node to terminal
				del = max;

			} else {
				// set p, del
				// set min in right subtree
				// swap
				// delete

				p = del;
				Node min = del.getRight();

				// traverse
				while (min.getLeft() != null) {
					p = min;
					min = min.getLeft();
				}

				int temp = min.getData();
				min.setData(del.getData());
				del.setData(temp);

				// set del to min
				del = min;
			}

		}

	}

}
