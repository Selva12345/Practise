package com.practice.waste;

import java.util.Arrays;

public class Minimum {
	public static void main(String[] args) {
		int arr[]= {1, 5, 3, 19, 18, 25};
		Minimum mini=new Minimum();
		mini.difference(arr);		
	}

	 void difference(int[] arr) {
		 int d=0;
		 int mini=Integer.MAX_VALUE;
		 Arrays.sort(arr);
			
				 d=Math.abs(arr[0]-arr[1]);
				
					
		System.out.println(d);
		}
		
	}

