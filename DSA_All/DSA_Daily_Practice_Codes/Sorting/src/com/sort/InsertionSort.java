package com.sort;

import java.util.Scanner;

public class InsertionSort {

	// Method to perform Insertion Sort on the input array
	static void insertionSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			int key = arr[i]; // Store the current element as the 'key'
			int j = i - 1; // Index of the previous element in the array

			// Move elements that are greater than the 'key' to one position ahead of their current position
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j]; // Shift the element to the right
				j = j - 1; // Move to the previous element in the array
			}

			// Insert the 'key' at its correct position in the sorted part of the array
			arr[j + 1] = key;
		}

		// Print the sorted array
		System.out.println("Sorting using Insertion Sort");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = 0;
		System.out.println("Enter size: ");
		size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter elements of Array:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Perform Insertion Sort on the input array
		insertionSort(arr);
	}
}
