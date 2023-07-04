package com.operation;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(8);
		tree.insert(70);
		tree.insert(55);
		tree.insert(22);
		tree.insert(-1);

		tree.postorder();

		System.out.println("Enter key to delete: ");
		int key = sc.nextInt();
		tree.delete(key);
		System.out.println("After deletion : ");
		tree.postorder();
	}

}
