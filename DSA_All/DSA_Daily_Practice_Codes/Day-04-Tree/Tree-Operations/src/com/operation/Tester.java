package com.operation;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Tree tree = new Tree();
		Scanner sc = new Scanner(System.in);
		char ch;

		do {

			System.out.println("************* TREE OPERATIONS **************");
			System.out.println("1.Get Max\n2.Get Min\n3.Find\n4.Insert");
			System.out.println("Enter Choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Max Data in Node: " + tree.getMax());
				break;
			case 2:
				System.out.println("Min Data in Node :" + tree.getMin());
				break;
			case 3:
				System.out.println("Enter Key to Find: ");
				int key = sc.nextInt();
				System.out.println("is Value present in tree: " + tree.search(key));
				break;
			case 4:
				System.out.println("Enter Data to insert: ");
				int data = sc.nextInt();
				tree.insert(data);
				break;

			default:
				System.out.println("Invalid Input!!!");
				break;
			}

			System.out.println("Do you want to continue???");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}

}
