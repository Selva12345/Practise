package com.practice.waste;

public class StarPattern {

	public static void main(String[] args) {
		StarPattern starPattern = new StarPattern();
		starPattern.pattern();
	}

	private void pattern() {
		int count = 3;
		int n=0;
		int in=2;
		int c=1;
		while(n<3) {
			
		for (int i = 0; i < count; i++) {
			System.out.print(" ");
		}
		for (int i = 0; i <c; i++) {
			System.out.print("*");
		}
		c=c+in;
		count--;
		n++;
		System.out.println();
		}
		n=0;
		count=2;
		c=2;
		in=2;
		while(n<2) {			
			for (int i = 0; i < count; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i <=c; i++) {
				System.out.print("*");
			}
			c=c-in;
			count++;
			n++;
			System.out.println();
			}
	}
}
