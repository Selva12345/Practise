package com.practice.waste;

import java.util.Arrays;

public class StringCombine {
public static void main(String[] args) {
	String a[]={ "i","like","sam","sung","samsung", "mobile","ice", 
			  "cream", "icecream", "man", "go", "mango"};
	StringCombine.check(a);
}

private static void check(String[] a) {
	String s="";
for (int i = 0; i < a.length; i++) {
	s=s+a[i]+a[i+1];
	i++;
}
}	
}
