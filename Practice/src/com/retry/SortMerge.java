package com.retry;

public class SortMerge {
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7, 16 };
		sort(arr,arr.length);
	}

	private static void sort(int[] arr, int length) {
		length=length/2;
		if (length < 0) {

		}
     sort(arr,length);
	}

}
