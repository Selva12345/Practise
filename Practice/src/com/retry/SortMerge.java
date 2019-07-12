package com.retry;

public class SortMerge {
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7,5, 16 };
		sort(arr, 0, arr.length-1);
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
		int p=start; int q=mid+1;
		int a[]=new int[end-start+1];
		int k=0;
		for(int i=start;i<=end;i++) {
			if(p>mid) {
				a[k++]=arr[q++];
				
			}else if(q>end) {
				a[k++]=arr[p++];
				
			}else if(arr[p]<arr[q]) {
				a[k++]=arr[p++];
				
			}else {
				a[k++]=arr[q++];
				
			}
			
		}
		for (int i = 0; i < k; i++) {
			arr[start++]=a[i];
		}
      
	}

}
