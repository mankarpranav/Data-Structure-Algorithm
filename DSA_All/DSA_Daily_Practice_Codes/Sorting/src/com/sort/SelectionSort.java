package com.sort;

import java.util.Scanner;

public class SelectionSort {

	// Method to perform Selection Sort on the input array
	static void selectionSort(int arr[]) {

		// Outer loop to traverse through the array
		for (int i = 0; i < arr.length - 1; i++) {

			int min = i; // Assume the minimum element is at the current 'i' index

			// Inner loop to find the index of the minimum element in the unsorted part of the array
			for (int k = i + 1; k < arr.length; k++) {

				// If an element smaller than the current minimum is found, update the 'min' index
				if (arr[k] < arr[min]) {
					min = k;
				}
			}

			// Swap the minimum element with the current 'i' index element
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}

		// Print the sorted array
		System.out.println("Sorted Array using Selection Sort ->");
		for (int h = 0; h < arr.length; h++) {
			System.out.print(arr[h] + " ");
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

		// Perform Selection Sort on the input array
		selectionSort(arr);
	}
}
