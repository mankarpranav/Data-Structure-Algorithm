package com.traversal;

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

	public void inorder(Node node) {
		if (node == null)
			return;
		inorder(node.getLeft());
		System.out.println(node.getData() + " ");
		inorder(node.getRight());
	}

	public void postorder(Node node) {
		if (node == null)
			return;
		postorder(node.getLeft());
		postorder(node.getRight());
		System.out.println(node.getData() + " ");
	}

	public void preorder(Node node) {
		if (node == null)
			return;
		System.out.println(node.getData() + " ");
		preorder(node.getLeft());
		preorder(node.getRight());
	}

}
