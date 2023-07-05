package com.dll;

public class Tester {
	public static void main(String[] args) {

		DoublyLinkedList dll = new DoublyLinkedList();

		dll.insertAtBeg(10);
		dll.insertAtBeg(20);

		// dll.display();
		dll.insertAtEnd(30);

		dll.insertAtEnd(40);

		dll.insertAtBeg(50);
		dll.display();
	}
}
