package com.Search;

import java.util.Scanner;

public class BinarySearch {

	static int binarySearch(int[] arr, int start, int end, int element) {

		if (end >= start && start <= arr.length - 1) {

			int mid = start + (end - start) / 2;	//explanation 

			if (arr[mid] == element)
				return mid;

			if (arr[mid] > element)
				return binarySearch(arr, start, mid - 1, element);

			return binarySearch(arr, mid + 1, end, element);
		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int start = 0, end = 0, size = 0;
		System.out.println("Enter size of the array: ");
		size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Elements of the Array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter element to search : ");
		int element = sc.nextInt();
		end = arr.length - 1;

		int index = binarySearch(arr, start, end, element);
		if (index != -1) {
			System.out.println("Element Found at Index: " + index);
		} else {
			System.out.println("Element Not Found!");
		}

	}

}

/*
 * The condition used to calculate the midpoint in binary search, i.e., `int mid
 * = l + (r - l) / 2;`, is preferred over the simple one `(l + r) / 2` to avoid
 * potential integer overflow.
 * 
 * Binary search is an efficient algorithm used to find a specific target value
 * within a sorted array. It works by repeatedly dividing the search space in
 * half until the target element is found (or it's determined that the element
 * does not exist in the array).
 * 
 * Now, consider the formula `(l + r) / 2` to calculate the midpoint. Here, `l`
 * represents the left boundary or the starting index of the current search
 * space, and `r` represents the right boundary or the ending index of the
 * current search space.
 * 
 * The issue with this simple formula is that it can lead to integer overflow
 * for large values of `l` and `r`. Let's say `l` is close to the maximum value
 * of the integer data type, and `r` is a large positive number. When you add
 * them together, the result may exceed the maximum value that an integer can
 * hold, causing an overflow.
 * 
 * On the other hand, the formula `l + (r - l) / 2` mitigates this risk. By
 * subtracting `l` from `r` before dividing by 2, you ensure that the result
 * will never exceed the range of the integer data type, even for very large
 * values of `l` and `r`.
 * 
 * In most cases, this integer overflow might not cause a significant problem or
 * may be negligible. However, in critical applications or when dealing with
 * large datasets, such issues can lead to unexpected behavior or bugs in the
 * code. Therefore, it's good practice to use the safer formula `l + (r - l) /
 * 2` to calculate the midpoint in binary search to avoid potential edge cases
 * related to integer overflow.
 * 
 * 
 */
