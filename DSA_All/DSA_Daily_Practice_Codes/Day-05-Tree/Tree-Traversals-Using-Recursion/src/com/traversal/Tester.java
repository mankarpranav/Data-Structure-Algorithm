package com.traversal;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Tree tree = new Tree();
		char ch;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("********** TREE TRAVERSAL *********");
			System.out.println("1.Insert\n2.Inorder\n3.Preorder\n4.Postorder");
			System.out.println("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Data: ");
				int data = sc.nextInt();
				tree.insert(data);
				break;
			case 2:
				tree.inorder(tree.getRoot());
				break;
			case 3:
				tree.preorder(tree.getRoot());
				break;
			case 4:
				tree.postorder(tree.getRoot());
				break;
			default:
				System.out.println("Invalid Input!!!");
				break;
			}
			System.out.println("Do you want to continue? ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
