package com.sort;

import java.util.Scanner;

public class BubbleSort {

	static void bubbleSort(int arr[]) {

		boolean swapped = false;
		int itr = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < (arr.length) - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
					++itr;
				}

			}
			if (swapped == false) {
				break;
			}

		}

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

		bubbleSort(arr);

	}

}
