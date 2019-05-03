package com.practice.waste;

import java.util.Scanner;

public class SolutionNew {

	public void method() {

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String[] nameNew = new String[n];
		int[] difference = new int[n];
		for (int a0 = 0; a0 < n; a0++) {
			String name = in.next();
			int d = in.nextInt();
			int j = in.nextInt();

			nameNew[a0] = name;

			difference[a0] = Math.abs(j - d);

		}
		
		String namefirst=nameNew[0];
		int great = difference[0];
		for (int a1 = 0; a1 < n - 1; a1++) {
			if (difference[a1] > great) {
				great = difference[a1];
				namefirst=nameNew[a1];
			}

		}
		System.out.println(great+" "+namefirst);
		in.close();
	}
}
