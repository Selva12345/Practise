package com.practice.waste;

public class PatternTry {
	public static void main(String[] args) {
		int count = 4;
		int n = 1;
		int temp = 0;
		int m = 0;
		while (n < 5) {
			m = m + n;
			temp = m;
			//print spaces for each row
			for (int i = 0; i < count; i++) {
				System.out.print(" ");

			}
			//print number by decrementing the value
			//main logic for zig-zag pattern printing
			for (int i = 0; i < n; i++) {
				System.out.print(temp + " ");
				temp--;

			}

			n++;
			count--;
			System.out.println();
		}
		count = 1;
		n = 4;
		temp = 10;

		while (n > 0) {
			//print spaces for each row
			for (int i = 0; i < count; i++) {
				System.out.print(" ");

			}
			//print number by decrementing the value
			//main logic for zig-zag pattern printing
			for (int i = 0; i < n; i++) {
				System.out.print(temp + " ");
				temp--;

			}

			n--;
			count++;
			System.out.println();
		}
	}
	static {
		
		System.out.println("checking zig-zag pattern");
		byte s=(byte)10;
		s=(byte) (s+(byte)20);
		System.out.println(s);
	}
	static {
		
		System.out.println("Printing zig-zag pattern");
	}


}
