package com.sll;

import java.util.Scanner;

public class List {

	public static void main(String[] args) {

		char choice = 'f';
		int data = 0, pos = 0;
		Scanner sc = new Scanner(System.in);
		Sll singlylist = new Sll();

		do {

			System.out.println("************ LINKEDLIST **************");
			System.out.println(
					"1.Insert At First Position" + "\n2.Insert At Middle Position " + "\n3.Insert At End Position "
							+ "\n4.Display Linkedlist" + "\n5.Delete First " + "\n6.Delete At Position"
							+ "\n7.Delete At Last" + "\n8.Linked Nodes Count" + "\n9.Reverse Linkedlist");
			System.out.println("Enter choice: ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Data to insert in Linkedlist :");
				data = sc.nextInt();
				singlylist.insertAtFirst(data);
				System.out.println("Node Insertion Successful!!!");
				break;

			case 2:
				System.out.println("Enter Data to insert in Linkedlist :");
				data = sc.nextInt();
				System.out.println("Enter Position : ");
				pos = sc.nextInt();
				singlylist.insertAtMid(data, pos);
				System.out.println("Node Insertion Successful!!!");
				break;

			case 3:
				System.out.println("Enter Data to insert in Linkedlist :");
				data = sc.nextInt();
				singlylist.insertAtLast(data);
				System.out.println("Node Insertion Successful!!!");
				break;

			case 4:
				singlylist.display();
				break;

			case 5:
				singlylist.deleteFirst();
				break;

			case 6:
				System.out.println("Enter Posistion to Delete: ");
				pos = sc.nextInt();
				singlylist.deleteAtPos(pos);
				break;

			case 7:
				singlylist.deleteAtLast();
				break;

			case 8:
				int cnt = singlylist.count();
				System.out.println("Count of Total Nodes: " + cnt);
				break;

			case 9:
				singlylist.reverse();
				singlylist.display();
				break;

			default:
				System.out.println("Invalid Input!!!");
				break;
			}

			System.out.println("Do you want to continue? ");
			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');

	}

}
