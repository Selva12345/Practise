package com.practice.waste;

import java.io.StringReader;

public class WordFragment {
public static void main(String[] args) {
	String s1="every morning I will do yoga";
	String s2="every evening even if i don't do walking I will do cooking ";
	String s3="I will do exercise every weekend";
	remove(s1,s2,s3);
}

private static void remove(String s1, String s2, String s3) {
	StringReader  sr=new StringReader(s1);
	String []arr=new String[] {"every morning I will do yoga"};
String a[]=s1.split(" ");
String b[]=s2.split(" ");
String c[]=s3.split(" ");
String s="";
int n=0;
for (int i = 0; i < a.length-2; i++) {
	String f=a[i]+" "+a[i+1]+" "+a[i+2];
	if(s1.contains(f)&s2.contains(f)&s3.contains(f)) {
		s=f;
	}
}
String f1=s1.replace(s,"");
String f2=s2.replace(s,"");
String f3=s3.replace(s,"");
System.out.println(f1);

System.out.println(f2);
System.out.println(f3);

}
}
