package com.traversal;

import java.util.Stack;

public class Tree {

	private Node root;

	public Tree() {
		this.root = null;
	}

	public void insert(int data) {
		// Inserts a new node with the given data into the tree.
		// If the data already exists, it will not be inserted.

		Node newNode = new Node(data);

		if (root == null) {
			// If the root is null, assign the new node as the root
			root = newNode;
			return;
		}

		Node temp = root;

		while (true) {

			// Check for duplication, if found, return
			if (data == temp.getData()) {
				return;
			}

			if (data < temp.getData()) {

				if (temp.getLeft() == null) {
					// If the left child is null, insert the new node
					temp.setLeft(newNode);
					return;
				}

				temp = temp.getLeft();
			} else {

				if (temp.getRight() == null) {
					// If the right child is null, insert the new node
					temp.setRight(newNode);
					return;
				}

				temp = temp.getRight();
			}
		}
	}

	public Node getRoot() {
		// Returns the root node of the tree.
		return root;
	}

	public void postorderNormal() {
		// Performs postorder traversal of the tree iteratively using a stack.

		Node temp = root;
		Stack<Node> stack = new Stack<>();

		while (true) {
			while (temp != null) {
				// Traverse to the leftmost node and push each node to the stack
				stack.push(temp);
				temp = temp.getLeft();
			}

			if (stack.isEmpty()) {
				// If the stack is empty, traversal is complete
				return;
			}

			if (stack.peek().getRight() == null) {
				// If the right child of the node at the top of the stack is null, visit the node
				temp = stack.pop();
				System.out.println(temp.getData() + " ");
				
				// Check if the node is the right child of the previous node
				// If so, visit the previous node as well
				while (!stack.isEmpty() && temp == stack.peek().getRight()) {
					temp = stack.pop();
					System.out.println(temp.getData() + " ");
				}
			}

			if (!stack.isEmpty()) {
				// If the stack is not empty, set the current node to the right child of the node at the top of the stack
				temp = stack.peek().getRight();
			} else {
				// If the stack is empty, traversal is complete
				temp = null;
			}
		}
	}

	public void postorderRec(Node node) {
		// Performs postorder traversal of the tree recursively.

		if (node == null)
			return;

		postorderRec(node.getLeft());
		postorderRec(node.getRight());
		System.out.println(node.getData() + " ");
	}

}
