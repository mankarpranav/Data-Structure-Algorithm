package com.traversal;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		char ch;
		Tree tree = new Tree();

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("**************** TREE TRAVERSAL ****************");
			System.out.println("1.Postorder using Normal Function\n2.Postorder using Recursive Function\n3.Insert");
			System.out.println("Enter Choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				tree.postorderNormal();
				break;
			case 2:
				tree.postorderRec(tree.getRoot());
				break;
			case 3:
				System.out.println("Enter Data to insert: ");
				int data = sc.nextInt();
				tree.insert(data);
				break;
			default:
				System.out.println("Invalid Input...");
				break;
			}
			System.out.println("Do you want to continue??");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}

}
