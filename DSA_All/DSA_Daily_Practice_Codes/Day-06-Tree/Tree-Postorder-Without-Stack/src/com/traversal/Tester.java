package com.traversal;

public class Tester {

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(-1);
		tree.insert(20);
		tree.insert(90);
		tree.insert(100);
		tree.insert(2);
		tree.insert(22);

		tree.postorder();

	}

}
