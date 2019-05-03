package com.rebirth;

import java.util.Arrays;

public class NumberChange {
public static void main(String[] args) {
	int n=9;
	int i=0;
	change(n,i);
}

private static void change(int n,int l) {
	int a[]=new int[n];
	int i=l;
	while(i<n) {
		a[i]=n;
		//System.out.print(a[i]);
		
		i++;
	}
	//System.out.println();
	for (int j = 0; j < n; j++) {
		n--;
		for (int j2 =j+1; j2 < n; j2++) {
			a[j2]=n;
		}
	
	}
	System.out.println(Arrays.toString(a));
	
	
}
}
