package com.practice.waste;

import java.util.Arrays;

public class Occurences {
	public static void main(String[] args) {
		Occurences occurences=new Occurences();
		int a[]= {2,1,3,2,2,5,8,9,8};
		occurences.occur(a);
	}

	private void occur(int[] a) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			int n=1;
			int element=a[i];
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					element=a[i];
					n++;
					i=j;
				}
				
			}
			System.out.println(n +"-"+element);
		}
		
	}

}
