package com.sort;

import java.util.Scanner;

public class MergeSort {

	static void merge(int arr[], int start, int mid, int end) {

		// calculating sizes of left and right sub-array
		int leftSize = mid - start + 1;
		int rightSize = end - mid;

		// declaring two sub-arrays
		int L[] = new int[leftSize];
		int R[] = new int[rightSize];

		// copying data to these two arrays
		for (int i = 0; i < leftSize; i++) {
			L[i] = arr[start + i];
		}

		for (int j = 0; j < rightSize; j++) {
			R[j] = arr[mid + 1 + j];
		}

		// declaring indices for two sub-arrays
		int i = 0, j = 0, t = start;

		// inserting elements into the third merger array
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

		// for left remaining elements
		while (i < leftSize) {
			arr[t] = L[i];
			i++;
			t++;
		}

		// for right remaining elements
		while (j < rightSize) {
			arr[t] = R[j];
			j++;
			t++;
		}

	}

	static void mergeSort(int arr[], int start, int end) {

		if (start < end) {
			int mid = start + (end - start) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

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

		mergeSort(arr, 0, arr.length - 1);
		print(arr);
	}

}
