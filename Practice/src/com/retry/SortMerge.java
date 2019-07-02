package com.retry;

public class SortMerge {
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7, 16 };
		sort(arr, 0, arr.length);
		for (int i : arr) {
			System.out.println(i);

		}
	}

	private static void sort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			sort(arr, start, mid);
			sort(arr, mid + 1, end);
			merge(arr, start, mid, end);

		}

	}

	private static void merge(int[] arr, int start, int mid, int end) {
		
        if(arr[start]>arr[mid]) {
	   int i=arr[start];
	   arr[start]=arr[mid];
	   arr[mid]=i;
         }
        if(mid<end) {
        if(arr[mid]>arr[end-1]) {
     	   int i=arr[mid];
     	   arr[mid]=arr[end];
     	   arr[mid]=i;
              }
        }
	}

}
