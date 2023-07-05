package com.dll;

public class DoublyLinkedList {

	private Node head;

	public DoublyLinkedList() {
		this.head = null;
	}

	public void display() {
		// Displays the elements of the doubly linked list.

		Node temp = head;

		while (temp != null) {
			if (temp.getNext() != null) {
				System.out.print("|" + temp.getData() + "|-->");
			} else {
				System.out.print("|" + temp.getData() + "|");
			}

			if (temp != null)
				temp = temp.getNext();
		}
	}

	public void insertAtBeg(int data) {
		// Inserts a new node with the given data at the beginning of the doubly linked list.

		Node newNode = new Node(data);
		newNode.setNext(head);
		newNode.setPrev(null);

		if (head != null) {
			head.setPrev(newNode);
		}

		head = newNode;
	}

	public void insertAtEnd(int data) {
		// Inserts a new node with the given data at the end of the doubly linked list.

		Node newNode = new Node(data);
		newNode.setNext(null);

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(newNode);
		newNode.setPrev(temp);
	}
}
