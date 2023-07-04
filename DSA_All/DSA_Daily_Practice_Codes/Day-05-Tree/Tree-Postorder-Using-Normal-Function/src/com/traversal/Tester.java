package com.traversal;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Tree tree = new Tree();

		tree.postorder();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(60);
		tree.insert(1);
		tree.insert(2);
		tree.insert(5);
		tree.insert(11);
		tree.postorder();

	}

}
