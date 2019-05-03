package com.practice.waste;

import java.util.Arrays;

public class RemoveChar {
	public static void main(String[] args) {
		RemoveChar removeChar=new RemoveChar();
		String s1="expErIence";
		String s2="En";
		removeChar.remove(s1,s2);
	}
static {
	String s1="expErIence";

	char a1[]=s1.toCharArray();

	int numElts = a1.length - ( 3 + 1 ) ;
	   //System.arraycopy( a1, 3 + 1, a1, 3, numElts ) ;
	Arrays.copyOf(a1, 3);
	  //System.out.println(Arrays.copyOf(a1, 6));
}
	private void remove(String s1, String s2) {
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		int j=0;
		while(j<a2.length) {
		for (int i = 0; i < a1.length; i++) {
			if(a1[i]==a2[j]) {
				for (int k = i; k < a1.length-1; k++) {
					a1[k]=a1[k+1];
					
				}
			}
		}
		j++;
		}
		char[] b=Arrays.copyOf(a1, 8);
		System.out.println(b);	
		}
	} 


