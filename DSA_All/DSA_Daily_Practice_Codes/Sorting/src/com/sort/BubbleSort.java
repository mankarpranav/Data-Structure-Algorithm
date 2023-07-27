package com.sort;

import java.util.Scanner;

public class BubbleSort {

	// Method to perform Bubble Sort on the input array
	static void bubbleSort(int arr[]) {

		boolean swapped = false; // Variable to track if any elements were swapped during a pass
		int itr = 0; // Variable to count the total number of iterations

		// Outer loop for the number of passes
		for (int i = 0; i < arr.length; i++) {

			// Inner loop to compare and swap adjacent elements
			for (int j = 0; j < (arr.length) - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					// Swap the elements as they are in the wrong order
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					swapped = true; // Mark that elements were swapped in this pass
					++itr; // Increment the iteration count
				}

			}

			// If no elements were swapped in a pass, the array is already sorted, and we can break the loop
			if (swapped == false) {
				break;
			}

		}

		// Print the sorted array
		System.out.println("Sorted array using Bubble Sort ->");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Total iterations: " + itr);
		return;
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

		// Perform Bubble Sort on the input array
		bubbleSort(arr);
	}

}
