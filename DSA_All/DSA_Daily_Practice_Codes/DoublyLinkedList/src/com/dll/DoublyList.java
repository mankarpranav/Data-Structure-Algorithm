package com.dll;

public class DoublyList {

	private Node head;

	public DoublyList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void insertAtFirst(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.setNext(head);
		head.setPrev(null);

		head.setPrev(newNode);
		head = newNode;
		return;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			if (temp.getNext() != null)
				System.out.print(temp.getData() + "-->");
			else
				System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void insertAtLast(int data) {

		Node temp = head;
		Node newNode = new Node(data);
		newNode.setNext(null);

		if (head == null) {
			head = newNode;
			return;
		}

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(newNode);
		newNode.setPrev(temp);

		return;
	}

	public int count() {
		Node temp = head;
		int cnt = 0;
		while (temp != null) {
			cnt++;
			temp = temp.getNext();
		}
		return cnt;
	}

	public void insertAfterPos(int data, int pos) {

		Node newNode = new Node(data);
		Node temp = head;

		if (head == null) {
			head = newNode;
			return;
		}

		if (!(pos < count()) || pos < 0) {
			System.out.println("Invalid Position!!!");
			return;
		}

		for (int i = 0; i < pos; i++) {
			temp = temp.getNext();
		}

		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		newNode.setPrev(temp);

		if (newNode.getNext() != null) {
			newNode.getNext().setPrev(newNode);
		}

	}

}
