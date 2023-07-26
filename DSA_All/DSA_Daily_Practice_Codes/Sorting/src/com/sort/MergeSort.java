package com.sort;

import java.util.Scanner;

public class MergeSort {

	static void mergeSort(int arr[]) {
		
		
		
		
		
		
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

		mergeSort(arr);

	}

}
