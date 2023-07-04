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
		// Create a new node with the given data
		Node newNode = new Node(data);

		// If the tree is empty, make the new node the root
		if (root == null) {
			root = newNode;
			return;
		}

		Node temp = root;

		// Traverse the tree to find the appropriate position for insertion
		while (true) {
			if (data < temp.getData()) {
				// If the data is less than the current node's data, go to the left child
				if (temp.getLeft() == null) {
					// If the left child is null, insert the new node
					temp.setLeft(newNode);
					return;
				}
				temp = temp.getLeft();
			} else {
				// If the data is greater than or equal to the current node's data, go to the right child
				if (temp.getRight() == null) {
					// If the right child is null, insert the new node
					temp.setRight(newNode);
					return;
				}
				temp = temp.getRight();
			}
		}
	}

	public void postorder() {

		// Create a nested class Pair to store a node and its flag
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
				// Traverse to the leftmost node and push each node along with 'L' flag onto the stack
				stack.push(new Pair(temp, 'L'));
				temp = temp.getLeft();
			}

			Pair pair = stack.pop();
			if (pair.flag == 'L') {
				// If the flag is 'L', it means we have visited the left subtree
				// Change the flag to 'R' and push the node back onto the stack
				temp = pair.node.getRight();
				pair.flag = 'R';
				stack.push(pair);
			} else {
				// If the flag is 'R', it means we have visited both the left and right subtrees
				// Print the data of the node
				System.out.print(pair.node.getData() + " ");
			}
		}
	}
}
