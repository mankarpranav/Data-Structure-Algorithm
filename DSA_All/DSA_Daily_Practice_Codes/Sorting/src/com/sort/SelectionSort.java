package com.sort;

import java.util.Scanner;

public class SelectionSort {

	static void SelectionSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {

			int min = i;

			for (int k = i + 1; k < arr.length; k++) {

				if (arr[k] < arr[min]) {
					min = k;
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}

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

		SelectionSort(arr);

	}

}
