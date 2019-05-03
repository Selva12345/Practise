package com.practice.waste;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static int numberNeeded(String first, String second) {
		int len = first.length();
		int num = 0;
		int total = 0;
		char[] val = new char[100];
		int len2 = second.length();
		for (int i = 0; i < len; i++) {
			char val1 = first.charAt(i);
			for (int j = 0; j < len2; j++) {
				char val2 = second.charAt(j);

				if (val1 == val2) {
					int l = 0;

					for (int m = 0; m <=l; m++) {
						val[j] = val2;

						if (val[l] != val2) {
							l++;
							num++;
							total = (len - num) + (len2 - num);
						}
					}
				}

			}
		}
		return Math.abs(total);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}
