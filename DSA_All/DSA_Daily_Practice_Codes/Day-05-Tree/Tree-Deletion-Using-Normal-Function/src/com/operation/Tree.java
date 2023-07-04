package com.operation;

import java.util.Stack;

public class Tree {

	private Node root;

	public Tree() {
		this.root = null;
	}

	public Node getRoot() {
		return root;
	}

	public boolean insert(int data) {
		// Create a new node with the given data
		Node newNode = new Node(data);

		// If the tree is empty, make the new node the root
		if (root == null) {
			root = newNode;
			return true;
		}

		Node temp = root;

		while (true) {
			// Check for duplication
			if (temp.getData() == data) {
				return false;
			}

			if (data < temp.getData()) {
				// If the data is less than the current node's data, go to the left child
				if (temp.getLeft() == null) {
					// If the left child is null, insert the new node
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			} else {
				// If the data is greater than the current node's data, go to the right child
				if (temp.getRight() == null) {
					// If the right child is null, insert the new node
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}
		}
	}

	public void postorder() {
		// Perform postorder traversal on the tree

		// Create a nested class Pair to store a node and its flag
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

	public boolean delete(int data) {
		// Delete the node with the given data from the tree

		// If the root is null, the tree is empty
		if (root == null) {
			return false;
		}

		// Set parent (p) and del for the tree
		Node p = root, del = root;

		// Locate the node to be deleted
		while (data != del.getData()) {

			if (data < del.getData()) {
				p = del;
				del = del.getLeft();
			} else {
				p = del;
				del = del.getRight();
			}

			// If the data does not exist in the tree
			if (del == null) {
				return false;
			}

		}

		while (true) {
			// If the data is in a terminal node
			if (del.getLeft() == null && del.getRight() == null) {

				// If the root is the only node in the tree
				if (root == del) {
					root = null;
					return true;
				}

				// If the tree has more than one node
				if (p.getLeft() == del) {
					p.setLeft(null);
				} else {
					p.setRight(null);
				}

				return true;

			}

			// If the data is in a non-terminal node
			if (del.getLeft() != null) {
				// Set parent (p) and max
				// Get the maximum node from the left subtree
				// Swap the data of the nodes before deletion
				// Delete the node

				p = del;
				Node max = del.getLeft();

				while (max.getRight() != null) {
					p = max;
					max = max.getRight();
				}

				// Now, del, p, and max are settled
				// Swap data between del and max

				int temp = del.getData();
				del.setData(max.getData());
				max.setData(temp);

				// Set del to max as we moved the node to a terminal position
				del = max;

			} else {
				// Set p and del
				// Set the minimum node in the right subtree
				// Swap the data of the nodes
				// Delete the node

				p = del;
				Node min = del.getRight();

				// Traverse to find the minimum node
				while (min.getLeft() != null) {
					p = min;
					min = min.getLeft();
				}

				int temp = min.getData();
				min.setData(del.getData());
				del.setData(temp);

				// Set del to min
				del = min;
			}
		}
	}
}
