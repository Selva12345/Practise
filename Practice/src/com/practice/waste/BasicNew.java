package com.practice.waste;

import java.util.Vector;

public class BasicNew {
	public static void main(String[] args) {
		Vector v= new Vector();
		v.add("Johny Depp");
		StringBuffer str=new StringBuffer("D&G");
		String ftr=new String("hi");
		ftr=ftr.concat(" Paul Walker");
		str.append(" cK");
		Character s='a';
		Character ch = new Character('a');
		char p='a';
		if(s.equals(ch)) {
			System.out.println("success \n"+ftr);
			
		}
		if(s==ch) {
			System.out.println(" success wow "+str);
		}
	}

}
