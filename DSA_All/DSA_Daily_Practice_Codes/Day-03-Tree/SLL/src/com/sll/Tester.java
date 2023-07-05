package com.sll;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList sll = new SinglyLinkedList();
		char ch = 0;
		do {

			System.out.println("*************** LINKEDLIST **************");
			System.out.println("\n1.Insert At Begining" + "\n2.Insert At Position " + "\n3.Insert At End "
					+ "\n4.Display " + "\n5.Delete At Beg " + "\n6.Delete At End " + "\n7.Delete At Position"
					+ "\n8.Delete By Value" + "\n9.Count No of Nodes" + "\n10.Reverse the Linkedlist using swap "
					+ "\n11.Reverse the Linkedlist using inplace reversal");
			System.out.println("\nEnter Choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Data to inset: ");
				int data = sc.nextInt();
				sll.InsertAtBeg(data);
				break;

			case 2:
				System.out.println("Enter Data to inset: ");
				int data1 = sc.nextInt();
				sll.InsertAtEnd(data1);
				break;
			case 3:
				System.out.println("Enter Data to inset: ");
				int data2 = sc.nextInt();
				System.out.println("Enter position: ");
				int pos = sc.nextInt();
				sll.InsertAtPos(data2, pos);
				break;

			case 4:
				sll.display();
				break;

			case 5:
				sll.deleteAtBeg();
				break;

			case 6:
				sll.deleteAtEnd();
				break;

			case 7:
				System.out.println("Enter Position: ");
				int position = sc.nextInt();
				sll.deleteAtPos(position);
				break;

			case 8:
				System.out.println("Enter value to search and delete: ");
				int value = sc.nextInt();
				sll.deleteByValue(value);
				break;

			case 9:
				int count = 0;
				count = sll.count();
				System.out.println("Total No of Nodes: " + count);
				break;

			case 10:
				sll.reverseList();
				break;

			case 11:
				sll.reverseInplace();
				break;

			default:
				System.out.println("Invalid Input...");
				break;
			}
			System.out.println("\n\nDo you want to continue? (Y/N)");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

	}
}
