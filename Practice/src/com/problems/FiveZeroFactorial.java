package com.problems;

public class FiveZeroFactorial {
public static void main(String[] args) {
	int l[]= {0,0,0,0,0};
	fact(0,l);
}

private static void fact(int i, int[] l) {
	
	int n=1;
	
for (int j = i; j >0; j--) {
	n*=j;
}	
System.out.println(n);
}
}
