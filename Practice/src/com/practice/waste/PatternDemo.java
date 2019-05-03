package com.practice.waste;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternDemo {
static{
	boolean p=Pattern.matches("d", "abcd");
	Pattern pt=Pattern.compile("ad",Pattern.CASE_INSENSITIVE);
	Matcher mt=pt.matcher("adsd");
	System.out.println(" "+mt);
	while(mt.find()) {
		System.out.println(" "+mt.group()+" "+	mt.hasAnchoringBounds());
		
	}
}
public static void main(String[] args) {
	
}
}
