package com.practice.waste;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SeperateString {
public static void main(String[] args) {
	SeperateString seperateString=new SeperateString();
	String a= "abcd";
	String b="a**c";
	seperateString.find(a,b);
}

private void find(String a, String b) {
	String c[]=b.split("\\*");
	 
	for (int i = 0; i < c.length; i++) {
		 Pattern ptn = Pattern.compile(c[i]);
		 Matcher m=ptn.matcher(a);
		 if(m.find()){
			 System.out.println("success "+ m.group(0));
	        }
		String s[]=a.split(c[i]);
		/*
		if(c[i].contains(a))
			System.out.println("true");*/
	}
	
	
}
}
