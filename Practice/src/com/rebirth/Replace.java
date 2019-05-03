package com.rebirth;

public class Replace {
	public static void main(String[] args) {
		String s = "1234567890abcdea";
		char a[] = s.toCharArray();
		play(a);
	}

	static int l = 0;

	private static void play(char[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (Character.toLowerCase(a[i]) == Character.toLowerCase(a[j])) {
					if (a[j] == 9) {

						a[j] = 0;
					} else if (a[j] == 'z') {
						a[j] = 'a';
					} else if (a[j] == 'Z') {
						a[j] = 'A';
					} else {
						a[j]++;
					}
				}

			}

		}
		l++;
		if (l < 2) {
			play(a);
		}
		System.out.println(a);
	}
}
