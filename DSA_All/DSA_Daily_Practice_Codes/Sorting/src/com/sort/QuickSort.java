package com.sort;

import java.util.Scanner;

public class QuickSort {

	// Method to swap two elements in the array
	public static void swap(int arr[], int index, int i) {
		int temp = arr[i];
		arr[i] = arr[index];
		arr[index] = temp;
	}

	// Method to partition the array and place the pivot element in its correct position
	public static int partition(int arr[], int start, int end) {

		// Select the pivot element (last element in the current range)
		int pivot = arr[end];

		// Initialize the index of the smaller element (elements less than pivot)
		int index = start - 1;

		// Iterate over the elements in the current range (start to (end - 1))
		for (int i = start; i <= end - 1; i++) {

			// If the current element is smaller than the pivot, swap it with the element at 'index + 1'
			if (arr[i] < pivot) {
				index++;
				swap(arr, index, i);
			}
		}

		// Place the pivot element in its correct position
		swap(arr, index + 1, end);

		// Return the index of the pivot element after partitioning
		return (index + 1);
	}

	// Recursive method to perform Quick Sort
	public static void quickSort(int arr[], int start, int end) {

		// Base case: If the start index is less than the end index, perform sorting
		if (start < end) {

			// Partition the array and get the pivot index
			int pivot = partition(arr, start, end);

			// Recursively sort the left subarray (elements before the pivot)
			quickSort(arr, start, pivot - 1);

			// Recursively sort the right subarray (elements after the pivot)
			quickSort(arr, pivot + 1, end);
		}
	}

	// Method to print the sorted array
	public static void printSorted(int arr[]) {
		System.out.println("Sorted Array using Quick Sort: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Elements of the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Perform Quick Sort on the input array
		quickSort(arr, 0, arr.length - 1);

		// Print the sorted array
		printSorted(arr);
	}

}
