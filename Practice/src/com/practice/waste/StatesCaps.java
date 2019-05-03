package com.practice.waste;

import java.util.Arrays;

public class StatesCaps {
	public static void main(String[] args) {
		StatesCaps sc=new StatesCaps();
		
		String a[]= {"Andra","Taminadu","kerala","karnataka","Assam","ArunachalPradesh"};
		sc.caps(a);
		
	}

	private void caps(String[] a) {
		int l=a.length;

		String sd[]=new String[l];
		for (int i = 0; i <l; i++) {
			if(a[i].startsWith("A"))
			{
				String s=a[i].toUpperCase();
			//	System.out.println(a[i].toUpperCase());
				sd[i]=s;
			}else{
				sd[i]=a[i];
			}
			
		}
		Arrays.sort(sd);
		for (String string : sd) {
			System.out.println(string);
		}
		
	}

}
