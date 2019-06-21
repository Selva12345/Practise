package com.problems;

public class DecimalToBinary {
	public static void main(String[] args) {
		int d = 17;
		String i = "";
		decimal(d, i);
	}

	private static void decimal(int d, String i) {

		if (d > 0) {
			i = d % 2 + i;
			d = d / 2;
		} else {
			System.out.println(i);
			System.exit(0);
		}
		decimal(d, i);

	}
}
