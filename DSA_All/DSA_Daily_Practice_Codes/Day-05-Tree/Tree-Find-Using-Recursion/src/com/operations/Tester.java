package com.operations;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(54);
		tree.insert(12);
		tree.insert(1);
		tree.insert(102);
		tree.insert(78);

		System.out.println("Enter Key: ");
		int key = sc.nextInt();
		System.out.println("Entered Key --> isPresent? " + tree.find(key, tree.getRoot()));

	}

}
