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

	public Node getRoot() {
		return root;
	}

	public void postorderNormal() {
		
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		
		//INCOMPLETE
		//while() {
			while(temp!=null) {
				stack.push(temp);
				temp=temp.getLeft();
			}
			
			if(stack.pop().getRight()!=null)
				temp = stack.pop().getRight();
			
			System.out.println(temp.getData()+" ");
			
		//}
			
		
		
		
	}

	public void postorderRec(Node node) {
		if (node == null)
			return;

		postorderRec(node.getLeft());
		postorderRec(node.getRight());
		System.out.println(node.getData() + " ");
	}

}
