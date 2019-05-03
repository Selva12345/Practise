package com.practice.waste;

public class NumberPalindrome {
	
public static void main(String[] args) {
	NumberPalindrome numberPalindrome=new NumberPalindrome();
	int s=122;
	numberPalindrome.palin(s);
}

private void palin(Integer s) {
	for (Integer i = s; i <Integer.MAX_VALUE; i++) {
		String f=Integer.toString(i);

	StringBuffer s1=new StringBuffer(f);
	s1.reverse();
	String s2=s1.toString();
		if(f.equals(s2)) {
			System.out.println("palindrome: "+f);
			System.exit(0);
		}
		
	}
}
}
