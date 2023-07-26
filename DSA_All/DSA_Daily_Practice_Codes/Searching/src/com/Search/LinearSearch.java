package com.Search;

import java.util.Scanner;

public class LinearSearch {

	static int search(int arr[], int size, int element) {

		for (int i = 0; i < size; i++) {
			if (element == arr[i]) {
				return (i+1);
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 0;
		
		int element = 0;

		System.out.println("Enter size of the array: ");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Data into array: ");
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter element to search in the array: ");
		element = sc.nextInt();

		int index = search(arr, size, element);
		if (index == -1) {
			System.out.println("Element Not Found!");
		} else {
			System.out.println("Element Found at Index: " + index);
		}

	}

}
