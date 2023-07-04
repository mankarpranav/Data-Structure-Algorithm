package com.operations;

public class Tester {

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(54);
		tree.insert(12);
		tree.insert(1);
		tree.insert(102);
		tree.insert(78);

		System.out.println("Total No of Nodes: ");
		System.out.println(tree.count(tree.getRoot()));

	}

}
