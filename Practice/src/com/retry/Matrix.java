package com.retry;

import java.util.stream.IntStream;

public class Matrix {
public static void main(String[] args) {
	int a[][] = { {1,  2,  3,  4,  5,  6},
                 {7,  8,  9,  10, 11, 12},
                 {13, 14, 15, 16, 17, 18}
          };
	rotate(a,6,3);
}

private static void rotate(int[][] a, int i, int p) {
	int [][] n=new int[i][p]; 
	int u=0, y=0;
	int l=a.length;
	for (int j = 0; j < p; j++) {
		for (int k = 0; k < i; k++) {
			n[u][y]=a[j][k];
			u++;
			
		}
		y++;
		u=0;
	}
	for (int[] js : n) {
		System.out.print(" ");
		for (int j : js) {
			System.out.print(j+" ");
		}
		System.out.println();
		
	}
	
}
}
