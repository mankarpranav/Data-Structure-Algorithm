package com.sll;

public class SinglyLinkedList {

	// Edge Cases Not Handled..

	private Node head;

	public SinglyLinkedList() {

	}

	public SinglyLinkedList(Node head) {
		this.head = head;
	}

	public void display() {

		Node temp = head;

		if (temp == null) {
			System.out.println("Empty List..");
			return;
		}

		while (temp != null) {
			if (temp.getNext() != null) {
				System.out.print("| " + temp.getData() + " | " + "--> ");
			} else {
				System.out.print("| " + temp.getData() + " | ");
			}

			temp = temp.getNext();
		}

	}

	public void InsertAtBeg(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.setNext(head);
		head = newNode;
		return;

	}

	public void InsertAtEnd(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(newNode);
		return;

	}

	public void InsertAtPos(int data, int pos) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		for (int i = 0; i < pos - 1; i++) {
			temp = temp.getNext();
		}

		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		return;
	}

	public void deleteAtBeg() {

		head = head.getNext();

	}

	public void deleteAtEnd() {
		Node temp = head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);
	}

	public void deleteAtPos(int pos) {
		Node temp = head;

		for (int i = 1; i < pos - 1; i++) {
			System.out.println("count: " + i);
			temp = temp.getNext();
		}

		Node del = temp.getNext();
		temp.setNext(del.getNext());

	}

	public void deleteByValue(int value) {
		Node prev = head;
		Node del = head.getNext();
		while (del.getData() != value) {
			prev = del;
			del = del.getNext();
		}

		prev.setNext(del.getNext());
	}

	public int count() {
		int cnt = 0;
		Node temp = head;
		while (temp != null) {

			temp = temp.getNext();
			cnt++;
		}

		return cnt;
	}

	public void reverseList() {
		// reversing data
		// Code Contains Potential Issues
		Node n1 = head;
		Node n2 = head;
		int x = 0;
		int cnt = count();

		while (x < (cnt / 2)) {

			int num = 1;
			while (num < cnt - x) {
				n2 = n2.getNext();
				num++;
			}

			int var = n1.getData();
			n1.setData(n2.getData());
			n2.setData(var);

			head = n2;
			n1 = n1.getNext();

			x++;
		}

	}

	public void reverseInplace() {
		// n1,n2,n3
		// n1 will point to first node
		// n2 will point to second node
		// n3 will point to third node
		// n2 setNext n1
		// increment n1 n2 n3

		Node n1 = head;
		Node n2 = head;
		Node n3 = head;

		while (n2 != null) {
			n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		}

		head.setNext(null);
		head = n1;
	}

}
