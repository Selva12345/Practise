package com.retry;

public class QuickSort {
public static void main(String[] args) {
	int a[]= { 12, 11, 13, 5, 6, 7,5, 16 };
	sort(a,0,a.length-1);
	for  (int i : a) {
		System.out.print(i+" ");
		
	}
}

private static void sort(int[] a, int start, int end) {
	
	if(start<end) {
		int pi=part(a,start,end);
		sort(a,start,pi-1);
		sort(a,pi+1,end);
		
	}
}

private static int part(int[] a, int start, int end) {
	int pivot =a[end];
	int j=start-1;
	for(int i=start;i<end;i++) {
		if(a[i]<=pivot) {
			j++;
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			
		}
	}
	int temp=a[j+1];
	a[j+1]=a[end];
	a[end]=temp;
	return 1+j;
}
}
