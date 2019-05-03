package com.practice.waste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortDiff {
	
	public static void main(String[] args) {
		SortDiff sortDiff = new SortDiff();
		int a[] = {2,2,3,4,5,12,2,3,3,3,12,-1,-1,-1};
		Arrays.sort(a);
		sortDiff.sortArray(a);
	}

	private void sortArray(int[] a) {
		int j=0;
		int n = 0;
		int c=0;
		for (int i = 0; i < a.length; i++) {
			j=i;
			int l=0;
			for (int  k = j; k < a.length; k++) {
				if(a[i]==a[k]) {
					l++;
					if(l>c) {
						n=a[k];
						c=l;
						
					}
					
				}
				
			}
			
		}
		int a1[]=convert(c,n,a);
		if(a1.length!=0) {
		sortArray(a1);
		}else {
			for (int i : a2) {
				System.out.print(" "+i);
			}
			System.exit(0);
		}
	}
	int []a2=new int[15];
	int l=0;
	int ad=0;
	private int[] convert(int c, int n, int[] a) {
		
		int []a2=new int[15];
		ArrayList<Integer> list = new ArrayList<>();
		c=c+ad;
		while(ad<c) {
			a2[ad]=n;
			ad++;
		}
		for (int i : a) {
		  list.add(i);
		}
		//System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)==n) {
				list.remove(i);
				i--;
			}
		}
		int []a1=new int[list.size()];
		int i=0;
		for (Integer integer : list) {
			 a1[i]=integer;
			System.out.print(" "+integer);
			i++;
			
			
		}
		System.out.println(); 
		
		return a1;
		
		}
	}

