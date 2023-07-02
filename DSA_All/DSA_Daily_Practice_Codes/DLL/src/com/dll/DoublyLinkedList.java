package com.dll;

public class DoublyLinkedList {

	private Node head;

	public DoublyLinkedList() {
		this.head = null;
	}

	// Edge Cases Not handled...[May handle in upcoming future]

	public void display() {
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

		Node newNode = new Node(data);
		newNode.setNext(head);
		newNode.setPrev(null);
		head = newNode;

	}

	public void insertAtEnd(int data) {

		Node newNode = new Node(data);
		newNode.setNext(null);

		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(newNode);
		newNode.setPrev(temp);

	}

}
