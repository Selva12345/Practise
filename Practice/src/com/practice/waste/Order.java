package com.practice.waste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {

	public void inputString(String value) {
		String[] v=value.split(" ");
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if(v[i].length()<v[j].length()) {
					 String s =null;
					 s=v[i];
						v[i]=v[j];
						v[j]=s;
					}
			}
		}
		for (int j = 0; j < v.length; j++) {
			char[] c=v[j].toCharArray();
			//String d =Character.toString(c[j]);
			char d=Character.toUpperCase(c[0]);
			System.out.print(d);
			int m=0;
			
			for (int i = 1; i < c.length; i++) {
				System.out.print(c[++m]);
			}
			System.out.print(" ");
		}
	}
	
	
	public static void main(String[] args) {
		
		new Order().inputString("hi how is life gng");
	}

	/*Matcher m = Pattern.compile(
	         "([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(v[j]);
 StringBuffer stringbf = new StringBuffer();
while (m.find()) {
    m.appendReplacement(
       stringbf, m.group(1).toUpperCase() + m.group(2).toLowerCase());
 }
System.out.println(m.appendTail(stringbf).toString());*/
}
