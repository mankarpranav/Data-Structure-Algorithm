// Package declaration
package com.traversal;

// Importing required classes
import java.util.Stack;

// Tree class
public class Tree {

    private Node root;

    // Constructor
    public Tree() {
        this.root = null;
    }

    // Method to insert a node in the tree
    public boolean insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
        }

        Node temp = root;

        while (true) {
            // Checking if the data already exists in the tree
            if (data == temp.getData()) {
                return false;
            }

            if (data < temp.getData()) {
                // If data is less than the current node's data, move to the left subtree
                if (temp.getLeft() == null) {
                    temp.setLeft(newNode);
                    return true;
                }
                temp = temp.getLeft();
            } else {
                // If data is greater than the current node's data, move to the right subtree
                if (temp.getRight() == null) {
                    temp.setRight(newNode);
                    return true;
                }
                temp = temp.getRight();
            }
        }
    }

    // Method to perform postorder traversal and print the nodes
    public void postorder() {
        // Using two stacks for postorder traversal
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        // Iteratively traversing the tree
        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);

            // Pushing left and right children of the current node to stack1
            if (current.getLeft() != null)
                stack1.push(current.getLeft());
            if (current.getRight() != null)
                stack1.push(current.getRight());
        }

        // Printing the nodes in postorder
        while (!stack2.isEmpty()) {
            Node node = stack2.pop();
            System.out.print(node.getData() + " ");
        }
    }
}
