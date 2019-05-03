package com.practice.waste;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.util.Random;
//FIMF
public class PatternDiff {
	public static void main(String[] args) {
		String s = "a((x){2}(yz){3}){3}d{2}";// a(bc{2}){3}d ((x){2}(yz){3})d{2}
		//String f[] = s.split("");
		expand(s);

	}

	private static void expand(String f) {

		// System.out.println(
		// "a(b(c){2}){3}d".replaceAll("c", "c{2}") );

		String newg = "";
		int count = 0;
		String input = f;

		String extracted="";
		// System.out.println(f.toString());
if(input.contains("(")) {
		extracted = input.substring(input.indexOf('(') + 1, input.lastIndexOf(')'));
}
		String[] a = extracted.split("");
		for (int i = 0; i < a.length; i++) {

			if (a[i].equals(")")) {
				count++;

			}
		}
		for (int i = 0; i < count; i++) {

			if (extracted.contains("){")) {
				String r = extracted.substring(extracted.indexOf('(') + 1, extracted.indexOf(')'));
				String l = extracted.substring(extracted.indexOf('{') + 1, extracted.indexOf('}'));
				int t = Integer.parseInt(l);
				String hr = "";
				for (int j = 0; j < t; j++) {
					hr = r + hr;
				}

				extracted = extracted.replace(extracted.substring(extracted.indexOf('('), extracted.indexOf('}') + 1),
						hr);
			} else {
				
			}
		}
		if(count!=0) {
			extracted=input.replace(input.substring(input.indexOf('(')+1,input.lastIndexOf(')')), extracted);
		}
		if (count == 0) {
			String r="";
			String l="";
			int l1 = 0;
			String y="";
			if(input.contains("(")) {
			 r = input.substring(input.indexOf('(') + 1, input.indexOf(')'));
			}
			if(input.contains("{")) {
			 l = input.substring(input.indexOf('{') + 1, input.indexOf('}'));
				 l1 = input.indexOf("{") - 1;
				 y = input.substring(l1, l1 + 1);
				 
}

			if (y.matches("[a-z]")) {
				r = y;

			}
			int t = Integer.parseInt(l);
			String hr = "";
			for (int j = 0; j < t; j++) {
				hr = r + hr;
			}
			if (r != y) {
				extracted = input.replace(input.substring(input.indexOf('('), input.indexOf('}') + 1), hr);
			} else {
				extracted = input.replace(input.substring(l1, input.indexOf('}') + 1), hr);
			}
			/*
			 * else { extracted=input.replace(input.substring(l1,input.indexOf('}')+1),hr);
			 * if(extracted.contains("(")) { extracted=extracted.replace("(","");
			 * extracted=extracted.replace(")","");
			 * 
			 * } System.out.println(extracted); //System.exit(0);
			 * 
			 * }
			 */
		}
		
		System.out.println(extracted);
		
		// String
		// y=input.replace(input.substring(input.indexOf('(')+1,input.lastIndexOf(')')),
		// extracted);
		//String h[] = extracted.split("");
		if(extracted.matches(".*\\d+.*")) {
		expand(extracted.trim());}
		else {
			if(extracted.contains("(")) {
				 extracted=extracted.replace("(","");
				extracted=extracted.replace(")","");
				System.out.println(extracted);
			}
			System.out.println(extracted);
			System.exit(0);
		}

	}

}
