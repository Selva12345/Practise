package com.practice.waste;

import java.util.Arrays;

class SortWave
{
    
    public static void main(String args[])
    {
        SortWave ob = new SortWave();
        int arr[] = {20, 10, 8, 6, 4, 2};
        int n = arr.length;
        ob.sortInWave(arr, n);
       
    }

	private void sortInWave(int[] arr, int n) {
		
		Arrays.sort(arr);
		
		 for (int j : arr) {
	            System.out.print(j + " ");
	    }
		for (int i = 0; i < arr.length-1; i+=2) {
			swap(arr,i,i+1);

		}
		
		System.out.print(" ");
		 for (int j : arr) {
	            System.out.print(j + " ");
	    }
	}

	private void swap(int[] arr,int n,int b) {
			int s=arr[n];
			arr[n]=arr[b];
			arr[b]=s;	
		}
		
		
	}
