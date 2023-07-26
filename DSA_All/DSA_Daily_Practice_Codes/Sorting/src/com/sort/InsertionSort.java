package com.sort;

import java.util.Scanner;

public class InsertionSort {

	static void insertionSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

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

		insertionSort(arr);

	}
}
