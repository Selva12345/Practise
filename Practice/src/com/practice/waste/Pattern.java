package com.practice.waste;

public class Pattern {
	public static void main(String[] args) {
		int rows = 5, k = 0, count = 0, count1 = 0;
		int l = 1;
		int y = 3;
		int t = 10;

		for (int i = 1; i <= rows; ++i) {
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print("  ");
				++count;
			}
			if (i < 5) {
				while (k != 2 * i - 1) {

					if (count <= rows - 1) {
						System.out.print(l + "   ");

						++count;
						l--;

					}
					++k;
				}
			}
			l = l + y;
			y++;
			y++;

			count1 = count = k = 0;

			System.out.println();
		}
		for (int i = 5; i >= 1; --i) {
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print("  ");
				++count;
			}
			if (i < 5) {
				while (k != 2 * i - 1) {

					if (count <= rows - 1) {
						System.out.print(t + "   ");

						++count;
						t--;

					}
					++k;
				}
			}
			
			count1 = count = k = 0;

			System.out.println();
		}
	}
}
