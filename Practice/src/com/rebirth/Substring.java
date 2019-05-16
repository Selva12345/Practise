package com.rebirth;

public class Substring {
	public static void main(String[] args) {
		method("Adcfegds");
			
		
	}

	private static void method(String string) {
		String a[]=string.split("");
		int l=string.length();
		int li=a.length;
		String s=string.substring(0,string.length()-1);
		String s1=string.substring(l-1,l);
		String s3=s1+s;
		String s4=s1.concat(s);
		int sp="d".compareTo("f");
		int d=s.codePointAt(2);
		System.out.println(s+" "+l+" "+li+" "+d);
		
	}

}
