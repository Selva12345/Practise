package com.practice.waste;

public class MinimumDifference {
	int difference(int arr[]) {
		int diff = 0;
		int mini = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				diff = Math.abs(arr[i] - arr[j]);
				if (diff < mini && diff != 0) {
					mini = diff;
				}

			}
		}
		return mini;
	}

	public static void main(String[] args) {
		MinimumDifference minimumDifference = new MinimumDifference();
		int arr[] = new int[] { 1, 5, 3, 19, 18, 25 };
		System.out.println(minimumDifference.difference(arr));
	}

};