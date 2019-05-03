package com.practice.waste;

public class PatternNew {

	public static void main(String[] args) {
		int count = 0;
		int temp = 0;
		int n = 4;
		for (int i = 1; i <= 4; i++) {
			count = count + i;
			temp = count;
			for (int k = n - 1; k > 0; k--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print(temp + " ");
				temp--;
			}
			System.out.println();
			n--;
		}

	}

}
