package com.sll.reverse;

import com.sll.Node;

public class sll {

	private Node head;

	public sll() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node reverseRecur(Node arghead) {
		if (arghead == null)
			return arghead;

		// SINGLE OR LAST NODE
		if (arghead.getNext() == null)
			return arghead;

		Node newHead = reverseRecur(arghead.getNext());

		arghead.getNext().setNext(arghead);
		arghead.setNext(null);

		return newHead;
	}

	public void display() {

		Node temp = head;

		while (temp != null) {
			if (temp.getNext() == null) {
				System.out.print(temp.getData() + " ");
			} else {
				System.out.print(temp.getData() + " --> ");
			}

			temp = temp.getNext();
		}
		System.out.println();
	}

	public void insertNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		newNode.setNext(head);
		head = newNode;
	}

}
