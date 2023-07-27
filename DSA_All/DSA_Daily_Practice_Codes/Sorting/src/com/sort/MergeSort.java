package com.sort;

import java.util.Scanner;

public class MergeSort {

	// Method to merge two sub-arrays into a single sorted array
	static void merge(int arr[], int start, int mid, int end) {

		// Calculating sizes of left and right sub-arrays
		int leftSize = mid - start + 1;
		int rightSize = end - mid;

		// Declaring two sub-arrays
		int L[] = new int[leftSize];
		int R[] = new int[rightSize];

		// Copying data to these two arrays
		for (int i = 0; i < leftSize; i++) {
			L[i] = arr[start + i];
		}

		for (int j = 0; j < rightSize; j++) {
			R[j] = arr[mid + 1 + j];
		}

		// Declaring indices for two sub-arrays and the merged array
		int i = 0, j = 0, t = start;

		// Merging elements into the third merged array in sorted order
		while (i < leftSize && j < rightSize) {
			if (L[i] < R[j]) {
				arr[t] = L[i];
				i++;
			} else {
				arr[t] = R[j];
				j++;
			}
			t++;
		}

		// For left remaining elements
		while (i < leftSize) {
			arr[t] = L[i];
			i++;
			t++;
		}

		// For right remaining elements
		while (j < rightSize) {
			arr[t] = R[j];
			j++;
			t++;
		}
	}

	// Method to perform Merge Sort on the input array
	static void mergeSort(int arr[], int start, int end) {

		if (start < end) {
			int mid = start + (end - start) / 2;

			// Recursively sort the left and right halves of the array
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);

			// Merge the two sorted halves
			merge(arr, start, mid, end);
		}
	}

	// Method to print the sorted array
	static void print(int arr[]) {
		System.out.println("Sorting array using Merge Sort ->");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
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

		// Perform Merge Sort on the input array
		mergeSort(arr, 0, arr.length - 1);
		// Print the sorted array
		print(arr);
	}

}
