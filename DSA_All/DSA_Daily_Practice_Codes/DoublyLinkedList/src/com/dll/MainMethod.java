package com.dll;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0, data = 0;
		int pos = 0;
		char ch;

		DoublyList dll = new DoublyList();

		do {

			System.out.println("*********** DOUBLY LINKEDLIST *************");
			System.out.println("1.Insertion At First Position " + "\n2.Insertion At Mid After Specified Position"
					+ "\n3.Insertion At Mid Before Specified Position" + "\n4.Insertion At Last Position"
					+ "\n5.Display Linked List" + "\n6.Exit");

			System.out.println("Enter Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Data: ");
				data = sc.nextInt();
				dll.insertAtFirst(data);
				break;

			case 2:
				System.out.println("Enter Data: ");
				data = sc.nextInt();
				System.out.println("Enter Position(After): ");
				pos = sc.nextInt();
				dll.insertAfterPos(data, pos);
				break;

			case 3:
				System.out.println("Enter Data: ");
				data = sc.nextInt();
				System.out.println("Enter Position(Before): ");
				pos = sc.nextInt();
//				dll.insertAtMidBefore(data, pos);
				break;

			case 4:
				System.out.println("Enter Data: ");
				data = sc.nextInt();
				dll.insertAtLast(data);
				break;

			case 5:
				dll.display();
				break;

			default:
				System.out.println("Invalid Input!!!");
				break;
			}

			System.out.println("Do You Want to Continue???");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		System.out.println("Enter choice: ");

	}

}
