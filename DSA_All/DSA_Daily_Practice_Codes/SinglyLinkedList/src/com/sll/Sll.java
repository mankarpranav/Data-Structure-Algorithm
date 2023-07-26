package com.sll;

public class Sll {

	private Node head;

	public Sll() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	// INSERT AT FIRST POSITION -->
	public void insertAtFirst(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	// INSERT AT MIDDLE -->
	public void insertAtMid(int data, int pos) {

		Node newNode = new Node(data);
		Node temp = head;

		if (head == null) {
			head = newNode;
			return;
		}

		for (int i = 0; i < pos - 1; i++) {
			if (temp.getNext() != null)
				temp = temp.getNext();
		}

		newNode.setNext(temp.getNext());
		temp.setNext(newNode);

	}

	// INSERT AT LAST POSITION -->
	public void insertAtLast(int data) {

		Node newNode = new Node(data);
		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(newNode);
	}

	// DISPLAY -->
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

	// DELETE AT FIRST -->
	public void deleteFirst() {
		if (head == null) {
			return;
		}

		Node temp = head.getNext();
		head = temp;
		System.out.println("Deletion Successful!!!");
	}

	// DELETE AT MID -->
	public void deleteAtPos(int pos) {

		// IF LINKEDLIST IS EMPTY
		if (head == null) {
			System.out.println("Linkedlist is Empty!!!");
			return;
		}

		if (pos == 1) {
			deleteFirst();
			return;
		}

		if (pos <= 0 || pos > count()) {
			System.out.println("Invalid Position!!!");
			return;
		}

		if (pos == (count() - 1)) {
			deleteAtLast();
			return;
		}

		Node temp = head;

		for (int i = 0; i < pos - 2 && temp != null; i++) {
			temp = temp.getNext();
		}

		if (temp != null && temp.getNext() != null) {
			temp.setNext(temp.getNext().getNext());
		}
		System.out.println("Deletion Successful!!!");
	}

	// DELETE AT LAST -->
	public void deleteAtLast() {
		Node temp = head;

		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(null);
		System.out.println("Deletion Successful!!!");
	}

	// COUNT -->
	public int count() {
		int cnt = 0;

		Node temp = head;
		while (temp != null) {
			temp = temp.getNext();
			cnt++;
		}
		return cnt;
	}

	// REVERSE -->
	public void reverse() {

		if (head == null) {
			return;
		}

		if (count() == 1) {
			return;
		}

		Node prev = null;
		Node next = null;
		Node current = head;

		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}

		head = prev;

	}


}
