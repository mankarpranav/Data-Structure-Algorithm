package com.sll;

public class SinglyLinkedList {

	private Node head;

	public SinglyLinkedList() {

	}

	public SinglyLinkedList(Node head) {
		this.head = head;
	}

	public void display() {
		// Displays the elements of the singly linked list.

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

	public void insertAtBeg(int data) {
		// Inserts a new node with the given data at the beginning of the singly linked list.

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode; // If the list is empty, the new node becomes the head of the list.
			return;
		}

		newNode.setNext(head);
		head = newNode;
	}

	public void insertAtEnd(int data) {
		// Inserts a new node with the given data at the end of the singly linked list.

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode; // If the list is empty, the new node becomes the head of the list.
			return;
		}

		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(newNode);
	}

	public void insertAtPos(int data, int pos) {
		// Inserts a new node with the given data at the specified position in the singly linked list.

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode; // If the list is empty, the new node becomes the head of the list.
			return;
		}

		Node temp = head;
		for (int i = 0; i < pos - 1; i++) {
			if (temp == null) {
				System.out.println("Invalid position");
				return;
			}
			temp = temp.getNext();
		}

		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
	}

	public void deleteAtBeg() {
		// Deletes the first node from the singly linked list.

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		head = head.getNext();
	}

	public void deleteAtEnd() {
		// Deletes the last node from the singly linked list.

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = head;
		Node prev = null;

		while (temp.getNext() != null) {
			prev = temp;
			temp = temp.getNext();
		}

		if (prev != null) {
			prev.setNext(null);
		} else {
			head = null;
		}
	}

	public void deleteAtPos(int pos) {
		// Deletes the node at the specified position from the singly linked list.

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = head;
		Node prev = null;

		for (int i = 1; i < pos; i++) {
			if (temp == null) {
				System.out.println("Invalid position");
				return;
			}
			prev = temp;
			temp = temp.getNext();
		}

		if (prev != null) {
			prev.setNext(temp.getNext());
		} else {
			head = temp.getNext();
		}
	}

	public void deleteByValue(int value) {
		// Deletes the node with the given value from the singly linked list.

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = head;
		Node prev = null;

		while (temp != null) {
			if (temp.getData() == value) {
				if (prev != null) {
					prev.setNext(temp.getNext());
				} else {
					head = temp.getNext();
				}
				return;
			}
			prev = temp;
			temp = temp.getNext();
		}

		System.out.println("Value not found in the list");
	}

	public int count() {
		// Returns the number of nodes in the singly linked list.

		int count = 0;
		Node temp = head;

		while (temp != null) {
			count++;
			temp = temp.getNext();
		}

		return count;
	}

	public void reverseList() {
		// Reverses the elements of the singly linked list by reversing the data in the nodes.

		int count = count();
		Node n1 = head;
		Node n2 = head;
		int x = 0;

		while (x < (count / 2)) {
			int num = 1;

			while (num < count - x) {
				n2 = n2.getNext();
				num++;
			}

			int var = n1.getData();
			n1.setData(n2.getData());
			n2.setData(var);

			n1 = n1.getNext();
			n2 = head;

			x++;
		}
	}

	public void reverseInplace() {
		// Reverses the singly linked list in-place by reversing the links between the nodes.

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}

		head = prev;
	}
}
