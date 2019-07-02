package com.retry;

public class MergeSort {

	// Second subarray is arr[m+1..r]
	

	void merge_sort(int A[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2; // defines the current array in 2 parts .
			merge_sort(A, start, mid); // sort the 1st part of array .
			merge_sort(A, mid + 1, end); // sort the 2nd part of array.

			// merge the both parts by comparing elements of both the parts.
			merge(A, start, mid, end);
		}
	}
//int arr[] = { 12, 11, 13, 5, 6, 7, 16 };
	void merge(int A[ ] , int start, int mid, int end) {
		 //stores the starting position of both parts in temporary variables.
		int p = start ,q = mid+1;

		int Arr[]=new int [end-start+1];
		int k=0;

		for(int i = start ;i <= end ;i++) {
		    if(p > mid)      //checks if first part comes to an end or not .
		       Arr[ k++ ] = A[ q++] ;

		   else if ( q > end)   //checks if second part comes to an end or not
		       Arr[ k++ ] = A[ p++ ];

		   else if( A[ p ] < A[ q ])     //checks which part has smaller element.
		      Arr[ k++ ] = A[ p++ ];

		   else
		      Arr[ k++ ] = A[ q++];
		 }
		  for (int p1=0 ; p1< k ;p1 ++) {
		   /* Now the real array has elements in sorted manner including both 
		        parts.*/
		     A[ start++ ] = Arr[ p1] ;                          
		  }
		}
public static void main(String[] args) {
	MergeSort mg=new MergeSort();
	int arr[] = { 12, 11, 13, 5, 6, 7, 16 };
	mg.merge_sort(arr,0,arr.length-1);
	for (int i : arr) {
		System.out.print(i+" ");
	}
	System.out.println();
}
}
