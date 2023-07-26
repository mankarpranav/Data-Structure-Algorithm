package com.sll.reverse;

import java.util.Scanner;

public class List {

	public static void main(String[] args) {

		sll singlyList = new sll();

		Scanner sc = new Scanner(System.in);
		int choice;
		char ch;

		do {
			System.out.println("************** LINKEDLIST REVERSE ****************");
			System.out.println("1.Reverse Linkedlist using Recursion "
					+ "\n2.Reverse Linkedlist using iterative method " 
					+ "\n3.Reverse Linkedlist using stack "
					+ "\n4.Reverse Linkedlist using replica" 
					+ "\n5.Reverse Linkedlist using Tail-Recursive Method"
					+ "\n6.Display "
					+ "\n7.Insert New Node "
					+ "\n8.Exit");

			System.out.println("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				singlyList.reverseRecur(singlyList.getHead());
				break;

			case 2:
				break;

			case 3:
				break;

			case 4:

				break;

			case 5:
				singlyList.display();
				break;

			case 6:
				System.out.println("Enter Data: ");
				int data = sc.nextInt();
				singlyList.insertNode(data);
				break;

			default:
				System.out.println("Invalid Input!!!");
				break;
			}

			System.out.println("Do You Want to Continue???");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
