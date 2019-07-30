package com.datastructure;

public class MergeSort {
	private  void sort(int[] a, int start, int end) {
		if(start<end) {
			int mid=(start+end)/2;
			sort(a,start,mid);
			sort(a,mid+1,end);
			merge(a,start,mid,end);
			
		}
		
	}
private void merge(int[] a, int start, int mid, int end) {
	int p=start;
	int q=mid+1;
	int n=0;
	int s[]=new int[end-start+1];
	for(int i=start;i<=end;i++) {
	if(p>mid) {
		s[n++]=a[q++];
	}
	else if(q>end) {
		s[n++]=a[p++];
	}
	else if(a[p]<a[q]) {
		s[n++]=a[p++];
	}else {
		s[n++]=a[q++];
	}
	
	}
	for (int i = 0; i <n; i++) {
		a[start++]=s[i];
	}
		
	}
public static void main(String[] args) {
	MergeSort mg=new MergeSort();
	int a[]= {11,9,5,1,3,7,12,10,74};
	int l=a.length-1;
	mg.sort(a,0,l);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}


}
