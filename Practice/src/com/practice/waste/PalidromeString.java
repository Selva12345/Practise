package com.practice.waste;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PalidromeString {
	
	 void palin(String str) {
		 Set<String> set=new TreeSet<String>();
		 int l=str.length();
		 for (int i = 0; i <= str.length(); i++) {
			 for (int j = i+1; j <= str.length(); j++) {
				StringBuffer s=new StringBuffer(str.substring(i,j));
				String f=s.toString();
				String d=s.reverse().toString();
				if(f.equals(d)) {
					
					set.add(f);
				}
			}
		}
		 System.out.println(set.toString());
			
		}
	
	public static void main(String[] args) {
		PalidromeString palidromeString=new PalidromeString();
		String str="selvcgudeedfee";
		palidromeString.palin(str);
	}

}
